package test1.No26RemoveDuplicatedfromSortedArray;

/**
 * \Date: 2018/3/24
 * \
 * \Description:
 * \给定一个有序数组，对数组中的元素去重，使得原数组的每个元素只有一个。返回去重后数组的长度值。
 如 nums = [1, 1, 2]，
 结果应返回2，且nums的前两个元素为1和2

 */
public class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length==0)
            return 0;

        int left=0;

        for (int r = 1; r<nums.length ; r++) {

            if(nums[left]!=nums[r]){
                left++;
                nums[left]=nums[r];
            }
        }
        return left+1;
    }
}
