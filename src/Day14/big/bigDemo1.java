package Day14.big;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
BigInteger类：
    类的特点
        一个比long类型存储范围更大的整数工具类
    类的位置
        java.math
    类的构造器
        BigInteger(String val)
    类的方法

BigDecimal类
    类的特点
        不可变的，有精度的有符号的十进制数
    类的位置
    类的构造器
    类的方法
 */
public class bigDemo1 {
    public static void main(String[] args) {
        test01();
    }

    private static void test01() {
        int num01=1234567890;
        long num02=12345678901L;
        BigInteger bigInteger1=new BigInteger("123456789012345678901234567890");
        BigInteger bigInteger2=new BigInteger("1");

        BigDecimal bigDecimal1=new BigDecimal("2.0");
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        System.out.println(bigDecimal1.subtract(bigDecimal2));
        System.out.println(bigInteger1.add(bigInteger2));
    }
}
