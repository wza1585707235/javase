package Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test14 {
    public static void main(String[] args) {
        Map<String,String[]> map=new HashMap<>();
        map.put("浙江省",new String[]{"绍兴市","温州市"});
        map.put("海南省",new String[]{"海口市","三亚市"});
        map.put("北京市",new String[]{"北京市"});
        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string);

            String[] strings1=map.get(string);
            for (String s : strings1) {
                System.out.println("\t"+s);
            }
        }
    }
}
