package Test;

public class Test5_10 {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }

    private static int fib(int number) {
        if (number==0){
            return 1;
        }else if (number==1){
            return 1;
        }else return fib(number-1)+fib(number-2);
    }
}
