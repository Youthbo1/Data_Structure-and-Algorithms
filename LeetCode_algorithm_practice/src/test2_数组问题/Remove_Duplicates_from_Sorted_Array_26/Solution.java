package test2_数组问题.Remove_Duplicates_from_Sorted_Array_26;

/*Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array,
you must do this by modifying the input array in-place with O(1) extra memory.

给定一个有序数组，对数组中的元素去重，使得原数组的每个元素只有一个。返回去重后数组的长度值。
如 nums = [1, 1, 2]，
结果应返回2，且nums的前两个元素为1和2

*/
public class Solution {
    public static  int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0)
            return 0;

        int l = 0;//left
        for (int r = 1; r < n; r++) {
            if (nums[r] != nums[l]) {
                l++;
                nums[l] = nums[r];
            }
        }
        return l + 1;

    }

    public static void main(String[] args) {
        int[] n={0,0,2,2,5};
        System.out.println(removeDuplicates(n));
    }
}
