package Day19.ThreadDemo1;

public class Ticket implements Runnable{
    private int ticket=100;

    @Override
    public void run() {
        while (ticket> 0){
            synchronized (this){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在卖"+ticket--+"张票");
                }
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
