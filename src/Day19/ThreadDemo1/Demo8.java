package Day19.ThreadDemo1;
/*
public final void notify(){}
      唤醒在此对象监视器上等待的单个线程。
public final void notifyAll()
      唤醒在此对象监视器上等待的所有线程
public final void wait()
      在其他线程调用此对象的 notify() 方法或 notifyAll() 方法前，导致当前线程等待

 */
public class Demo8 {
    public static void main(String[] args) {
        BaoZi baoZi = new BaoZi();
        BaoZiPu baoZiPu = new BaoZiPu("包子铺",baoZi);
        ChiHuo chiHuo1 = new ChiHuo("吃货1", baoZi);
        ChiHuo chiHuo2 = new ChiHuo("吃货2", baoZi);
        ChiHuo chiHuo3 = new ChiHuo("吃货3", baoZi);
        baoZiPu.start();
        chiHuo1.start();
        chiHuo2.start();
        chiHuo3.start();

    }
}
