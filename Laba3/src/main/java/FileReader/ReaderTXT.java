package FileReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class ReaderTXT {

    public String read(String fileName) throws IOException{
        ClassLoader classLoader = getClass().getClassLoader();
        StringBuilder content = new StringBuilder();
        try (InputStream inputStream = classLoader.getResourceAsStream(fileName); 
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
       return content.toString();
    }
}


    