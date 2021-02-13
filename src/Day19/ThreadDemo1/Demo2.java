package Day19.ThreadDemo1;
/*
线程的第一种开启方式
    1.创建自定义线程类，让这个类继承Thread
    2.在自定义线程类中重写run()
    3.在测试类中创建合适数量的线程类 对象
    4.开启线程
 */
public class Demo2 {
    public static void main(String[] args) {
        MyThread my1 = new MyThread("自定义1");
        MyThread my2 =new MyThread("自定义2");

        my1.start();
        my2.start();
    }
}
