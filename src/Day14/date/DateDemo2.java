package Day14.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
date类的格式的格式化和解析
    将英文格式格式化成中文格式
    将中文格式解析成英文格式

DateFormat类
    类的特点：进行Date类和文本格式互相转换的工具类
    因为该类为抽象类，应用其子类对象SimpleDateFormat类
SimpleDateFormat类
    特点：可以将Date类进行格式化和解析的工具类
    位置：java.text
    构造器：
        public SimpleDateFormat(String pattern)
            用给定的模式和默认语言环境的日期格式符号构造 SimpleDateFormat
    方法：
        public final String format(Date date)   格式化
            将一个 Date 格式化为日期/时间字符串。
        public Date parse(String source)  解析
           throws ParseException从给定字符串的开始解析文本，以生成一个日期。


将Date对象格式化文本格式：
    1.创建Date对象
    2.创建Date格式化解析对象
    3.将date对象进行格式化操作

将文本格式解析为Date对象：
    1.定义日期的文本格式
    2.创建Date格式化解析对象
    3.将文本格式进行解析操作



 */
public class DateDemo2 {
    public static void main(String[] args) throws ParseException {
        format();
        parse();
    }
    private static void format(){
        Date date=new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日  HH时mm分ss秒SSS毫秒");
        String format=sdf.format(date);
        System.out.println(format);
    }
    private static void parse() throws ParseException {
        String s = "2021年01月30日  14时50分26秒487毫秒";
        SimpleDateFormat sdf = new SimpleDateFormat("yyy年MM月dd日  HH时mm分ss秒SSS毫秒");
        Date date=sdf.parse(s);
        System.out.println(date);

    }

}
