package Day13.HomeWork;

import java.util.Random;

public class HomeWork04 {
    public static void main(String[] args) {
        Random random=new Random();
        double num=random.nextDouble();
        double temp=num-(int)num;
        System.out.println(temp);
        System.out.println((int)num+"."+String.valueOf(temp).substring(2,4));
    }
}
