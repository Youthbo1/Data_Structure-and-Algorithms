package java_problem.test;

/**
 * \Date: 2018/3/24
 * \
 * \Description:
 * \byte short int long double float char boolean
 */
public class Demo1 {

    static {
        System.out.println("h1");
    }
    public static void main(String[] args) {
        System.out.println("h2");
        for (int i = 0; i <args.length ; i++) {
            System.out.println(args[i]);
        }

        String i="ss";
        if(i instanceof String){
            System.out.println(i instanceof String);
        }
    }
    static {
        System.out.println("h1..");
    }
}
