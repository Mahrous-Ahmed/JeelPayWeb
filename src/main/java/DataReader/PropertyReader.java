package DataReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {
    private Properties properties;
    private FileInputStream FIS;

    public PropertyReader(String filePath) throws IOException {
        properties = new Properties();
        FIS = new FileInputStream(filePath);
        properties.load(FIS);
    }


    public String getProperty(String key){
       return properties.getProperty(key);
    }




}
