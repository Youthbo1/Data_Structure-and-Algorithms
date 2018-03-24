package test4_查找问题.No1;

/**
 * \Date: 2017/12/11
 * \
 * \Description:
 * \Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * 给出一个整型数组nums。返回这个数组中两个数字的索引值i和j，
 * 使得nums[i] + nums[j] 等于一个给定的target值。两个索引不能相等。
 如 nums = [2, 7, 11, 15], target = 9
 返回 [0, 1]

 */
//暴力解
// Brute Force
//Time Complexity: O(n^2)
// Space Complexity: O(1)
public class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++)
            for (int j = 0; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    int[] res = {i, j};
                    return res;
                }

        throw new IllegalStateException("the input has no solution");
    }

    private static void printArr(int[] nums) {
        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums = {0, 4, 3, 0};
        int target = 7;
        printArr((new Solution()).twoSum(nums, target));

    }
}
