package test_12_04.Move_Zeroes_283;

public class Solution4 {
    public void moveZeroes(int[] nums) {
        for (int i = 0, k = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != k) {
                    nums[k] = nums[i];
                    nums[i] = 0;
                }
                k++;
            }
        }
    }
}
