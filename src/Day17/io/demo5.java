package Day17.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class demo5 {
    public static void main(String[] args) throws IOException {
        test01();
    }

    private static void test01() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("D:\\Resource\\1585707235\\Image\\Group2\\94\\FT\\94FTLLS2`I(DP8SN56W~3LO.jpg");
        FileOutputStream fileOutputStream=new FileOutputStream("D:\\DataScience\\a.jpg");
        int len;
        byte[] bytes=new byte[1024];
        while((len=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes);
        }
        fileOutputStream.close();
        fileInputStream.close();

    }
}
