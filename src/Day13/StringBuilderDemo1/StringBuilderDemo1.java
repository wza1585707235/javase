package Day13.StringBuilderDemo1;
/*
类的特点：一个可变的字符串序列
类的位置：java.lang
StringBuilder(StringBuffer)的特点：
    1.只能通过构造器的方式创建对象，不能直接赋值
    2.可以改变的原因：底层封装了没有final关键字修饰的数组
    3.底层数组的数据类型
        在JDK8.0以前，char类型数组
        在JDK9.0以后，byte类型数组
    4.底层数组数组的初始容量
        初始容量的大小取决于创建对象的构造器
            a.构造器的参数是String类型，初始容量String.length+16
            b.构造器的参数是int类型，初始容量为自定义
            c.构造器的参数是String的父接口类型String.length+16
            d.构造器无参的，初始容量为16
    5.扩容原理：
        jdk8.0以后，底层数组.length<<1+2
        jdk7.0,底层数组.length*2+2
        jdk6.0以前,(底层数组.length+1}*2
 */
public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        //在字符串后面进行追加
        stringBuilder.append("abc");
        System.out.println(stringBuilder);
        //在指定位置处进行插入
        stringBuilder.insert(1,"java");
        System.out.println(stringBuilder);
        //将字符串进行反转
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}
