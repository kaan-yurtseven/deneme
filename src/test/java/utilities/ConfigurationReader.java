package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    public static String get(String str) throws IOException {
        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/configuration.properties");
        Properties pr = new Properties();
        pr.load(file);
        return (String) pr.get(str);
    }
}
