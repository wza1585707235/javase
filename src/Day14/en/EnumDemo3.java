package Day14.en;

import java.util.Arrays;

/*
Enum
    类的特点：所有枚举类型的父类
    位置：java.lang
    构造器：直接使用里面的方法，不需要创建对象
    类的方法：name()
             toString()结果一样

             public static 枚举类型[] values() 返回该类所有的常量对象
             public final int ordinal()返回枚举类中对象的索引位置
 */
public class EnumDemo3 {
    public static void main(String[] args) {
        System.out.println(Sex.boy);
        System.out.println(Sex.boy.name());
        System.out.println(Sex.boy.toString());
        Sex[] values=Sex.values();
        System.out.println(Arrays.toString(values));
        System.out.println(Sex.boy.ordinal());
    }
}
