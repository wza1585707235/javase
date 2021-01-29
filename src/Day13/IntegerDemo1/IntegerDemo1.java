package Day13.IntegerDemo1;
/*
包装类：所谓包装类就是8种基本数据类型的引用类型
Integer类：
    位置：java.lang包
基本数据类型和包装类型之间的转换：
    将基本数据类型转换为包装类型(装箱)
        1.包装类型的构造器，参数为该包装类型所对应的基本数据类型
        2.包装类的静态方法：valueOf(基本数据类型)
    将包装类型转换为基本数据类型(拆箱)
        1.包装类的实例方法xxxValue()
JDK5.0新特性
自动装箱：JVM自动将一个基本数据类型的数据转换为对应的包装类型
自动拆箱：JVM自动将一个包装类型的数据转换为对应的基本数据类型
 */
public class IntegerDemo1 {
    public static void main(String[] args) {
        Integer integer01=new Integer(123);
        Integer integer02=Integer.valueOf(123);
        System.out.println(integer01);
        System.out.println(integer02);
        Integer integer03=123;//自动装箱
        int num02=new Integer(123);//将基本数据类型通过创建对象的方式转化为Integer类型，再通过JVM自动拆箱转化为int

    }
}
