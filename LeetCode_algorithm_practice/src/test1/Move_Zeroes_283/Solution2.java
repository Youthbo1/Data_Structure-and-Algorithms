package test1.Move_Zeroes_283;

public class Solution2 {
    public void moveZeroes(int[] nums) {

        int k = 0; //nums中,[0,k)的元素均为非0

        //遍历到第一个元素后，保证[0,i]中所有元素非0
        //都按照顺序排列在[0,...k)中
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
