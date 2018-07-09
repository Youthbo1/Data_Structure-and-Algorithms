package test1;

public class Test {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("h");
        test(s1);
        System.out.println(s1);
    }
    public static void test(StringBuffer ss1){
        ss1=new StringBuffer("ww");
    }
}
