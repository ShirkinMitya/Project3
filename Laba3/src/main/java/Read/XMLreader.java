package Read;

import Reactor.Reactor;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLreader implements Reader {

    @Override
    public List<Reactor> read(File file) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        List<Reactor> reactorlist = xmlMapper.readValue(file,
                xmlMapper.getTypeFactory().constructCollectionType(List.class, Reactor.class));
        for(Reactor reactor: reactorlist){
           reactor.setSource("XML");
        }
        return reactorlist;

    }

}
