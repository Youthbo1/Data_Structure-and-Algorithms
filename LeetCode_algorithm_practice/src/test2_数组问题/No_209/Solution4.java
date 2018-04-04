package test2_数组问题.No_209;

/**
 * \Date: 2018/4/4
 * \
 * \Description:
 * \
 */
public class Solution4 {
    public int minSubArrayLen(int s, int[] nums) {

        if(s <= 0 || nums == null)
            throw new IllegalArgumentException("Illigal Arguments");

        int l = 0 , r = -1; // sliding window: nums[l...r]
        int sum = 0;
        int res = nums.length + 1;

        while(r + 1 < nums.length){

            while(r + 1 < nums.length && sum < s)
                sum += nums[++r];

            if(sum >= s)
                res = Math.min(res, r - l + 1);

            while(l < nums.length && sum >= s){
                sum -= nums[l++];
                if(sum >= s)
                    res = Math.min(res, r - l + 1);
            }
        }

        if(res == nums.length + 1)
            return 0;
        return res;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, 1, 2, 4, 3};
        int s = 7;
        System.out.println((new Solution4()).minSubArrayLen(s, nums));
    }
}
