package Day21.reflect2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Demo2 {
    public static void main(String[] args) throws Exception, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> class1 = Class.forName("Day21.reflect2.Student");
        Constructor<?> declaredConstructor = class1.getDeclaredConstructor(String.class, int.class);
        Object newInstance = declaredConstructor.newInstance("张三", 20);
        Field name = class1.getField("name");
        System.out.println(name.get(newInstance));

        Field anInt = class1.getDeclaredField("age");
        System.out.println(anInt.getInt(newInstance));
        anInt.set(newInstance,30);
        System.out.println(anInt.getInt(newInstance));


    }
}
