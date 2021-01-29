package Day13.StringDemo1;

import java.util.Arrays;

/*
字符串常用方法：分割
split 返回值字符串数组
注意事项：1.分割的标准在切完后不保留  2.分割的标准相连，其中一个字符串会以一个空白字符串进行保留

给定的规则：正则表达式   \为有含义的符号 需要再加一个\
    .任何字符
    \d数字
    \D非数字
 */
public class StringDemo6 {
    public static void main(String[] args) {
        String str="abc@de@fg";
        //根据@进行分割
        String[] strings=str.split("@");
        System.out.println(Arrays.toString(strings));
        str="ab1c2def3g";
        System.out.println(Arrays.toString(str.split("\\D")));

    }
}
