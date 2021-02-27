package Day21.reflect6;

import java.io.IOException;
import java.util.Properties;
import java.util.Set;
/*
获取ClassLoader的两种方式：
    通过class对象的实例方法
    通过ClassLoader类的静态方法
 */
public class Demo6 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(Demo6.class.getClassLoader().getResourceAsStream("Day21/reflect6/pro.properties"));
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(properties.getProperty(string));
        }
    }
}
