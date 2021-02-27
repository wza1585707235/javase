package Day21.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Student> class1 = Student.class;
        System.out.println(class1);
        Student student=new Student();
        Class<? extends Student> class2 = student.getClass();
        System.out.println(class2);
        Class<?> class3 = Class.forName("Day21.reflect.Student");
        System.out.println(class3);
        Class<?> class4 = ClassLoader.getSystemClassLoader().loadClass("Day21.reflect.Student");
        System.out.println(class4);

        Constructor<?> declaredConstructor = class3.getDeclaredConstructor(String.class, int.class);
        Constructor<?> declaredConstructor1 = class3.getConstructor(String.class,int.class);
        Object alex1 = declaredConstructor1.newInstance("Alex", 30);
        Object alex = declaredConstructor.newInstance("Alex", 24);
        System.out.println(alex);
        System.out.println(alex1);

        Constructor<?> declaredConstructor2 = class3.getDeclaredConstructor(int.class);
        declaredConstructor2.setAccessible(true);
        Object o = declaredConstructor2.newInstance(18);
        System.out.println(o);

    }
}
