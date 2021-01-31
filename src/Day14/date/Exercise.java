package Day14.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise {
    public static void main(String[] args) throws ParseException{
        foramt();
        parse();
    }

    private static void parse() throws ParseException {
        String s="2021年1月31日 22时44分01秒";
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=simpleDateFormat.parse(s);
        System.out.println(date);
    }

    private static void foramt() {
        Date date=new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String str=simpleDateFormat.format(date);
        System.out.println(str);
    }

}
