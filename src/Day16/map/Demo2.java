package Day16.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合的第一种遍历方式：通过键找值
 */
public class Demo2 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("杨过","小龙女");
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");

        Set<String>set=map.keySet();
        for (String s : set) {
            String value=map.get(s);
            System.out.println(s+"  "+value);
        }
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+entry.getValue());
        }
    }

}
