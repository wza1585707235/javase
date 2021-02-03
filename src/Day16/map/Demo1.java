package Day16.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
Map集合
    类的特点：
        1.map集合中元素都是成对出现的，一个key一个value，key和value是一一对应的关系
        2.map集合中，key不可以重复value可以重复
        3.key和value的数据类型可以一样，也可以不一样
    类的位置：java.util
    类的构造器：因为是接口，没有构造器
    类的方法:
    boolean containsKey(Object key)
        如果此映射包含指定键的映射关系，则返回 true。
    boolean containsValue(Object value)
         如果此映射将一个或多个键映射到指定值，则返回 true。
     V get(Object key)
        返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
     Set<Map.Entry<K,V>> entrySet()
        返回此映射中包含的映射关系的 Set 视图。
     Set<K> keySet()
        返回此映射中包含的键的 Set 视图
    V put(K key,V value)
        将指定的值与此映射中的指定键关联（可选操作）。    有返回值，返回的是之前与key关联的值，没有返回null

 */
public class Demo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println(map.put("郭靖", "华筝"));
        map.put("杨过","小龙女");
        map.put("张无忌","赵敏");
        map.put("郭靖","黄蓉");
        System.out.println(map);
        System.out.println(map.containsKey("郭靖"));
        //map.remove("郭靖");
        System.out.println(map);
        //获取所有key的set集合
        Set<String> keys = map.keySet();
        System.out.println(keys);
        System.out.println(keys.getClass());//此时的set集合的类型：是Map接口实现类的内部类KeySet
        //获取所有的value的collection集合
        Collection<String> values = map.values();
        System.out.println(values);
        System.out.println(values.getClass());//此时的Collections集合的类型：是Map接口实现类的内部类values
        //获取所有键值对 对象
        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        System.out.println(entries.getClass());//EntrySet
    }
}
