package Day13.StringBuilderDemo1;
/*
String类的面试题2：
    注意事项：在程序中，如果string类型的变量被final关键字修饰，且是直接赋字面值的方式，不可以先定义后赋值，JVM会把这个字符串的量当作字面值常量进行使用，可以应用常量池的优化机制

    如果进行数学运算的话，字面值常量会在编译时运算出结果再进行编译

 */
public class StringBuilderDemo4 {
    public static final String s1="HelloWorld";
    public static final String s2="HelloWorld";
    public static final String s3="Hello";
    public static final String s4="World";
    public static final String s5;
    public static final String s6;
    public static final String s7;
    public static final String s8;
    static {
        s5="HelloWorld";
        s6="HelloWorld";
        s7="Hello";
        s8="World";
    }

    public static void main(String[] args) {
        System.out.println(s1 == s2);
        System.out.println(s5 == s6);
        System.out.println(s1 == s5);


        System.out.println(s1 == (s3 + s4));//true s3+s4在常量池，在编译时已经合并好了
        System.out.println(s5 == (s7 + s8));//false s7+s8地址值在堆，运行时开辟的
    }
}
