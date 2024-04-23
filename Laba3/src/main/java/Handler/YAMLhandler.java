package Handler;

import Read.YAMLreader;
import Service.MyException;
import Service.Storage;
import java.io.File;
import java.io.IOException;

public class YAMLhandler extends BaseHandler {

    public YAMLhandler(Storage storage) {
        super(storage);
    }

    @Override
    public void handleRequest(File file) throws IOException, MyException {
        if (file.getAbsolutePath().endsWith(".yaml")) {
            YAMLreader jsonReader = new YAMLreader();
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
