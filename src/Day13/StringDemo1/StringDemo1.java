package Day13.StringDemo1;
/*
字符串在创建对象时的注意事项：在创建字符串对象的时候，有一种特殊的创建的方式，是直接赋值的方式String str="";
但是直接赋值的方式和通过构造器创建的方式有本质的区别，区别就是"常量池"

判断功能的方法
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //1.通过无参构造器创建字符串对象
        String str1=new String();//无参时为“”
        //2.通过字节数组创建字符串对象
        byte[] bytes={97,98,99,100,101,102,103};
        String str2=new String(bytes);
        System.out.println(str2);
        //3.通过字节数组创建指定范围字符串对象,参数：数组，起始索引，范围个数
        String str3=new String(bytes,1,3);
        System.out.println(str3);
        //4.通过字符数组创建字符串对象
        char[] chars={'a','b','c','d','e','f','g'};
        String str4=new String(chars);
        System.out.println(str4);
        //5.通过字符数组创建指定范围字符串对象,参数：数组，起始索引，范围个数
        //6.通过字符串来创建字符串对象
        String str5=new String("abcdefg");
        //7.直接赋值
        String str6="abcdefg";

    }
}
