package day08.nonameobject;

import java.util.Random;
import java.util.Scanner;

/*
Random类
    类的特点：是一个随机生成数字的工具类
    类的位置：java.util
    类的构造器：public random()
    类的方法：public int nextInt() :int 取值范围内
    public int nextInt(int n)：在指定范围内 0包括，指定值不包括

 */
public class RandomDemo1 {
    public static void main(String[] args) {
        int number=new Random().nextInt(100)+1;
        while (true){
            System.out.println("猜测一个数字：");
            int guessnumber=new Scanner(System.in).nextInt();
            if (number==guessnumber){
                System.out.println("猜对了");
                break;
            }else if (number>guessnumber){
                System.out.println("猜小了");
            }else System.out.println("猜大了");
        }
    }
}
