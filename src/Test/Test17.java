package Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Test17 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader=new InputStreamReader(new FileInputStream("D:\\DataScience\\gbk.txt"),"gbk");
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(new FileOutputStream("D:\\DataScience\\utf8.txt"), StandardCharsets.UTF_8);
        int len;
        if ((len=inputStreamReader.read())!=-1){
            outputStreamWriter.write(len);
        }
        outputStreamWriter.close();
        inputStreamReader.close();


    }
}
