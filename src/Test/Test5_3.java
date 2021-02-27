package Test;

public class Test5_3 {
    public static void main(String[] args) {
        for (int i = 0; i < 33; i++) {
            for (int j = 0; j < 50; j++) {
                if ((100-i-j)%2==0&&3*i+2*j+(100-i-j)/2==100){
                    System.out.println(i+" "+j+" ");
                }
            }
        }
    }
}
