package Test;

public class Test5_4 {
    public static void main(String[] args) {
        System.out.println(method(4));
    }

    private static int method(int n) {
        if (n==1) return 1;
        return n+method(n-1);
    }
}
