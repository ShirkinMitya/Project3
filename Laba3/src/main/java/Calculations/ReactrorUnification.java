package Calculations;

import Objects.Reactor;
import ReactorType.ReactorType;
import Service.Storage;
import java.util.List;
import java.util.Map;
import static java.util.Map.entry;

public class ReactrorUnification {

    Map<String, String> classes = Map.ofEntries(entry("PHWR", "PHWR"),
            entry("PWR", "PWR"),
            entry("BWR", "BWR"),
            entry("LWGR", "RBMK"),
            entry("GCR", "MANGOX"),
            entry("FBR", "BN"));

    public void unification(Storage storage) {
        List<ReactorType> listReactorType = storage.getReactorType().entrySet().iterator().next().getValue();
        if (listReactorType == null) {
            return;
        }
        for (Reactor reactorsDB : storage.getReactorList()) {
            String reactorFileclass = classes.get(reactorsDB.getClas());
            System.out.println(reactorFileclass);
            if (reactorFileclass != null) {
                for (ReactorType reactorsFile : listReactorType) {
                    if (reactorsFile.getType().equals(reactorFileclass)) {
                        reactorsDB.setBurnup(reactorsFile.getBurnup());
                        reactorsDB.setFirst_load(reactorsFile.getFirst_load());
                        break;
                    }
                }
            }
        }
    }

}
