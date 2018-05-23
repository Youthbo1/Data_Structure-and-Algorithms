package java_problem.test5_22;

import java.util.Scanner;

/**
 * \Date: 2018/5/22
 * \
 * \Description:
 * \
 */
public class Test {
    public static void main(String[] args) {
        float f=1234.328f;
        System.out.println(f);
        double d=5623.464;
        char c='a',c2='s';
        char c1= (char) 65536;
        System.out.println(d+"  -"+c+"  -"+c1);

        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();

        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println(year+"闰年");

        }else
            System.out.println(year+"不是");
    }


}
