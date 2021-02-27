package Day21.java8Demo2;
/*
lambda表达式：
学习目的：
    在实际应用中，API含有大量的参数是接口的方法，在调用该方法时需要传递匿名内部类，但是过程比较麻烦
    为了优化这一过程，java8新增了lambda表达式，在调用方法时可以不用再传递匿名内部类了，直接传递该匿名内部类的简化格式即可

lambda表达式的使用前提条件：
    1.代码需要可以写成匿名内部类的形式

lambda表达式的格式：
    ( ) -> { }
    ():重写接口中抽象方法的形参列表
    ->：将参数传递给{}
    {}：重写接口中抽象方法的方法体
 */
public class Demo2 {
    public static void main(String[] args) {
        //使用匿名内部类创建多线程对象
        test02();
    }

    private static void test02() {
        Runnable runnable = () -> {
            for (int i = 1; i <=30; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            }
        };
        Thread thread=new Thread(runnable,"自定义线程");
        thread.start();
    }

    private static void test01(){
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <=30; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        };
        Thread t=new Thread(runnable,"自定义线程");
        t.start();
    }
}
