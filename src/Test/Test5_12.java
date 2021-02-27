package Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Test5_12 {
    public static void main(String[] args) {
        List list = Arrays.asList(1,2,3,3,4,4,5,5,6,1,9,3,25,4);
        HashSet<Integer> hashSet=new HashSet<>();
        hashSet.addAll(list);
        for (Integer integer:hashSet){
            System.out.println(integer);
        }

    }
}
