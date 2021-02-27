package Test;

import java.util.HashMap;
import java.util.Set;

public class Test5_9 {
    public static void main(String[] args) {
        String content = "中中国 55kkfff".trim();
        HashMap<Character,Integer> hashMap=new HashMap<>();
        for (int i = 0; i < content.length(); i++) {
            if (!hashMap.containsKey(content.charAt(i))){
                hashMap.put(content.charAt(i),1);
            }else hashMap.put(content.charAt(i),hashMap.get(content.charAt(i))+1);
        }
        Set<Character> characters = hashMap.keySet();
        for (Character character : characters) {
            System.out.println(character+":"+hashMap.get(character));
        }
    }
}
