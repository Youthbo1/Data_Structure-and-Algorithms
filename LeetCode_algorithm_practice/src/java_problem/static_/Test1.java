package java_problem.static_;

/**
 * \Date: 2018/3/3
 * \
 * \Description:
 * \Java静态变量初始化遵循以下规则:

 静态变量会按照声明的顺序先依次声明并设置为该类型的默认值，但不赋值为初始化的值。
 声明完毕后,再按声明的顺序依次设置为初始化的值，如果没有初始化的值就跳过。
 看了这个就会明白,原来Test.a的值变化了三次。

 声明时设置为0>>Test1::Test1里设置为1>>Test.a初始化为0

 */
public class Test1 {

    Add add=new Add();
    static  int a=1;
    static int b;

    public static void main(String[] args) {

        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}

class Add{
    public  Add(){
        Test1.a++;
        Test1.b++;
    }
}
