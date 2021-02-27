package Test6;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Test6_2 {
    public static void main(String[] args) {
        String data = "aaaabcdefgggg";
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < data.length(); i++) {
            if (hashMap.containsKey(data.charAt(i))){
                hashMap.put(data.charAt(i),hashMap.get(data.charAt(i))+1);
            }else hashMap.put(data.charAt(i),1);
        }
        Collection<Integer> values = hashMap.values();
        int max=0;
        for (Integer value : values) {
            if (value>max){
                max=value;
            }
        }
        Set<Character> characters = hashMap.keySet();
        for (Character character : characters) {
            if (hashMap.get(character)==max){
                System.out.println(character);
            }
        }
    }
}
