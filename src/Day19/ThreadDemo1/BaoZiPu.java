package Day19.ThreadDemo1;

public class BaoZiPu extends Thread{
    private BaoZi baoZi;

    public BaoZiPu(String name, BaoZi baoZi) {
        super(name);
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
            synchronized (baoZi){
                if (baoZi.isFlag()){
                    try {
                        baoZi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    //状态为false，说明没有包子了，开始做包子
                    System.out.println(getName()+":"+"开始做包子了，包子做好了");
                    baoZi.setFlag(true);
                    //唤醒等待的线程过来吃，谁等待的时间最长，就唤醒谁
                    baoZi.notify();
                }
            }
        }
    }
}
