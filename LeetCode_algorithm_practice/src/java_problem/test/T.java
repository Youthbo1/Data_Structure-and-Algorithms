package java_problem.test;

/**
 * \Date: 2018/5/23
 * \
 * \Description:
 * \
 */
public class T {
    public static void main(String[] args) {
        int[] n={10,8,7,6,5};

        int t;
        for (int i = 0; i <n.length-1 ; i++) {
            for (int j = 0; j <n.length-i-1 ; j++) {
                if (n[j]>n[j+1]){
                    t=n[j];
                    n[j]=n[j+1];
                    n[j+1]=t;
                }
            }
        }

        for (int a:n
             ) {
            System.out.print(a+" ");
        }
    }
}
