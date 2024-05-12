package Handler;

import ReactorType.ReactorType;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Handler {

    public void setNext(Handler next);

    public boolean canHandle(File file);

    public List<ReactorType> handleRequest(File file) throws IOException, MyException;

}
