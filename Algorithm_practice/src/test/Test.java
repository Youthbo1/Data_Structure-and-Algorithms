package test;

public class Test {

    public static boolean isT(boolean f){
        if(f){
            return  true;
        }else
            return false;
    }
    public static void main(String[] args) {
        boolean f = false;
        System.out.println("000");

        assert isT(f);
        System.out.println("1");
    }
}
