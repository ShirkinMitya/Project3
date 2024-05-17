package Calculations;

import Objects.Kium;
import Objects.Reactor;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumptionOneReactor {

    public void calculateConsumption(List<Reactor> reactorList, List<Kium> kiumList) {
        for (Reactor reactor : reactorList) {
            if (reactor.getStatus().equals("Operational")) {
                calculateConsumptionAllYears(reactor, kiumList, null);
            } else if (reactor.getStatus().equals("Suspended Operation")
                    || reactor.getStatus().equals("Permanent Shutdown")) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(reactor.getDate_shutdown());
                int yearShutdown = calendar.get(Calendar.YEAR);
                calculateConsumptionAllYears(reactor, kiumList, yearShutdown);
            }
        }
    }

    private void calculateConsumptionAllYears(Reactor reactor, List<Kium> kiumList, Integer endYear) {
        if (endYear == null) {
            endYear = 2024;
        }
        Map<Integer, Float> consumptionPerYear = new HashMap<>();
        int startYear = 2014;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(reactor.getFirst_grid_connection());
        int firstGridConnectionYear = calendar.get(Calendar.YEAR);
        if (firstGridConnectionYear >= 2014 && firstGridConnectionYear <= 2024) {
            startYear = firstGridConnectionYear;
            consumptionPerYear.put(startYear, reactor.getFirst_load());
            startYear += 1;
        }
        List<Kium> sortedKiumList = kiumList.stream().filter(x -> x.getReactor_id() == reactor.getId()).toList();
        for (int year = startYear; year <= endYear; year++) {
            float consumption = reactor.getTermal_capacity() / reactor.getBurnup() * getKiumValueForYear(reactor.getId(), year, kiumList);
            consumptionPerYear.put(year, consumption);
        }
        reactor.setConsuptionPerYear(consumptionPerYear);
    }

    private float getKiumValueForYear(int reactorId, int year, List<Kium> kiumList) {
        for (Kium kium : kiumList) {
            if (kium.getReactor_id() == reactorId && kium.getKium_year() == year) {
                return kium.getKium_value() / 100;
            }
        }
        if (year <= 2024) {
            return 0.85f;
        }
        return 0;
    }
}
