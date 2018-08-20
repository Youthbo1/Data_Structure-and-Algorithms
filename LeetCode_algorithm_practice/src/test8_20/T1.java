package test8_20;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * \Date: 2018/8/20
 * \
 * \Description:
 * \
 */
public class T1 {
    public static void main(String[] args) throws Exception {
        String str="   hizmy  ";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.compareTo("s"));
        System.out.println(str.replace("i","f"));
        System.out.println(str.trim());
        int age = Integer.parseInt("10");
        long id = Long.parseLong("190");
//        String str = "abcd";
//        String repeated = StringUtils.repeat(str,3);//abcdabcdabcd
        String src = "name";
        int len = src.length();
        int repeat = 5;
        StringBuilder builder = new StringBuilder(len * repeat);
        for(int i=0; i<repeat; i++){
            builder.append(src);
        }
        String dst = builder.toString();
        System.out.println(dst);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String str1 = "2013-11-07";
        Date date = format.parse(str1);
        System.out.println(format.format(date));//2013-11-07
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
