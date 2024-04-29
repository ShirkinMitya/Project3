package Service;

import Reactor.Reactor;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private Map<String, List<Reactor>> reactors = new HashMap<>();

    public Map<String, List<Reactor>> getReactors() {
        return reactors;
    }
}
