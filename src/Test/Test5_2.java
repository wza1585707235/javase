package Test;
//100 + 50*2 +25 *2
public class Test5_2 {
    public static void main(String[] args) {
        int time=10;
        float l=100f,count=0f;
        while (time>1){
            l/=2;
            time--;
            count+=(l*2);
        }
        System.out.println(l/2);
        System.out.println(count+100);
    }
}
//第10次落地时，经过了：299.609375米
//第10次反弹的高度是：0.09765625米