package test_12_05.No_80;

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

        int slow = 2;
        for(int fast = 2; fast < nums.length; fast++) {
            if(nums[fast] != nums[slow-2]) {
                nums[slow++] = nums[fast];
            }
        }
        return slow;
    }
}
