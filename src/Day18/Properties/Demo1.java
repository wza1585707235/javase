package Day18.Properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

/*
类的特点：Properties表示一个持久的属性集
类的位置：java.util
类的构造器：无参
类的方法：
    public void load(InputStream inStream)
          从输入流中读取属性列表（键和元素对）。
    public void load(Reader reader)
          按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
    public Set<String> stringPropertyNames()
        返回此属性列表中的键集，其中该键及其对应值是字符串，如果在主属性列表中未找到同名的键，则还包括默认属性列表中不同的键
    public String getProperty(String key)
        用指定的键在此属性列表中搜索属性
获取属性集内容步骤
    1.确定属性集文件
        一般情况下后缀名properties，里面的内容以键值对的形式进行存储
    2.创建属性集对象
    3.在流中加载该文件
    4.通过对象获取属性的键集

 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("pro.properties"));
//        Set<Object> keyset = properties.keySet();
//        for (Object o : keyset) {
//            System.out.println(o);
//        }
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string+properties.getProperty(string));
        }
    }
}
