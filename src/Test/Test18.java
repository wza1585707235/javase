package Test;

public class Test18 {
    public static void main(String[] args) {
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread thread=new Thread(runnable,"自定义线程");
        thread.start();
    }
}
