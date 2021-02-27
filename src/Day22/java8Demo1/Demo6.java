package Day22.java8Demo1;

import java.util.function.Consumer;
/*
lambda表达式的省略规则
    1.()中参数的数据类型是可以省略的
        注意：多个参数时，数据类型全写上，要么全不写
    2.()中的参数有且仅有一个的时候，在省略数据类型的同时，()也可以省略不写
    3.{}中的方法体有且仅有一条的时候，{}可以省略不写，但是省略{}的同时，方法体的";"和"return"也必须省略不写
 */
public class Demo6 {
    public static void main(String[] args) {
        //使用lambda表达式调用method方法
        method((String s) -> {
            System.out.println(s);
        },"abcdefg");
    }
    public static void method(Consumer<String> consumer,String str){
        consumer.accept(str);
    }
}
