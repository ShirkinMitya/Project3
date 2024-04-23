package Read;

import Reactor.Reactor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class YAMLreader implements Reader {

    @Override
    public List<Reactor> read(File file) throws IOException {
         YAMLMapper yamlMapper = new YAMLMapper();
        Map<String, Reactor> reactorMap = yamlMapper.readValue(file,
                new TypeReference<Map<String,Reactor>>(){});
        List<Reactor> reactorlist = new ArrayList<>(reactorMap.values());
        for(Reactor reactor:reactorlist ){
           reactor.setSource("YAML");
        }
        return reactorlist;
        
      

    }

}
