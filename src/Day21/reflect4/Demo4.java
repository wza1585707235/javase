package Day21.reflect4;

import Day21.reflect.Student;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;

public class Demo4 {
    public static void main(String[] args) throws Exception{
        Object o = Array.newInstance(Student.class, 4);
        Array.set(o,0,new Student());
        Student student2=new Student();
        Class<?> aClass = Class.forName("Day21.reflect.Student");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        Object o1 = declaredConstructor.newInstance();

        Array.set(o,1,student2);
        Array.set(o,3,o1);
        System.out.println(o);
        System.out.println(Array.get(o,0));
        System.out.println(Array.get(o,3));

    }
}
