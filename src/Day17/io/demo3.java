package Day17.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件的续写和换行
在windows中
回车：将光标移动到这一行的行首
换行：将光标移动到下一行
 */
public class demo3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("a.txt",true);

        //回车换行的操作
        fileOutputStream.write("\r\n".getBytes());
        fileOutputStream.write("abc".getBytes());
        fileOutputStream.close();
    }
}
