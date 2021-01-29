package Day13.HomeWork;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HomeWork22 {
    public static void main(String[] args) {
        String str1 ="abcwerthelloyuiodef";
        String str2= "cvhellobnm";
        int front=0;
        int back=str2.length();
        PriorityQueue<String> priorityQueue=new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        while (back>0){
            if (!priorityQueue.isEmpty()&&back<priorityQueue.peek().length()){
                break;
            }
            for (int i = front; i < back; i++) {
                if (str1.contains(str2.substring(i,back))){
                    priorityQueue.add(str2.substring(i,back));
                }
            }
            back--;
        }
        System.out.println(priorityQueue.peek());
    }
}
