package Day14.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
LocalDateTime类
    类的特点：第三代针对日期时间操作工具类
    类的位置：java.time
    类的构造器：被私有化，无法创建对象，通过静态方法now进行获取
    类的方法：public String format()

第三代日期时间类的格式化和解析：(DateTimeFormatter类)：
    类的特点：
        针对第三代日期时间类做格式化和解析操作的工具类
    类的位置：
        java.time.format
    类的构造器：
        构造器私有化，需要使用静态方法进行获取
        public static DateTimeFormatter ofPattern(String pattern)
第三代日期时间类的格式化：localDateTIme==》String
    1.创建第三代日期时间类对象
    2.创建第三代日期时间类格式化解析对象DateTimeFormatter
    3.做格式化操作
第三代日期时间类解析
    1.定义日期的文本格式
    2，创建第三代日期时间类解析对象DateTimeFormatter
    3.做解析操作

 */
public class DateDemo3 {
    public static void main(String[] args) {
        test01();
        format();
        parse();
    }
    private static void test01(){
        //获取LocalDateTime对象
        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime.getClass().getName());
        System.out.println(localDateTime);
    }
    private static void format(){
        LocalDateTime localDateTime=LocalDateTime.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        String str=dtf.format(localDateTime);
        System.out.println(str);
    }

    private static void parse(){
        //定义文本格式
        String str="2021年01月30日 16时07分28秒";
        //创建解析对象
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        //利用parse方法进行解析
        LocalDateTime localDateTime=LocalDateTime.parse(str,dateTimeFormatter);
        System.out.println(localDateTime);
    }
}
