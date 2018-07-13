package java_problem.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T2 {

    public static void main(String[] args) throws ParseException {
        Date date=new Date();
        String str=date.toString();
        System.out.println(str);

//1.字符串转日期：
        SimpleDateFormat sdf  =   new SimpleDateFormat( "yyyy/MM/dd" );
        Date date1=sdf.parse("2018/07/13");
        System.out.println(date1);
//2.日期转字符串
        String datestr = sdf.format( new  Date());
        System.out.println(datestr);

        SimpleDateFormat sdf1  =   new  SimpleDateFormat( " yyyy年MM月dd日 " );
        String d1 = sdf1.format( new  Date());
        System.out.println(d1);

        SimpleDateFormat parser = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat("EEE. MM/dd");
    }
}
