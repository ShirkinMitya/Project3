package Handler;

import Read.JSONreader;

public class JSONhandler extends BaseHandler {

    public JSONhandler() {
        super(".json", new JSONreader());
    }

    // @Override
    // public List<Reactor> handleRequest(File file) throws IOException, MyException {
}
