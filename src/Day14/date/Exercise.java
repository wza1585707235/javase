package Day14.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise {
    public static void main(String[] args) throws ParseException{
        foramt();
        //parse();
    }

    private static void foramt() {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
    }


}
