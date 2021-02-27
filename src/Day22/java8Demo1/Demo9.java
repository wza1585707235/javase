package Day22.java8Demo1;

import java.util.function.Consumer;

/*
JDK8新特性：引用
    引用是java8进一步简化lambda表达式的一种格式
使用引用的前提条件：
    1.肯定需要有lambda表达式的存在
    2.根据具体的引用进行简化
分类：
    方法引用
        实例方法的引用
            基本格式！！
            特殊格式
                this
                super
        静态方法的引用！！
    构造器引用
        对象引用(并不是对象的地址值)
        数组的引用
实例方法的引用的基本格式
    lambda表达式格式：
        (参数)->对象名.实例方法名(参数)
    方法引用格式：
        对象名::实例方法名
实例方法引用的前提条件：
    1.要有lambda表达式的存在
    2.Lambda表达式的{}的格式必须是省略格式(重写的抽象方法体有且只有一条语句)
    3.lambda表达式(){}中方法体语句的形参列表必须是一一对应，需要是同一个参数





 */
public class Demo9 {
    public static void main(String[] args) {
        method(s -> System.out.println(s),"HelloWorld");
        method(System.out::println,"HelloWorld");
        method(System.out::println);
        method(new InterfaceC() {
            @Override
            public void print(String a, String b) {
                System.out.println(a+b);
            }
        },"Hello","World");
        method((String a,String b)->
            System.out.println(a+b),"Hello","World"
        );
    }

    public static void method(Consumer<String> c,String str){
        c.accept(str);
    }
    public static void method(InterfaceB b){
        b.print();
    }
    public static void method(InterfaceC c,String s1,String s2){
        c.print(s1,s2);
    }
}
