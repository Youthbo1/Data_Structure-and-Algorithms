package test3.No209;

import static java.lang.Math.min;

/**
 * \Date: 2017/12/8
 * \
 * \Description:
 * \Given an array of n positive integers and a positive integer s, find the minimal length of a contiguous subarray
 * of which the sum ≥ s. If there isn't one, return 0 instead.
 For example, given the array [2,3,1,2,4,3] and s = 7,
 the subarray [4,3] has the minimal length under the problem constraint.
 */
public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int l=0,r=-1;//[l.r]
        int sum=0;
        int res=nums.length+1;

        while (l<nums.length){
            if((r+1)<nums.length&&sum<s){
                r++;
                sum+=nums[r];
            }else {
                sum-=nums[l];
                l++;
            }

            if (sum>=s){
                res=min(res,r-l+1);
            }
        }

        if (res==(nums.length+1)) {
            return 0;
        }

        return res;

    }

    public  int min(int a, int b) {
        return (a <= b) ? a : b;
    }
}
