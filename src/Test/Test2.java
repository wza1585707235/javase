package Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*
String buffer:reverse
Arrays:sort
String :valueof()
 */
public class Test2 {
    public static void main(String[] args) {
        //1.
//        for (int i = 1; i < 100; i+=2) {
//            System.out.println(i);
//        }
        //2.
//        int[] array=new int[]{5,7,3,9,2};
//        for (int i = 0; i < array.length-1; i++) {
//            for (int j = 0; j < array.length-1-i; j++) {
//                if (array[j]>array[j+1]){
//                    int temp=array[j];
//                    array[j]=array[j+1];
//                    array[j+1]=temp;
//                }
//            }
//        }
//        for (int i : array) {
//            System.out.println(i);
//        }
        //3.
//        int d=12;
//        int m=3;
//        int y=2012;
//        int day=0;
//        int[] month={31,28,31,30,31,30,31,31,30,31,30};
//        for (int i = 0; i < m-1; i++) {
//            if (m==1){
//                break;
//            }else {
//                day+=month[i];
//            }
//        }
//        day+=d;
//        if (((y%4==0 && y%100!=0)||y%400==0)&& m>2){
//            day+=1;
//        }
//        System.out.println(day);
        int number=9999;
        long count=0L;
        while (number>0){
            count+=number;
            number--;
        }
        System.out.println(count);
        printStar(3);
        String str="123";
        System.out.println(new StringBuffer(str).reverse());
        System.out.println(str);
        str="52967834";
        char[] chars=str.toCharArray();
        Arrays.sort(chars);

        System.out.println(String.valueOf(chars));
    }
    public static void printStar(int n){
        for (int i = 1; i <= n ; i++) {
            String str="";
            int number=2*i-1;
            while(number>0){
                str=str.concat("*");
                number--;
            }
            System.out.println(str);
        }
    }
}
