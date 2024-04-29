package Handler;

import Reactor.Reactor;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class BaseHandler implements Handler {

    protected Handler next;
    protected String supportedExtension;

    public BaseHandler(String supportedExtension) {
        this.supportedExtension = supportedExtension;
    }

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }

    @Override
    public boolean canHandle(File file) {
        return file.getAbsolutePath().endsWith(supportedExtension);
    }

    @Override
    public List<Reactor> handleRequest(File file) throws IOException, MyException {
        if (next != null) {
            return next.handleRequest(file);
        } else {
            throw new MyException("Не подходящий формат файла");
        }
    }
}
