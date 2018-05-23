package javaSEtest.test4_13;

/**
 * \Date: 2018/4/13
 * \
 * \Description:
 * \
 */
public class Pro1 {

    public static int f(int n){
        if(n==1||n==2)
            return 1;
        else
            return f(n-1)+f(n-2);
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(f(3));
    }
}
