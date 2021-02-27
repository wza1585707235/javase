package Day22.java8Demo1;

import java.util.function.Function;

/*
静态方法的引用
    Lambda表达式格式：
        (参数)->类名.方法名(参数)
    1.要有lambda表达式的存在
    2.Lambda表达式的{}的格式必须是省略格式(重写的抽象方法体有且只有一条语句)
    3.lambda表达式(){}中方法体语句的形参列表必须是一一对应，需要是同一个参数
 */
public class Demo10 {
    public static void main(String[] args) {
        method(s -> Integer.parseInt(s),"123");
        method(Integer::parseInt,"123");
    }
    public static void method(Function<String,Integer> function, String s){
        System.out.println(function.apply(s));
    }
}
