package FileReader;

import ReactorType.ReactorType;
import java.io.File;
import java.io.IOException;
import java.util.List;

public interface Reader {

    public List<ReactorType> read(File file) throws IOException;
}
