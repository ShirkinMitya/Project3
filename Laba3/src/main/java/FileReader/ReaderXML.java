package FileReader;

import ReactorType.ReactorType;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReaderXML implements Reader {

    @Override
    public List<ReactorType> read(File file) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();
        List<ReactorType> reactorlist = xmlMapper.readValue(file,
                xmlMapper.getTypeFactory().constructCollectionType(List.class, ReactorType.class));
        for (ReactorType reactor : reactorlist) {
            reactor.setSource("XML");
        }
        return reactorlist;
    }
}
