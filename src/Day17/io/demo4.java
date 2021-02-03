package Day17.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream类 文件字节输入流
    类的特点：通过字节为单位对文件做输入功能的工具类
    类的位置：java.io
    类的构造器：
        public FileInputStream(String name)throws FileNotFoundException
            通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定
    类的方法：
        public void close()
           关闭此文件输入流并释放与此流有关的所有系统资源。

        public int read()
           从此输入流中读取一个数据字节
        public int read(byte[] b)
           从此输入流中将最多 b.length 个字节的数据读入一个 byte 数组中。

    图片的复制;
        1.创建文件字节输入流对象
        2.创建文件字节输出流对象
        3.通过一次读取一个字节数组的方式进行读写操作
        4.关闭资源

 */
public class demo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        int len;
//        while ((len=fileInputStream.read())!=-1){
//            System.out.println(len);
//        }
        //一次读取一个字节数组
        byte[] bytes=new byte[8];
        System.out.println(fileInputStream.read(bytes));
        while ((len=fileInputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fileInputStream.close();

    }
}
