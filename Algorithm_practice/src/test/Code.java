package test;

public class Code {
    public static void main(String[] args) {
        int N = 4;//以N=9为例，其余自然数同理
        String a[][] = new String[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                a[i][j] = " ";
            }
        }
        int times = N / 4 + 1;//递归次数
        //递归
        for (int m = 0; m < times; m++) {
            for (int r = 0; r < N - m * 4; r++) {//右方向
                a[2 * m][2 * m + r] = "*";
            }
            for (int d = 0; d <= N - m * 4 - 1; d++) {//下方向
                a[2 * m + d][2 * m + N - m * 4 - 1] = "*";
            }
            for (int l = 0; l <= N - m * 4 - 2; l++) {//左方向
                a[N - 2 * m - 1][N - 2 * m - 1 - l] = "*";
            }
            for (int u = 0; u <= N - m * 4 - 3; u++) {//上方向
                a[N - 2 * m - 1 - u][2 * m + 1] = "*";
            }

        }
        //打印输出图案
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
