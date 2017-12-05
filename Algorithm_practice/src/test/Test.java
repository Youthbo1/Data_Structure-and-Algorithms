package test;

public class Test {
    public static int[][] generateMatrix(int n) {
        if (n == 0)
            return new int[0][0];

        int[][] matrix = new int[2*n-1][2*n-1];
        int x = 0;
        int y = 0;
        int hang = matrix.length - 1; //行列界限
        int lie = matrix[0].length - 1;
        int i = 0, j = 1;
        while (x <= hang && y <= lie) {
            // up lie
            for (i = y; i <= lie; ++i, j++)
                matrix[x][i] = j;
            // right column
            for (i = x + 1; i <= hang; ++i, j++)
                matrix[i][lie] = j;
            // bottom lie
            for (i = lie - 1; hang != x && i >= y; --i, j++)
                matrix[hang][i] = j;
            // left column
            for (i = hang - 1; y != lie && i > x; --i, j++)
                matrix[i][y] = j;

            x++;
            y++;
            hang--;
            lie--;
        }
        return matrix;
    }
    public static boolean isT(boolean f){
        if(f){
            return  true;
        }else
            return false;
    }
    public static void main(String[] args) {
//        boolean f = false;
//        System.out.println("000");
//
//        assert isT(f);
//        System.out.println("1");

        int[][] n1=generateMatrix(2);
        for (int i = 0; i <n1.length ; i++) {
            for (int j = 0; j <n1[0].length ; j++) {
                System.out.print(n1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
