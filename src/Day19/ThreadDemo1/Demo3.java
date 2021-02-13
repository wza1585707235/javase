package Day19.ThreadDemo1;
/*
开启线程的第二种方式
    1.创建接口runnable的实现类
    2.重写Runnable接口中的run()方法
    3.在测试类中创建Runnable接口的实现对象
    4.根据需要的线程数量，将Runnable接口的实现类创建Thread对象
 */
public class Demo3 {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable, "自定义1");
        Thread thread2 = new Thread(runnable, "自定义2");
        thread1.start();
        thread2.start();
    }
}
