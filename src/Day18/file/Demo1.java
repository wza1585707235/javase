package Day18.file;

import java.io.*;

/*
字节流：
    适合图片，视频，音频等文件
字符流：
    适合文本文件
字节流可以读取文本文件？ true 大概率无法看
字符流可以读取图片，视频，音频等文件？ true，大概率无法看
文件的字符输入流
 *      类的特点
 *          用来读取字符文件的便捷类。
 *      类的位置
 *          java.io
 *      类的构造器
 *          public FileReader(String fileName)
 *              在给定从中读取数据的文件名的情况下创建一个新 FileReader。
 *      类的方法
 *          public void close()
 *              关闭该流并释放与之关联的所有资源。
 *          public int read()
 *              读取单个字符。
 *          public int read(char[] cbuf)
 *              将字符读入数组
 *          public String getEncoding()
 *              返回此流使用的字符编码的名称。

文件字符输出流的注意事项：
    如果在文本文件中正常显示内容的话，必须刷新
    close()：
        1.刷新缓冲区
        2.关闭资源
    flush()：
        刷新缓冲区
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("a.txt");
        FileWriter fileWriter = new FileWriter("b.txt");
        int len;
        char[] chars=new char[2];
        while ((len=fileReader.read(chars))!=-1){
            fileWriter.write(chars,0,len);
        }
        fileWriter.flush();
        fileReader.close();
    }
}
