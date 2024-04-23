package Handler;

import Service.MyException;
import java.io.File;
import java.io.IOException;

public interface Handler {

    public void setNext(Handler next);

    public abstract void handleRequest(File file) throws IOException, MyException;

}
