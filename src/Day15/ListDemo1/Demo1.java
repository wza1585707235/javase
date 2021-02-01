package Day15.ListDemo1;

import java.util.ArrayList;
import java.util.List;

/*
list接口
    类的特点：
        1.list集合是有序集合
            有序：存入集合的顺序和遍历时的顺序是一致的
            无序：存入集合的顺序和遍历时的顺序不一致
        2.list集合是有索引的集合
            list集合中的索引和数组中的索引既相似，也不相似
            list集合中某些集合的索引其实就是数组的索引，也有些集合是通过一定的数据结构模拟出来的索引
            list集合可以存储重复元素
            list集合可以存储null元素
            list集合提供了特殊的迭代器，称之为ListIterator
    类的位置：java.util
    类的构造器：因为是接口。没有构造器，需要创建其实现类
    类的方法
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("123");
        list.add("456");
        System.out.println(list);
        list.add(1,"789");
        System.out.println(list);
        list.set(2,"000");
        System.out.println(list.get(2));
        list.add("000");
        System.out.println(list.indexOf("000"));
        System.out.println(list.lastIndexOf("000"));
        System.out.println(list.subList(0, 2));

    }
}
