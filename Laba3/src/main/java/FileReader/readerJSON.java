package FileReader;

import ReactorType.ReactorType;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReaderJSON implements Reader {

    @Override
    public List<ReactorType> read(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<ReactorType> reactorlist = objectMapper.readValue(file,
                objectMapper.getTypeFactory().constructCollectionType(List.class, ReactorType.class));
        for (ReactorType reactor : reactorlist) {
            reactor.setSource("JSON");
        }
        return reactorlist;
    }
}
