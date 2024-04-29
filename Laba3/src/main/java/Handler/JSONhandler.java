package Handler;

import Reactor.Reactor;
import Read.JSONreader;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONhandler extends BaseHandler {

    public JSONhandler() {
        super(".json");
    }

    @Override
    public List<Reactor> handleRequest(File file) throws IOException, MyException  {
        if (canHandle(file)) {
            JSONreader jsonReader = new JSONreader();
            return jsonReader.read(file);
        } else {
            return super.handleRequest(file);
        }
    }
}
