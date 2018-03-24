package test3.No209;

/**
 * \Date: 2017/12/8
 * \
 * \Description:
 * \Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray
 * of which the sum ≥ s. If there isn't one, return 0 instead.
 *For example, given the array [2,3,1,2,4,3] and s = 7,
 *the subarray [4,3] has the minimal length under the problem constraint.

 给定一个整型数组和一个数字s，找到数组中最短的一个连续子数组，使得连续子数组的数字和sum >= s，
 返回这个最短的连续子数组的长度值
 如，给定数组[2, 3, 1, 2, 4, 3], s = 7
 答案为[4, 3]，返回2

 1.暴力解：遍历所有的连续子数组[i...j]
 计算其和sum，验证sum >= s
 时间复杂度O(n^3)
2.优化暴力解：O(n^2)


 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int l=0,r=-1; //[l.r]窗口
        int sum=0;
        int res=nums.length+1;

        while (l<nums.length){
            //  <右边界++
            if((r+1)<nums.length&&sum<s){
                r++;
                sum+=nums[r];
            }else {//  >= l++ sum变小
                sum-=nums[l];
                l++;
            }

            if (sum>=s){
                res=min(res,r-l+1);
            }
        }

        if (res==(nums.length+1))
            return 0;

        return res;

    }

    public  int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    public static void main(String[] args) {
        int[] nums={2, 3, 1, 2, 4, 3};
        int res=new Solution().minSubArrayLen(7,nums);
        System.out.println(res);
    }
}
