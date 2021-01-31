package Day14.date;

import java.util.Date;

/*
Date类
    类的特点：表示特定的瞬间，精确到毫秒
    类的内容：java.util
    类的构造器:public Date() public Date(long date)
    类的方法：
        public long getTime()
 */
public class DateDemo1 {
    public static void main(String[] args) {
        //创建日期时间对象
        Date date1=new Date();
        System.out.println(date1);
        System.out.println(date1.getTime());

        Date date2=new Date(1000000000L);
        System.out.println(date2);
    }
}
