package Test;

public class Test5_6 {
    public static void main(String[] args) {
        System.out.println(method(2));
    }

    private static int method(int n) {
        if (n==1){
            return 10;
        }
        return method(n-1)+2;
    }
}
