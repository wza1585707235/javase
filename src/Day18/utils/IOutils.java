package Day18.utils;

import java.io.*;

/*
对外提供的静态方法
    1.字节流
        关闭输入流
        关闭输出流
        关闭输出流，再关闭输入流
        关闭输入流，再关闭输出流
    2.字符流
        关闭输入流
        关闭输出流
        关闭输出流，再关闭输入流
        关闭输入流，再关闭输出流
 */
public class IOutils {
    private IOutils(){}
    public static void close(InputStream inputStream) throws IOException {
        if (inputStream!=null){
            inputStream.close();
        }
    }
    public static void close(OutputStream outputStream) throws IOException {
        if (outputStream!=null){
            outputStream.close();
        }
    }
    public static void close(InputStream inputStream,OutputStream outputStream) throws IOException {
        try{
            close(inputStream);
        }catch (IOException ioException){

        }finally {
            close(outputStream);
        }
    }
    public static void close(OutputStream outputStream,InputStream inputStream) throws IOException {
        try{
            close(outputStream);
        }catch (IOException ioException){

        }finally {
            close(inputStream);
        }
    }

    public static void close(Writer writer) throws IOException {
        if (writer!=null){
            writer.close();
        }
    }
    public static void close(Reader reader) throws IOException {
        if (reader!=null){
            reader.close();
        }
    }
    public static void close(Writer writer,Reader reader) throws IOException {
        try{
            close(writer);
        }catch (IOException ioException){

        }finally {
            close(reader);
        }
    }
    public static void close(Reader reader,Writer writer) throws IOException {
        try{
            close(reader);
        }catch (IOException ioException){

        }finally {
            close(writer);
        }
    }
}
