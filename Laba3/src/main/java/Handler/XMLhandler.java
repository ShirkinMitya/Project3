package Handler;

import Reactor.Reactor;
import Read.XMLreader;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLhandler extends BaseHandler {

    public XMLhandler() {
        super(".xml");
    }

    @Override
    public  List<Reactor> handleRequest(File file) throws IOException, MyException {
       if (canHandle(file)) {
            XMLreader xmlReader = new XMLreader();
            return xmlReader.read(file);
        } else {
            return super.handleRequest(file);
        }
    }
}
