package Test;

public class Test5 {
    public static void main(String[] args) {
        long count=0L;
        for (int i = 1; i <=20; i++) {
            long temp=1L;
            int number=i;
            while (number>0){
                temp*=number;
                number--;
            }
            count+=temp;
        }
        System.out.println(count);
    }
}
