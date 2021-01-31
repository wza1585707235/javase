package Day14.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
异常捕获的注意事项：
    1.异常类有继承关系
        a.可以分别捕获，分别处理
        b.可以一次捕获，分别处理
            当catch分别处理，注意不要将父类的异常处理写到上面，正确处理从子类开始
        c.可以一次捕获一次处理
    2.非异常类有继承关系，方法中存在异常
        异常存在于父类被重写的方法中：当子类重写父类这个含有异常的方法时，无需理会
        异常存在子类重写的方法中：异常的捕获
 */
public class ExceptionDemo6 {
    public static void main(String[] args) {
        method01(1, 2);
    }

    public static void method01(int a, int b) {
        try {
            if (a == 1) {
                throw new FileNotFoundException("自动逸文件找不到异常");
            }
            if (b == 2) {
                throw new IOException("自定义io异常");
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件异常的解决方案");
        } catch (IOException e) {
            System.out.println("io异常的解决方案");
        }
    }
}
