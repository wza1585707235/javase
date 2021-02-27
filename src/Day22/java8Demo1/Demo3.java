package Day22.java8Demo1;

import java.util.function.Function;

public class Demo3 {
    public static void main(String[] args) {
        int i = method(new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return Integer.parseInt(s);
            }
        }, "12345");
        System.out.println(i);
        int i2 = method((String s) -> {
            return Integer.parseInt(s);
        }, "12345");
        System.out.println(i2);
    }
    public static int method(Function<String,Integer> function,String s){
        return function.apply(s);
    }
}
