package java_problem;

/**
 * \Date: 2018/3/24
 * \
 * \Description:
 * \
 */
public class Singleton {
    static final int c=10;
    private Singleton(){}

    private static Singleton instance=null;

    static int i;
    public static Singleton getInstance(){
        i=1;
        if(instance==null){
            instance=new Singleton();

        }
        return instance;
    }
}
