package java_problem.static_;

/**
 * \Date: 2018/3/3
 * \
 * \Description:
 * \
 */
public class Singleton {
    private static Singleton instance = null;
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance==null){
            instance=new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
