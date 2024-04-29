package Handler;

import Reactor.Reactor;
import Read.YAMLreader;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class YAMLhandler extends BaseHandler {

    public YAMLhandler() {
        super(".yaml");
    }

    @Override
    public  List<Reactor> handleRequest(File file) throws IOException, MyException {
        if (canHandle(file)) {
            YAMLreader yamlReader = new YAMLreader();
            return yamlReader.read(file);
        } else {
            return super.handleRequest(file);
        }
    }
}
