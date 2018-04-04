package test2_数组问题.No_80;

/**
 * \Date: 2017/12/5
 * \
 * \Description:
 * \
 */
public class Solution1 {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length <= 2) {
            return nums.length;
        }

        int k= 2;
        for(int i = 2; i < nums.length; i++) {
            if(nums[i] != nums[k-2]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
