package Day18.Object;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
对象流：
    对象输入流(反序列化)
    对象输出流(序列化)
ObjectOutputStream
    类的特点：将 Java 对象Java对象的属性和行为写入 OutputStream。
    类的位置：java.io
    类的构造器：
        public ObjectOutputStream(OutputStream out)
              ·创建写入指定 OutputStream 的 ObjectOutputStream。
    类的方法：
        public final void writeObject(Object obj)
               将指定的对象写入 ObjectOutputStream。
    实现序列化的步骤：
        1.在实现序列化操作的类实现Serializable接口
        2.测试类中创建对象输出流对象
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));

        //写出数据 对象
        Student student1 = new Student("张三", 18);
        objectOutputStream.writeObject(student1);

        objectOutputStream.close();
    }
}
