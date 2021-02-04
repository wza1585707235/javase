package Day18.bytechar;

import java.io.*;

/*
字符编码:
    编码：字符(看的懂得)==》字节(看不懂的)
    解码：字节(看不懂的)==》字符(看的懂的)
    编码和解码的规则必须一样，如果不一样，出现乱码的情况

InputStreamReader
    类的特点：字节流通向字符流的桥梁
    类的位置：java.io
    类的构造器：
        public InputStreamReader(InputStream in)创建一个使用默认字符集的 InputStreamReader。
        public InputStreamReader(InputStream in, String charsetName)
                  throws UnsupportedEncodingException创建使用指定字符集的 InputStreamReader。
    类的方法：getEncoding()返回流的编码
OutputStreamWriter
    类的特点：
       OutputStreamWriter 是字符流通向字节流的桥梁
    类的位置：java.io
    类的构造器：
        public OutputStreamWriter(OutputStream out)创建使用默认字符编码的 OutputStreamWriter。
        public OutputStreamWriter(OutputStream out,String charsetName)
                   throws UnsupportedEncodingException创建使用指定字符集的 OutputStreamWriter。
    类的方法

 */
public class Demo1 {
    public static void main(String[] args) throws IOException {

        test02();
    }

    public static void test02() throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("D:\\DataScience\\gbk.txt"),"gbk");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("D:\\DataScience\\utf8.txt"));
        int len;
        while ((len=inputStreamReader.read())!=-1){
            outputStreamWriter.write(len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();
    }

//    private static void test01() throws IOException {
//        FileReader fileReader = new FileReader("a.txt");
//        int len;
//        while((len=fileReader.read())!=-1){
//            System.out.println((char)len);
//        }
//        fileReader.close();
//    }
}
