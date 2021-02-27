package Day16.HashSetDemo;

import java.util.Iterator;
import java.util.LinkedHashSet;

/*
类的特点：1.LinkedHashSet集合不可以存储重复元素
          2. 底层数据结构：哈希表+链表
                多出来的链表作用：保证可预知迭代顺序
          3.有序集合
          4.LinkedHashSet可以存储null元素，最多只能存储一个
          5.线程不安全，效率高
类的位置：java.util
类的构造器public LinkedHashSet()
            构造一个带默认初始容量 (16) 和加载因子 (0.75) 的新空链接哈希 set。
类的方法：没有自己的特有方法
 */
public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("abc");
        linkedHashSet.add("acb");
        linkedHashSet.add("bac");
        linkedHashSet.add("bca");
        linkedHashSet.add("cab");
        linkedHashSet.add("cba");
        System.out.println(linkedHashSet);
        Iterator iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
