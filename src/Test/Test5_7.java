package Test;

public class Test5_7 {
    public static void main(String[] args) {
        System.out.println(method(4));
    }

    private static int method(int n) {
        if (n==1){
            return 1;
        }
        if (n==2){
            return 2;
        }
        return method(n-1)+method((n-2));
    }
}
