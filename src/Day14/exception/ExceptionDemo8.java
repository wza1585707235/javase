package Day14.exception;
/*
自定义异常：
    自定义编译时异常：
        1.定义自定义异常类
        2.让自定义异常类继承exception类
        3.生成构造器
    自定义运行时异常:
        1.定义自定义异常类
        2.让自定义异常类继承RuntimeException
        3.生成构造器
 */
public class ExceptionDemo8 {
    public static void main(String[] args) {
        method();
    }
    public static void method(){
        try {
            throw new MyException("自定义编译异常类");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
