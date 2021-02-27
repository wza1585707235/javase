package Test;

public class Test5_8 {
    public static void main(String[] args) {
        int n=98765;
        String string=String.valueOf(n);
        StringBuilder stringBuilder=new StringBuilder(string);
        StringBuilder reverse = stringBuilder.reverse();
        System.out.println(reverse);
    }

}
