package Handler;

import Read.XMLreader;
import Service.MyException;
import Service.Storage;
import java.io.File;
import java.io.IOException;

public class XMLhandler extends BaseHandler {

    public XMLhandler(Storage storage) {
        super(storage);
    }

    @Override
    public void handleRequest(File file) throws IOException, MyException {
        if (file.getAbsolutePath().endsWith(".xml")) {
            XMLreader jsonReader = new XMLreader();
            storage.getReactors().put(file.getName(), jsonReader.read(file));
        } else {
            if (next != null) {
                next.handleRequest(file);
            } else {
                throw new MyException("Не подходящий формат файла");
            }
        }
    }

}
