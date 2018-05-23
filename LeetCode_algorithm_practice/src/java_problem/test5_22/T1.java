package java_problem.test5_22;

/**
 * \Date: 2018/5/22
 * \
 * \Description:
 * \
 */
public class T1 {
    public static void main(String[] args) {
        int n=1,sum=0;

        while (n<=5){
            sum+=n++;
        }
        System.out.println(sum);

        char c='a';
        int count=1;
        while(c<='z'){
            System.out.print(c+" ");
            if (count%13==0)
                System.out.println();
            c++;
            count++;
        }

        int number= (int) (Math.random()*10+1);
        System.out.println(number);
    }



}
