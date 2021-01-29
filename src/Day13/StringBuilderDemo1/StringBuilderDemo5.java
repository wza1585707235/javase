package Day13.StringBuilderDemo1;
/*
String类的面试题3：
    内存中对象的个数
 */
public class StringBuilderDemo5 {
    public static void main(String[] args) {
        String str1="HelloWorld";//内存中有一个对象，在常量池
        String str2=new String("HelloWorld");//内存中有两个对象，1个在常量池中，另外1个在堆中

        String str3="a"+"b"+"c";//内存中有一个对象

        String s1="a";
        String s2="b";
        String s3="c";
        String s4=s1+s2+s3;//内存中有五个对象，a b c 在常量池s1+s2在堆里面开辟了一个新空间，s1+s2的结果+s3在开辟了一个新空间
    }
}
