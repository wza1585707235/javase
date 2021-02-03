package Day17.file;

import java.io.File;

/*
File类
    类的特点：文件和目录(文件夹)路径名 抽象的表示形式
    类的位置:java.io.file
    类的构造器：public File(String pathname)
                    通过将给定路径名字符串转换为抽象路径名来创建一个新 File 实例。
    类的方法：public String getAbsolutePath()
                返回此抽象路径名的绝对路径名字符串。
              public String getPath()
                将此抽象路径名转换为一个路径名字符串。
              public long length()
                返回由此抽象路径名表示的文件的长度
              public boolean exists()
                测试此抽象路径名表示的文件或目录是否存在。
              public boolean isFile()
                测试此抽象路径名表示的文件是否是一个标准文件。
              public String[] list()
                返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中的文件和目录。
              public File[] listFiles()
                返回一个抽象路径名数组，这些路径名表示此抽象路径名表示的目录中的文件。

相对路径和绝对路径
    绝对路径：从盘符开始是一个完整的路径
    相对路径：相对于项目路径而言，是一个可能发生变化的路径(推荐)
 */
public class Demo1 {
    public static void main(String[] args) {
        //创建file文件或文件夹对象
        File file = new File("D:\\DataScience\\abc");
        System.out.println(file);
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());

    }
}
