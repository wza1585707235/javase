package Day13.StringDemo1;
/*
String类的常用方法：判断


 */
public class StringDemo3 {
    public static void main(String[] args) {
        String str1=new String("abc");
        String str2=new String("abc");
        String str3=new String("Abc");
        String str4=new String("abd");
        String str="abcdefg";
        //判断两个字符串是否相等，且区分大小写
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equals(str4));
        //判断两个字符串是否相等，忽略大小写
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
        System.out.println(str1.equalsIgnoreCase(str4));
        //判断字符串是否包含指定的字符串内容
        System.out.println(str.contains("Abc"));
        //测试字符串是否以指定的字符串结束
        System.out.println(str.endsWith("fg"));
        System.out.println(str.endsWith("FG"));
        //判断字符串是否为空白字符串
        System.out.println("".isEmpty());
        //判断是否以指定前缀开始
        System.out.println(str.startsWith("abc"));
        //判断从索引开始的字符串是否以指定前缀开始
        System.out.println(str.startsWith("abc", 1));

    }
}
