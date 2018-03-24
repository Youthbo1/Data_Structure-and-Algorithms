package practice;

import test1.Move_Zeroes_283.Solution;

/**
 * \Date: 2018/3/24
 * \
 * \Description:
 * \
 */
public class Solution283 {
    public static void moveZeroes(int[] nums) {
        int[] noZero=new int[nums.length];

        for (int i = 0,j=0; i <nums.length ; i++) {
            if(nums[i]!=0)
                noZero[j++]=nums[i];

        }

        for (int i = 0; i <noZero.length ; i++) {
            nums[i]=noZero[i];
        }

        for (int i = noZero.length; i <nums.length ; i++) {
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        Solution.moveZeroes(nums);

        for (int a: nums
                ) {
            System.out.print(a+" ");
        }
    }
}
