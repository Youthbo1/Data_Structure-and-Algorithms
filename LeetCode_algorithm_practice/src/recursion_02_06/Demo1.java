package recursion_02_06;

public class Demo1 {
    // 阶乘
    public static int Fact(int n) {

        if (n == 1) {
            return 1;
        } else if (n == 0) {
            return 1;
        } else {
            return n * Fact(n - 1);
        }
    }

    //递归可视化
    public static int print(int n) {
        if (n == 0) {
            return 0;
        } else {
            System.out.println(n);
            return print(n - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println(Fact(2));
    }
}
