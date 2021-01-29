package Day13.StringBuilderDemo1;
/*
String类型的面试题1：
回顾：==在比较引用数据类型的时候，比较的是地址值

在堆内存==》方法区==》字面值区==》常量值区==》字符串常量池区

字符串常量池：(仅限直接赋值的方式)
    在字符串常量池中存在的字符串当第二次创建的时候，如果常量池中有字符串对象，将已有的字符串拿出进行使用，不再创建新的

常量池的好处：复用，提高内存的数据的复用性

 */
public class StringBuilderDemo3 {
    public static void main(String[] args) {
        String s1="HelloWorld";
        String s2=new String("HelloWorld");
        System.out.println(s1 == s2);
        String s3="HelloWorld";
        String s4="HelloWorld";
        System.out.println(s3 == s4);


        String s5=new String("Hello");
        String s6=new String("World");
        System.out.println(s5 + s6 == s1);//堆中新建地址值


        String s7="Hello";//0xBBB
        String s8="World";//0xCCC
        System.out.println(s7 + s8 == s1);//将s7+s8在堆中新建0x666(StringBuilder)

        System.out.println(s3 == "Hello" + "World");//常量池的优化机制：因为加号两边都为字面值常量，在编译时先进行拼接，然后再进行编译，在运行的时候是”HelloWorld“
    }
}
