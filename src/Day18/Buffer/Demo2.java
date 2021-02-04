package Day18.Buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
缓冲字符流
    缓冲字符输入流
        类的特点：从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
        类的位置：java.io
        类的构造器：
            public BufferedReader(Reader in)
                创建一个使用默认大小输入缓冲区的缓冲字符输入流。
        类的方法：
            public String readLine()throws IOException
                读取一个文本行
    缓冲字符输出流
        类的特点：将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。
        类的位置：java.io
        类的构造器：
            public BufferedWriter(Writer out)
                创建一个使用默认大小输出缓冲区的缓冲字符输出流。
        类的方法：
            public void newLine()
                写入一个行分隔符。

 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new FileReader("a.txt"));
        String len;
        while ((len=bufferedReader.readLine())!=null){
            System.out.println(len);
        }

    }
}
