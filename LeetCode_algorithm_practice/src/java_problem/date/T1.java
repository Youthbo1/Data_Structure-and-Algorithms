package java_problem.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T1 {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//
//        String year = String.format("%tY", date);
//
//        String month = String.format("%tB", date);
//
//        String day = String.format("%te", date);
//
//        System.out.println("今天是：" + year + "-" + month + "-" + day);
//
//        Date now = new Date();
//        SimpleDateFormat f = new SimpleDateFormat( "yyyy年MM月dd日");
//        System.out.println(f.format(now));
//        f = new SimpleDateFormat("hh点mm分ss秒");
//        System.out.println(f.format(now));
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
//        SimpleDateFormat sDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String s="2013-06-07";
        Date date=simpleDateFormat.parse(s);
        System.out.println(date);

        System.out.println("------------------------------");
        SimpleDateFormat simpleFormat = new SimpleDateFormat("2018-06-01");
//        Date fromDate1 = parseDate("2018-06-01");
        Date toDate1 = simpleFormat.parse(simpleFormat.format(new Date()));
//        long from1 = fromDate1.getTime();
        long to1 = toDate1.getTime();

//        int days = (int) (((to1 - from1) / (1000 * 60 * 60 * 24))/30);

        T1 nowDate = new T1();
//        nowDate.getSystemCurrentTime();
//        nowDate.getCurrentDate();
    }

    public void getSystemCurrentTime() {
        System.out.println("----获取系统当前时间----");
        System.out.println("系统当前时间 = " + System.currentTimeMillis());
    }

    public void getCurrentDate() {
        System.out.println("----获取系统当前日期----");
        //创建并初始化一个日期（初始值为当前日期）
        Date date = new Date();
        System.out.println("现在的日期是 = " + date.toString());
        System.out.println("自1970年1月1日0时0分0秒开始至今所经历的毫秒数 = " + date.getTime());
    }
}
