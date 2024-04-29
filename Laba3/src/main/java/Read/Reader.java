package Read;

import Reactor.Reactor;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Reader {

    public List<Reactor> read(File file) throws IOException;
}
