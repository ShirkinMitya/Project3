package Calculations;

import Objects.Company;
import Objects.Country;
import Objects.Reactor;
import Service.Storage;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.TreeMap;
import javax.swing.table.DefaultTableModel;

public class Aggregation {

    public DefaultTableModel countiesAggregation(Storage storage) {
        Object[] nameColums = {"Cтрана", "Объём ежигодного потребления,т.", "Год"};
        List<Object[]> data = new ArrayList<>();
        for (Country country : storage.getCountryList()) {
            List<ConsumptionForAggregation> consumptionEndList = new ArrayList<>();
            for (Reactor reactor : storage.getReactorList()) {
                if (Objects.equals(reactor.getCountry_id(), country.getCountry_id())) {
                    TreeMap<Integer, Float> sortMap = new TreeMap<>(reactor.getConsuptionPerYear());
                    for (Entry<Integer, Float> entry : sortMap.entrySet()) {
                        Optional<ConsumptionForAggregation> consumptionForAggregation = consumptionEndList.stream().filter(t -> entry.getKey().equals(t.getYear())).findFirst();
                        if (consumptionForAggregation.isPresent()) {
                            consumptionForAggregation.get().plus(entry.getValue());
                        } else {
                            ConsumptionForAggregation consumptionforAggregation = new ConsumptionForAggregation(country.getCountry_name(), entry.getValue(), entry.getKey());
                            consumptionEndList.add(consumptionforAggregation);
                        }
                    }
                }
            }
            for (ConsumptionForAggregation consumptionPerYear : consumptionEndList) {
                Object[] row = new Object[3];
                row[0] = consumptionPerYear.getKey();
                row[1] = consumptionPerYear.getKiumValue();
                row[2] = consumptionPerYear.getYear();
                data.add(row);
            }
        }
        Object[][] object = data.toArray(new Object[0][]);
        return new DefaultTableModel(object, nameColums);
    }
    
    public DefaultTableModel operatorAggregation(Storage storage) {
        Object[] nameColums = {"Oператор", "Объём ежигодного потребления,т.", "Год"};
        List<Object[]> data = new ArrayList<>();
        for (Company company : storage.getCompanyList()) {
            List<ConsumptionForAggregation> consumptionEndList = new ArrayList<>();
            for (Reactor reactor : storage.getReactorList()) {
                if (Objects.equals(reactor.getOperator_id(), company.getCompany_id())) {
                    TreeMap<Integer, Float> sortMap = new TreeMap<>(reactor.getConsuptionPerYear());
                    for (Entry<Integer, Float> entry : sortMap.entrySet()) {
                        Optional<ConsumptionForAggregation> consumptionForAggregation = consumptionEndList.stream().filter(t -> entry.getKey().equals(t.getYear())).findFirst();
                        if (consumptionForAggregation.isPresent()) {
                            consumptionForAggregation.get().plus(entry.getValue());
                        } else {
                            ConsumptionForAggregation consumptionforAggregation = new ConsumptionForAggregation(company.getCompany_name(), entry.getValue(), entry.getKey());
                            consumptionEndList.add(consumptionforAggregation);
                        }
                    }
                }
            }
            for (ConsumptionForAggregation consumptionPerYear : consumptionEndList) {
                Object[] row = new Object[3];
                row[0] = consumptionPerYear.getKey();
                row[1] = consumptionPerYear.getKiumValue();
                row[2] = consumptionPerYear.getYear();
                data.add(row);
            }
        }
        Object[][] object = data.toArray(new Object[0][]);
        return new DefaultTableModel(object, nameColums);
    }
    
     public DefaultTableModel regionsAggregation(Storage storage) {
        Object[] nameColums = {"Регионы", "Объём ежигодного потребления,т.", "Год"};
        List<Object[]> data = new ArrayList<>();
        for (Country country : storage.getCountryList()) {
            List<ConsumptionForAggregation> consumptionEndList = new ArrayList<>();
            for (Reactor reactor : storage.getReactorList()) {
                if (Objects.equals(reactor.getCountry_id(), country.getCountry_id())) {
                    TreeMap<Integer, Float> sortMap = new TreeMap<>(reactor.getConsuptionPerYear());
                    for (Entry<Integer, Float> entry : sortMap.entrySet()) {
                        Optional<ConsumptionForAggregation> consumptionForAggregation = consumptionEndList.stream().filter(t -> entry.getKey().equals(t.getYear())).findFirst();
                        if (consumptionForAggregation.isPresent()) {
                            consumptionForAggregation.get().plus(entry.getValue());
                        } else {
                            ConsumptionForAggregation consumptionforAggregation = new ConsumptionForAggregation(country.getCountry_name(), entry.getValue(), entry.getKey());
                            consumptionEndList.add(consumptionforAggregation);
                        }
                    }
                }
            }
            for (ConsumptionForAggregation consumptionPerYear : consumptionEndList) {
                Object[] row = new Object[3];
                row[0] = consumptionPerYear.getKey();
                row[1] = consumptionPerYear.getKiumValue();
                row[2] = consumptionPerYear.getYear();
                data.add(row);
            }
        }
        Object[][] object = data.toArray(new Object[0][]);
        return new DefaultTableModel(object, nameColums);
    }
   
}
