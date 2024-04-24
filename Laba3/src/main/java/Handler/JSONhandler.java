package Handler;

import Read.JSONreader;
import Service.MyException;
import Service.Storage;
import java.io.File;
import java.io.IOException;

public class JSONhandler extends BaseHandler {

    public JSONhandler(Storage storage) {
        super(storage);
    }

    @Override
    public void handleRequest(File file) throws IOException, MyException {
        if (file.getAbsolutePath().endsWith(".json")) {
            JSONreader jsonReader = new JSONreader();
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
