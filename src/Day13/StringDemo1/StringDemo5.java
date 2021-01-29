package Day13.StringDemo1;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/*
String类的常用方法：转换
 */
public class StringDemo5 {
    public static void main(String[] args) {
        String str="abcdefg";
        //将字符串转换为字符数组
        char[] chars=str.toCharArray();
        //使用平台的默认字符集将string编码转换为新的字节数组
        byte[] bytes=str.getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(bytes));
        //将与target匹配的子字符串替换成参数
        System.out.println(str.replace("abc", "java"));
    }
}
