package Handler;

import FileReader.ReaderYAML;

public class YAMLhandler extends BaseHandler {

    public YAMLhandler() {
        super(".yaml", new ReaderYAML());
    }
}
