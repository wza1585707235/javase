package Day16.HashSetDemo;

import java.util.TreeSet;

/*
自然排序
    1.自定义存储类型，将该类实现Comparable接口
    2.重写接口中的抽象方法CompareTo()，就是在定义比较规则
    3.在测试类中创建合适数量的自定义类型的对象
    4.创建treeset集合对象
    5.将自定义对象添加到Treeset集合中


Comparable接口
    类的特点：强行对实现它的类对象进行整体排序
    类的位置：java.lang
    类的构造器：因为是接口，所以没有构造器
    类的方法
不符合JavaBean的规则
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        Person p1=new Person("ALex",23);
        Person p2=new Person("Derrick",29);
        Person p3=new Person("Amy",19);
        TreeSet<Person> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
