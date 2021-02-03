package Day17.file;

import java.io.File;
import java.util.Arrays;

/*
常用方法
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
 */
public class Demo2 {
    public static void main(String[] args) {
        File file = new File("D:\\DataScience\\abc\\a.txt");
        //获取文件的大小
        System.out.println(file.length());
        System.out.println(file.exists());
        //判断该路径是否为文件
        System.out.println(file.isFile());
        File file1 = new File("D:\\develop\\Java\\jdk1.8.0_202");
        //以字符串数组的形式进行返回
        System.out.println(file1.list());
        String[] list=file1.list();
        for (String s : list) {
            System.out.println(s);
        }
        File[] files = file1.listFiles();
        for (File file2 : files) {
            System.out.println(file2);
            if (file2.isFile()) {
                System.out.println(file2);
            }
        }
        show(file1);

    }

    public static void show(File file) {
        File[] files = file.listFiles();
        for (File Inner_file : files) {
            if (!Inner_file.isFile()) {
                show(Inner_file);
                System.out.println("目录"+Inner_file);
            } else System.out.println("文件"+Inner_file);
        }
    }
}
