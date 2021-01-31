package Day14.exception;

import java.io.IOException;

/*
异常捕获的好处：
    1.避免在异常声明时对主方法的依赖
    2.在异常声明时，大部分情况交给JVM，JVM会让我们的程序停止，异常的捕获，可以给其解决方法，让程序继续运行

异常捕获的格式：
    try{
        可能存在异常的代码
    } catch(异常类型 对象名){
        解决方案
    }

执行流程：
    1.代码首先执行try里面的语句
    2.JVM会判断try里面的代码是否存在异常
    3.如果存在异常，终止try里面的代码执行，执行到对应的异常的解决方案（执行对应异常的catch里面的语句），代码继续执行
      如果不存在异常 ，当try里面的代码执行完毕后，不会执行catch里面的代码，代码会继续运行
 */
public class ExceptionDemo5 {
    public static void main(String[] args) {
        method(1);
    }
    public static void method(int a){
        System.out.println("kaishi");
        try{
            System.out.println("trykaishi");
            if (a==1){
                throw new IOException("自定义io异常");
            }
            System.out.println("tryjieshu");
        }catch (IOException e){
            System.out.println("io异常的解决方案");
        }
        System.out.println("jieshu");
    }
}
