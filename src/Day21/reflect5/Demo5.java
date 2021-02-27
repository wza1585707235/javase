package Day21.reflect5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.Set;

//回顾属性集：配置文件
/*

 */
public class Demo5 {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();
        properties.load(new FileInputStream("javase\\src\\Day21\\reflect5\\pro.properties"));
        Set<String> strings = properties.stringPropertyNames();
        System.out.println(strings);
    }

}
