package Day17.HashMap;

import java.util.HashMap;

/*
HashMap源码分析
    1.初始容量
        初始容量取决于构造器
        public HashMap(int initialCapacity)
            初始容量：自定义初始容量
            加载因子：默认0.75
        public HashMap(int initialCapacity,float loadFactor)
            初始容量：自定义初始容量
            加载因子：自定义加载因子
        public HashMap(Map<? extends K,? extends V> m)
            初始容量：参数Map集合的长度
            加载因子：默认0.75
        public HashMap()
            初始容量：
                JDK7.0以前：直接初始容量为16
                JDK8.0以后：没有初始容量，在第一次添加元素时，初始容量为16
            加载因子：0.75
加载因子：当元素超过容量的0.75倍时，进行扩容
第一次添加元素：
    1.重新计算hashcode值，得到新的hash值
        主要是以键的hashcode值的二进制和这个二进制的高16位进行按位异或
            让高16位进行参与运算可以进一步降低hashcode的重合概率                   ！！！！！！！！！得到的索引值更加的分散
    ++++++++++++从put进入到putval，进入到hash(key)    return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    2.执行putval方法()
        第一个if  if ((tab = table) == null || (n = tab.length) == 0)
           判断是否是第一次添加元素，如果是第一次添加元素，通过resize()方法初始化长度为16的数组
           确定存放key,value键值对的索引位置 if ((p = tab[i = (n - 1) & hash]) == null) 判断该索引位置是否含有元素(链表或红黑树)
                如果没有元素
                    new Node()对象
                如果含有元素
                    但没有达到树化的标准
                        链表的长度没有达到8，直接在链表的后面追加元素
                        链表的长度达到8了，数组的长度没有达到64，针对数组进行扩容，扩容的目的：重新确定每个元素在数组中的位置，进一步降低链表长度
                    达到了树化的标准

扩容原理：
    JDK8.0以后，原来数组的长度<<1
如何确定元素在底层数组中的位置？ 执行putval
链表转换成红黑树的标准：
    a.当链表的长度达到8的时候，准备树化，同时还要满足第二个条件
        binCount>=8-1
    b.数组的长度必须>=64


JDK7.0和JDK8.0的源码区别
    hash值计算方式不同
        JDK8.0 (h = key.hashCode()) ^ (h >>> 16)
        JDK7.0  h^=key.hashcode() ....三次异或
    数组的数据类型不同
        JDK7.0 Entry<K,V>
        JDK8.0 Node{}
    扩容规则不同
        jDK7.0 原来数组的长度*2
        JDK8.0 原来的数组<<2

 */
public class Demo2 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("1","1");
    }
}
