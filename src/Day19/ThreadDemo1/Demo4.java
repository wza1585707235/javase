package Day19.ThreadDemo1;
/*
利用匿名内部类简化第二种开启方式
    1.创建Runnable接口的实现类对象，通过匿名内部类的方式
    2.匿名内部类中重写run()方法
    3.。。。。。。。。。。。。。。。
 */
public class Demo4 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 30; i++) {
                    System.out.println(Thread.currentThread().getName()+"："+i);
                }
            }
        };
        Thread thread1 = new Thread(runnable, "自定义1");
        Thread thread2 = new Thread(runnable, "自定义2");
        thread1.start();
        thread2.start();
    }
}
