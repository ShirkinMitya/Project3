package Read;

import Reactor.Reactor;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONreader implements Reader {

    @Override
    public List<Reactor> read(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Reactor> reactorlist = objectMapper.readValue(file,
                objectMapper.getTypeFactory().constructCollectionType(List.class, Reactor.class));
        for (Reactor reactor : reactorlist) {
            reactor.setSource("JSON");
        }
        return reactorlist;
    }
}
