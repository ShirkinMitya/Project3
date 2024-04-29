package Handler;

import Read.XMLreader;

public class XMLhandler extends BaseHandler {

    public XMLhandler() {
        super(".xml", new XMLreader());
    }
}
