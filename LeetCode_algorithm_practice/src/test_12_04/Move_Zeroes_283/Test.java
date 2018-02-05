package test_12_04.Move_Zeroes_283;

public class Test {
    public static void main(String[] args) {
        int[] nums={0,0,0,3,12,6,7,8};

        new Solution2().moveZeroes(nums);
        for (int i: nums
             ) {
            System.out.print(i+"--");
        }
    }
}
