package Day19.ThreadDemo1;

public class Demo12 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+":"+CEOExtra.getCeoExtra());
            }
        };
        Thread thread1 = new Thread(runnable, "自定义线程1");
        Thread thread2 = new Thread(runnable, "自定义线程2");
        Thread thread3 = new Thread(runnable, "自定义线程3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
