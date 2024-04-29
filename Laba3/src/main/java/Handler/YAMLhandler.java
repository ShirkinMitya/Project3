package Handler;

import Read.YAMLreader;

public class YAMLhandler extends BaseHandler {

    public YAMLhandler() {
        super(".yaml", new YAMLreader());
    }
}
