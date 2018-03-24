package java_problem.test;

/**
 * \Date: 2018/3/24
 * \
 * \Description:
 * \
 */
class A{
    static {
        System.out.println("A static block1");

    }
    {
        System.out.println(" A block3");
    }
    public A(){
        System.out.println("A构造4");
    }

}

class B extends A{
    static {
        System.out.println("B static block2");
    }
    {
        System.out.println("B block5");
    }

    public B(){
        System.out.println("B constructor6");
    }
}
public class Initialization_sequence {
    public static void main(String[] args) {
        new B();
    }
}
