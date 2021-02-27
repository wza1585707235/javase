package Test6;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test6_6 {
    public static void main(String[] args) {
        int[] array={1,2,5,3,2,4,2};
        int pointer=0;
        while (pointer<array.length){
            int left_sum=0,right_sum=0;
            for (int i = 0; i < pointer; i++) {
                left_sum+=array[i];
            }
            for (int i = pointer+1; i < array.length; i++) {
                right_sum+=array[i];
            }
            if (left_sum==right_sum){
                System.out.println(pointer);
            }
            pointer+=1;
        }
    }
}
