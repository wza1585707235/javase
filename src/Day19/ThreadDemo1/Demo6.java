package Day19.ThreadDemo1;
/*
解决线程安全的方式：
    1.同步代码块
    2.同步方式
    3.lock

同步代码块：
    synchronized(钥匙){
        线程的执行动作，可能出现线程安全的代码
    }
    一把钥匙只能开一把锁
    锁有三种形式：
        如果N条线程执行多线程的动作一致，这个锁就是当前对象 this
        如果N条线程执行多线程的动作不一致，这个锁必须找到多线程共同处理的对象资源
        如果同步代码块在静态方法中，这个锁就是当前类，当前类.class
 */
public class Demo6 {
    public static void main(String[] args) {
        Ticket ticket=new Ticket();
        Thread thread1=new Thread(ticket,"窗口1");
        Thread thread2=new Thread(ticket,"窗口2");
        Thread thread3=new Thread(ticket,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
