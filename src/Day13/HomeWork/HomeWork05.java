package Day13.HomeWork;

import java.util.Arrays;

public class HomeWork05 {
    public static void main(String[] args) {
        String[] strings={"bca","dddaaa","dadfa","1234533","你好啊"};
        int[] ints={1,2,3};
        StringBuilder stringBuilder=new StringBuilder();
        for (String string : strings) {
            if (string.length()<=5){
                stringBuilder.append(string+",");
            }
        }
            System.out.println(Arrays.toString(stringBuilder.toString().split(",")));
    }
}
