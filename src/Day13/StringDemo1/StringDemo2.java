package Day13.StringDemo1;
/*
String类的特点:
    1.在java程序中，所有字符串的字面值都是字符串对象，既然是对象就可以通过字符串字面值调用方法
    2.字符串是常量，他们的值在创建之后不能改变 原因：String类的底层是一个被final关键字修饰的数组
    3.String类底层的数组是什么数据类型
        在JDK8.0以前，char类型数组
        在JDK9.0以后，byte类型数组
    4.为什么在jdk9.0的时候，将底层数组由char类型转化为byte类型
        a.节约一定的内存空间
        b.byte类型可以和二进制位直接进行转换，一定程度上提高运行效率
    5.为什么String可以存储中文？
        字符串的底层编码是以unicode16进行编码的
    6."" 和null区别：
        ""是字符串对象,可以直接调用方法
        null是字面值常量，是作为引用数据类型的默认值存在的
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s=new String("123");


    }
}
