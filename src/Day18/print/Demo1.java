package Day18.print;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
标准输入流：System.in
标准输出流：System.out
printstream类：
    类的特点：PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
    类的位置：java.io
    类的构造器：
        public PrintStream(String fileName)
            创建具有指定文件名称且不带自动行刷新的新打印流。



public static void setOut(PrintStream out)重新分配“标准”输出流。 System类下
 */
public class Demo1 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream("print.txt");

        System.setOut(printStream);
        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(i+"*"+j+"="+i*j);
            }
            System.out.println();
        }
    }
}
