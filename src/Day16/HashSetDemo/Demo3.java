package Day16.HashSetDemo;

import java.util.TreeSet;
/*
定制排序：
    1.创建Comparator接口的实现类
    2.在实现类中重写Comparator接口的抽象方法，定义比较规则
    3.创建合适数量的对象
    4.创建Comparator接口的实现类对象
    5.通过Comparator实现类对象创建TreeSet集合对象
Comparator:
    类的特点
    类的位置：java.util
    类的构造器：因为是接口，没有构造器
    类的方法：int Compare()
             boolean equals()

Comparator接口中含义两个抽象方法，作为Comparator的实现类只需要重写一个就可以
 */
public class Demo3 {
    public static void main(String[] args) {

        TreeSet<Student2> set=new TreeSet<>(new MyComparator());
        Student2 p1=new Student2("ALex",23);
        Student2 p2=new Student2("Derrick",19);
        Student2 p3=new Student2("Amy",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);

    }
}
