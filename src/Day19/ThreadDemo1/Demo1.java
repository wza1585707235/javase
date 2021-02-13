package Day19.ThreadDemo1;
/*
Java程序就是多线程程序
    主线程
    垃圾回收线程
 */
public class Demo1 {
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();

        System.out.println(thread.getName());

        //实现倒计时功能

    }

}
