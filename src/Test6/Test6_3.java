package Test6;

import java.time.LocalDateTime;
import java.util.HashSet;
/*201401 和 201406，
        201403 和 201409，输出：4
*/
public class Test6_3 {
    public static void main(String[] args) {
        int a1=201401,a2=201406;
        int b1=201403,b2=201409;
        if (a1>b2||a2<b1){
            System.out.println(0);
        }else System.out.println(count(a1, a2) + count(b1, b2) - count(Math.min(a1, b1), Math.max(a2, b2)));

    }

    private static int count(int a,int b) {
        HashSet<Integer> hashSet=new HashSet<>();
        while (a<=b){
            if (a%100==12){
                hashSet.add(a);
                a+=89;
            }else {
                hashSet.add(a);
                a+=1;
            }
        }
        return hashSet.size();
    }


}
