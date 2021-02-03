package Day16.HashSetDemo;

import java.util.HashSet;

public class Demo2 {
    public static void main(String[] args) {
        HashSet<Student> hashSet=new HashSet<>();
        Student s1=new Student(23,"alex","182");
        Student s2=new Student(18,"Amy","185");
        Student s3=new Student(20,"Derrick","181");
        Student s4=new Student(23,"alex","133");
        Student s5=new Student(23,"alex","182");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);
        System.out.println(hashSet);
    }
}
