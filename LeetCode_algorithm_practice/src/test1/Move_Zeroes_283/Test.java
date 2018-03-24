package test1.Move_Zeroes_283;

public class Test {
    public static void main(String[] args) {
        int[] nums={0,0,0,3,12};


        new Solution4().moveZeroes(nums);
        for (int a:nums
                ) {
            System.out.print(a+" ");
        }
    }
}
