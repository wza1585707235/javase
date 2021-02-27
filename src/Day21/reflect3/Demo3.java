package Day21.reflect3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Demo3 {
    public static void main(String[] args) throws Exception {
        Class<?> class1 = Class.forName("Day21.reflect3.Student");
        Constructor<?> declaredConstructor = class1.getDeclaredConstructor();
        Object o = declaredConstructor.newInstance();
        Method method1 = class1.getDeclaredMethod("method1");
        System.out.println(method1.invoke(o));

        Method method2 = class1.getDeclaredMethod("method2");
        System.out.println(method2.invoke(o));

        Method method3 = class1.getDeclaredMethod("method3", String.class);
        //System.out.println(method3.invoke(o, "123"));
        Object invoke = method3.invoke(o, "123");
        System.out.println(invoke);


    }
}
