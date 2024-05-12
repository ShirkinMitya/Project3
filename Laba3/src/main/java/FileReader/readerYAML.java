package FileReader;


import ReactorType.ReactorType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ReaderYAML implements Reader {

    @Override
    public List<ReactorType> read(File file) throws IOException {
        YAMLMapper yamlMapper = new YAMLMapper();
        Map<String, ReactorType> reactorMap = yamlMapper.readValue(file,
                new TypeReference<Map<String, ReactorType>>() {
        });
        List<ReactorType> reactorlist = new ArrayList<>(reactorMap.values());
        for (ReactorType reactor : reactorlist) {
            reactor.setSource("YAML");
        }
        return reactorlist;
    }
}
