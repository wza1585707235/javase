package Day18.Buffer;

import java.io.*;

/*
缓冲流(高效流)
    BufferedInputStream缓冲字节输入流
    BufferedOutputStream缓冲字节输出流
    BufferedReader缓冲字符输入流
    BufferedWriter缓冲字符输出流



BufferedInputStream缓冲字节输入流
    类的特点：为另外输入流添加一些功能，成为高效流的工具类
    类的位置:java.io
    类的构造器：
        public BufferedInputStream(InputStream in)
            创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
BufferedOutputStream缓冲字节输出流
    类的特点：为另外输入流添加一些功能，成为高效流的工具类
    类的位置:java.io
    类的构造器：
        public BufferedOutputStream(OutputStream out)
            创建一个新的缓冲输出流，以将数据写入指定的底层输出流。


高效流为什么高效：
    在源码的底层缓冲了一个长度为8192的字节数组
高效流的使用场景：
    1.无论使用普通文件流还是高效流
        优先使用数组的方式提高效率
    2.缓冲字节流在实际应用中很少使用，优先使用普通的文件字节流(8192数组)进行读写文件
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        long start=System.currentTimeMillis();
        test01();
        long end=System.currentTimeMillis();
        System.out.println(end - start);
    }

    private static void test01() throws IOException {
        FileInputStream fileInputStream=new FileInputStream("a.txt");
        FileOutputStream fileOutputStream=new FileOutputStream("b.txt");
        BufferedInputStream bufferedInputStream=new BufferedInputStream(fileInputStream);
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        int len;
        byte[] bytes=new byte[8192];
        while ((len=bufferedInputStream.read(bytes))!=-1){
            bufferedOutputStream.write(bytes,0,len);
        }
        bufferedOutputStream.close();
        bufferedInputStream.close();
        fileOutputStream.close();
        fileInputStream.close();
    }
}
