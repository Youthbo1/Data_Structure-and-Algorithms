package java_problem.test;

/**
 * \Date: 2018/3/24
 * \
 * \Description:
 * \
 */
public class Dome3 {
    public static int add(Integer a,Integer b){
        return a+b;
    }

    public  static void swap(Integer i,Integer t){
//        a=a+b;
//        b=a-b;
//        a=a-b;
        Integer t1=i;
        i=t;
        t=i;
    }

    public static void main(String[] args) {
        Integer i=1,t=2;
        swap(i,t);
        System.out.println(i+"--t: "+t);
    }
}
