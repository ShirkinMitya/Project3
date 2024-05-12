package Handler;

import FileReader.ReaderXML;

public class XMLhandler extends BaseHandler {

    public XMLhandler() {
        super(".xml", new ReaderXML());
    }
}
