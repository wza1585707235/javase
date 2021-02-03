package Day16.HashSetDemo;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo4 {
    public static void main(String[] args) {
        Student2 p1=new Student2("ALex",23);
        Student2 p2=new Student2("Derrick",19);
        Student2 p3=new Student2("Amy",19);
        TreeSet<Student2> set=new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
