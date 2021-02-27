package Day22.java8Demo1;

import java.util.function.Predicate;

public class Demo2 {
    public static void main(String[] args) {
        boolean b = method(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.startsWith("ab");
            }
        }, "abc");
        System.out.println(b);

        boolean b1 = method((String s) -> {
            return s.startsWith("abcd");
        }, "abcdefgh");
        System.out.println(b1);
    }
    public static boolean method(Predicate<String> stringPredicate,String s){
        return stringPredicate.test(s);
    }
}
