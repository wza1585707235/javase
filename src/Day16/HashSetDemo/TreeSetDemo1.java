package Day16.HashSetDemo;

import java.util.TreeSet;

/*
TreeSet类
    类的特点：
        1.底层的数据结构
            红黑树(二叉树的一种)：可以快速做升序降序，查找某个元素或者添加删除某元素
            当链表比较短的时候，链表的效率还是高于红黑树的
            一个结点应该包含几个元素：当前元素，父节点，两个子节点
        2.TreeSet集合不可以存储重复元素  \
        3.TreeSet是无序的集合，存入的顺序和取出的顺序不一致
        4.TreeSet是一个可以根据自然顺序或者定制排序的规则进行排序 TreeMap源码中，进行比较的类型必须是Comparable实现类类型
            自然顺序comparable接口
                字符串：按照unicode码表进行排序
                Integer:按照数值大小进行排序
                自定义类型：必须定义比较器，否则编译报错
            定制排序comparator接口
        5.TreeSet不可以存储null元素，会引发空指针异常


    类的位置：
    类的构造器：
    类的方法：
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("abc");
        set.add("abc");

    }
}
