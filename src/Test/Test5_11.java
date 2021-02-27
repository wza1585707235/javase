package Test;

public class Test5_11 {
    public static void main(String[] args) {
        char[] arr = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        char target='d';
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            if (arr[(left+right)/2]<target){
                left=(left+right)/2+1;
            }else if (arr[(left+right)/2]>target){
                right=(left+right)/2-1;
            }else {
                System.out.println((left+right)/2);
                break;
            }
        }
    }
}
