package Day19.ThreadDemo1;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 30; i++) {
            System.out.println(getName()+"："+i);
        }
    }
}
