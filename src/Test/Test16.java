package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Test16 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("info.properties"));
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(properties.getProperty(string));
        }
    }

}
