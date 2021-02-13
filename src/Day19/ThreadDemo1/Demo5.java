package Day19.ThreadDemo1;
/*
程序出现的安全问题
    1.卖了不存在的票数
    2.一张票卖了多次
 */
public class Demo5 {
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
