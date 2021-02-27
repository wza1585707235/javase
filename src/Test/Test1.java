package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Switch语句支持的数据类型：byte,short,int ,char  JDK5.0 enum JDk7.0字符串

byte short/char int long float double
三元运算符：如果其中一个是变量，按照自动类型转换规则转换为同一类型
           如果都是常量：其中一个是char，另一个是0~65535的整数，char不变
                        如果一个是char，另一个是其他数据类型，按照自动转换规则转换为同一类型
没有浮点常量池，整数-128~127，char 0~127
27.28.29.30

 */
public class Test1 {
    public static void main(String[] args) {
        System.out.println(true?'x':1);
        char x='x';
        System.out.println(x);
        int a;
        Integer[] datas = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(datas);

        System.out.println(method());
        List<Integer> list1=new ArrayList<>();
        list1.add(1);


    }
    public static int method(){
        try {
            System.out.println("123");
            return 0;
        }finally {
            System.out.println("456");
        }
    }
}
