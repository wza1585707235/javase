package Day17.HashMap;

import java.util.Hashtable;

/*
HashTable类
    类的特点
        1.底层数据结构
            哈希表
    类的位置：java.util
    类的构造器：
        public Hashtable()
              用默认的初始容量 (11) 和加载因子 (0.75) 构造一个新的空哈希表。
    类的方法


    和HashMap的对比：
        a。数组的数据类型
            hashmap：entry[]/Node[]
            hashtable：Entry[]
        b.数组的初始容量
            HashTable:11
            HashMap:7.0以前 16
                    8.0以后 初始化为空，第一次添加元素后初始化为16
        c.数组的扩容规则：
            HashTable：(原来数组长度<<1)+1;
            HashMap:7.0 原来的长度*2
                    8.0 原来的长度<<1
        d.null键和null值
            HashTable：不可以存储null键和null值
        e.线程安全性
            HashTable:线程安全的
            HashMap：线程不安全

Propertites：HashMap子类 持久 和io流结合

 */
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
    }
}
