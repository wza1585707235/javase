package Day15.ListDemo1;

import java.util.LinkedList;

/*
类的特点：
    1.具有list集合接口通用特点
    2.底层数据结构
        双向链表结构
        链表结构：查询效率低，增删效率高（在LinkedList对象的区域开辟了相应的空间，添加数据）
    3.LinkedList不是线程安全的，效率高
    如果操作集合中的增删比较频繁，选择linkedlist，查询频繁选择arraylist
类的位置：java.util
类的构造器:空参

Node对象:第一个成员：当前元素数据
        第二个成员：当前元素的下一个元素的node对象
        第三个成员：当前元素的上一个元素node对象


 */
public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        System.out.println(list);
        System.out.println(list.get(1));
    }
}
