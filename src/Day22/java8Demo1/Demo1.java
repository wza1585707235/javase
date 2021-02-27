package Day22.java8Demo1;

import java.util.function.Supplier;

public class Demo1 {
    public static void main(String[] args) {
        String s = method(new Supplier<String>() {
            @Override
            public String get() {
                return "Hello";
            }
        });
        System.out.println(s);
        String s2=method(() -> {return "Hello";});
        System.out.println(s2);
    }

    private static String method(Supplier<String> supplier) {
        return supplier.get();
    }
}
