package Day19.ThreadDemo1;

public class ChiHuo extends Thread{
    private BaoZi baoZi;

    public ChiHuo(String name, BaoZi baoZi) {
        super(name);
        this.baoZi = baoZi;
    }

    @Override
    public void run() {
        while (true){
             synchronized (baoZi){
                 if (baoZi.isFlag()){
                     System.out.println(getName()+":"+"吃货开始吃包子了，包子真好吃，吃完了");
                     baoZi.setFlag(false);

                     //因为在多个消费者的情况下，不确定包子铺到底在等待区的哪个位置
                     baoZi.notifyAll();
                 }else {
                     //如果没有包子，进入等待
                     try {
                         baoZi.wait();
                     } catch (InterruptedException e) {
                         e.printStackTrace();
                     }
                 }
             }
        }
    }
}
