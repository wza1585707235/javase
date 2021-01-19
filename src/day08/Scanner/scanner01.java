package day08.Scanner;
/*
scanner类：类的特点：针对基本数据类型和字符串类型实现键盘录入的工具类
           类的位置：util
           类的构造器：public Scanner(InputStream source)
           类的方法:
          使用步骤：1.导包 2.创建scanner对象 3.调用合适的键盘录入方法 4.关闭资源

          注意事项：键盘录入的数据必须是该数据类型的取值范围内的数据，如果不是，报错
          关闭资源：sc.close();

          1.next()方法和七个键盘录入基本数据类型的方法只读取数据值，不读取回车字符
          在使用nextline方法的时候，前面不能使用next()方法或者nextxxx()方法
          解决方法：键盘录入可以清一色使用next()
                    避免在nextline()前面使用next或nextxxx()
                    在使用nextline之前，给键盘录入对象重新赋值
           2.next()遇到空白符号不再进行录入
 */
public class scanner01 {
}
