package java_problem.static_;

/**
 * \Date: 2018/3/3
 * \
 * \Description:
 * \
 */
public class Test2 {

    static boolean flag;//1

    static { //2
        System.out.println("static 代码块");
    }

    public static void main(String[] args) {
        System.out.println("main");

        System.out.println(test());

    }
    public static int test(){
        int a=1;
        try {
            a++;
            return a;
        }catch (Exception e){

        }finally {
            a++;
            return a;
        }
    }

}
