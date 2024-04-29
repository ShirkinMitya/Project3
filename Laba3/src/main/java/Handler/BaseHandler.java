package Handler;

import Reactor.Reactor;
import Read.Reader;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public abstract class BaseHandler implements Handler {

    protected Handler next;
    protected String supportedExtension;
    protected Reader reader;

    public BaseHandler(String supportedExtension, Reader read) {
        this.supportedExtension = supportedExtension;
        this.reader = reader;
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
        if(canHandle(file)){
            return reader.read(file);
        }
        if (next != null) {
            return next.handleRequest(file);
        } else {
            throw new MyException("Не подходящий формат файла");
        }
    }
}
