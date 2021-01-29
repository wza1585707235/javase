package Day13.StringDemo1;
/*
string类的常用方法：获取
 */
public class StringDemo4 {
    public static void main(String[] args) {
        String str="abcdefg";
        //获取长度
        System.out.println(str.length());
        //在字符串的结尾追加另外一个字符串
        System.out.println(str.concat("123"));
        //获取指定位置上的字符
        System.out.println(str.charAt(1));
        //返回指定字符串出现的第一次索引,没有找到-1
        System.out.println(str.indexOf("def"));
        //针对字符串进行截取,从指定位置开始，后面内容全要
        System.out.println(str.substring(7));
        //包含开始不包含结束
        System.out.println(str.substring(1, 3));
    }
}
