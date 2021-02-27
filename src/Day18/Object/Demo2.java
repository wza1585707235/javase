package Day18.Object;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/*
ObjectInputStream
    类的特点：ObjectInputStream 对以前使用 ObjectOutputStream 写入的基本数据和对象进行反序列化。
    类的位置：java.io
    类的构造器：public ObjectInputStream(InputStream in)
                  创建从指定 InputStream 读取的 ObjectInputStream
    类的方法：public final Object readObject()
                    从 ObjectInputStream 读取对象。

实现反序列化的步骤：
    1.在实现序列化操作的类实现Serializable接口
    2.在测试类中创建对象输入流对象
    3.通过对象输入流对象进行对象的获取
    4.针对对象操作
    5.关闭资源

思考：
    在实际操作过程中，不可能是一个对象，该怎么办
        需要将多个对象存储到一个集合中(例如：arraylist)
 */
public class Demo2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("object.txt"));
        Object obj=objectInputStream.readObject();
        Object obj1=objectInputStream.readObject();
        System.out.println(obj);
        System.out.println(obj1);
        objectInputStream.close();
    }
}
