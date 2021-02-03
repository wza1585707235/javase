package Day16.HashSetDemo;

import java.util.HashSet;

/*
HashSet类：
    类的特点：Hashset集合不可以存储重复元素
             底层数据结构：哈希表
                            在JDK7.0以前：数组+链表
                            在JDK8.0以后，数组+链表 或者 数组+红黑树
             HashSet集合是无序的集合
                存入的顺序和获取的顺序不一致
                HashSet集合中的元素无法保证永远不会改变
                HashSet中可以存储null元素，最多一个
                HashSet不是线程安全的，效率高
    类的位置：java.util


HashSet去重复原理
    1.需要在集合泛型所对应的类中重写Object类中的Hashcode()方法
    2.需要在集合泛型所对应的类中重写object类中的equals()方法
hashcode值
面试题：
    在String类重写Object类中hashcode()方法时，计算hash值时为什么选择31
        1.这个数不能太大，因为反复叠加运算可能会超出int取值范围
        2.这个数不能太小，因为值过小，反复叠加运算，多个字符串的hashcode值容易重复
        3.为了避免hashcode值过多的重复性，只能选择质数
        4.java的开发人员经过大量测试，测试中29和31是最为合适的两个值
        5.在整数的取值范围内，整数型取值范围内的格式都是2^n-1，31可以表示2^5-1
 */
public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        String s1=new String("abc");
        String s2=new String("abc");

        set.add(s1);//计算出字符串abc的哈希值为96354，通过96354计算出存储数组中索引3的位置，判断索引3处有没有元素，因为没有，将字符串abc存储进去
        set.add(s2);//计算出字符串abc的哈希值为96354，通过96354计算出存储数组中索引3的位置，判断索引3处有哈希值相同的元素，发生哈希冲突，调用equals()方法判断哈希冲突的两个元素是否为同一个元素，判断结果为true
        set.add("通话");//计算出字符串通话的哈希值为1179395，通过1179395计算出存储数组中索引2的位置，判断索引2处有没有元素，因为没有，将字符串通话存储进去
        set.add("重地");//计算出字符串重地的哈希值为1179395，通过1179395计算出存储数组中索引2的位置，判断索引2处有哈希值相同的元素，发生哈希冲突，调用equals()方法判断哈希冲突的两个元素是否为同一个元素，判断结果为false
        System.out.println(set);
    }
}
