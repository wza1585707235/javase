package Day14.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
异常声明的注意事项：继承
    1.异常类有继承关系
        a.方法声明多个异常时，异常名没有前后顺序区分
        b.异常的声明可以直接声明成父类异常，省略子类异常(多态)
        c.如果方法声明的多个异常没有继承关系，当声明的异常超过3个的时候，为了提高代码整体的简洁性和阅读性，可以直接声明exception
    2.非异常类存在子父类关系，其中的方法存在异常
        a.异常在父类被重写的方法中：当子类重写父类这个含有异常的方法时，无需理会父类的异常
        b.异常在子类重写的方法中：子类重写的方法的处理方法只有唯一的一种，异常的捕获(多线程)


    FileNotFoundException文件找不到异常。是io异常的子类
 */
public class ExceptionDemo4 {
    public static void main(String[] args) {

    }
    public static void method(int a,int b)throws IOException,FileNotFoundException{
        if (a==1){
            throw new IOException("自定义IO异常");
        }
        if (b==1){
            throw new FileNotFoundException("文件找不到异常");
        }
    }
}
