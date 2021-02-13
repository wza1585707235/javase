package Day19.ThreadDemo1;
/*
同步方法：
    修饰符 synchronized 返回值类型 方法名(){
        线程执行的动作，可能出现线程安全的代码
    }
 */
public class Demo7 {
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
