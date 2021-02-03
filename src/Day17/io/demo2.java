package Day17.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件流：称之为四大基本流
FileOutputStream文件字节输出流
    类的特点：通过字节为单位，对文件做输出功能的工具类
    类的位置：io
    类的构造器：
        public FileOutputStream(String name)
            创建一个向具有指定名称的文件中写入数据的输出文件流。
        public FileOutputStream(String name, boolean append)
            创建一个向具有指定 name 的文件中写入数据的输出文件流
    类的方法：
        public void close()关闭此文件输出流并释放与此流有关的所有系统资源
        public void write(byte[] b)
          将 b.length 个字节从指定 byte 数组写入此文件输出流中。
        public void write(int b)
           将指定字节写入此文件输出流。实现 OutputStream 的 write 方法。
 */
public class demo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("a.txt");
        //一次写一个字节
        fileOutputStream.write(97);
        fileOutputStream.write(98);
        fileOutputStream.write(99);
        //一次写一个字节数组
        fileOutputStream.write("abc".getBytes());
        //一次写一个指定范围内的字符串
        fileOutputStream.write("abcdefg".getBytes(),1,4);
        fileOutputStream.close();
    }
}
