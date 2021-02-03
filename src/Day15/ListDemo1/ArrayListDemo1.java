package Day15.ListDemo1;

import java.util.ArrayList;

/*
类的特点
    1.具有List集合接口通用的特点
    2.底层数据结构
        实现了自动扩容删除的数组
    3.数组初始容量是多少
        取决于构造器
        ArrayList(Collection<? extends E> c) 数组容量取决于参数集合的长度
        ArrayList(int initialCapacity)自定义初始容量
        ArrayList()
            JDK7.0以后，数组初始容量为0，第一次添加元素的时候，初始化长度为10
            JDK6.0以后，初始容量为10

     4.扩容原理：
        JDK7.0以后 少于21亿，new容量=old容量+old容量>>1    如果多余21亿，极限添加到int值的最大取值范围
        JDK6.0以前 原来数组长度*3/2+1
     5.不是线程安全的，效率高
     6.如果底层数据结构是数组的话：查询效率比较高(对比链表结构)，增删效率低

类的位置java.util
类的构造器
    ArrayList()
          构造一个初始容量为 10 的空列表。
    ArrayList(Collection<? extends E> c)
          构造一个包含指定 collection 的元素的列表，这些元素是按照该 collection 的迭代器返回它们的顺序排列的。
    ArrayList(int initialCapacity)
          构造一个具有指定初始容量的空列表。
类的方法
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        String s;
        ArrayList<String>arrayList=new ArrayList<>();
        arrayList.add("123");
    }
}
