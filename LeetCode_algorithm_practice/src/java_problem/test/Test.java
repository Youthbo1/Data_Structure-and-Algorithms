package java_problem.test;

import java.util.Scanner;

/**
 * \Date: 2018/5/23
 * \
 * \Description:
 * \
 */
public class Test {
    public static void main(String[] args) {
        int[] n=new int[3];
        Scanner scanner=new Scanner(System.in);

        for (int i = 0; i <n.length ; i++) {
            n[i]=scanner.nextInt();
        }
        for (int a:n
             ) {
            System.out.print(a+"  ");
        }

        int max=n[0];
        for (int i = 0; i <n.length ; i++) {
            if (n[i]>max)
                max=n[i];
        }
        System.out.println();
        System.out.println(max);
    }
}
