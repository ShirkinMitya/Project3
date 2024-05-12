package Handler;

import FileReader.ReaderJSON;

public class JSONhandler extends BaseHandler {

    public JSONhandler() {
        super(".json", new ReaderJSON());
    }
}
