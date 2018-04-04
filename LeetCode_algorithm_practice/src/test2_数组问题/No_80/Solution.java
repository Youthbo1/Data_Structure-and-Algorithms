package test2_数组问题.No_80;

/*80. Remove Duplicates from Sorted Array II
给定一个有序数组，对数组中的元素去重，使得原数组的每个元素最多保留两个。返回去重后数组的长度值。

如 nums = [1, 1, 1, 2, 2, 3]，
结果应返回5，且nums的前五个元素为1, 1, 2, 2, 3
*/

public class Solution {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        //sum 对新数组长度计数  cnt对重复元素计数   pre存前一个
        int sum = 1, cnt = 1, pre = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (pre == nums[i]) {//i==i-1
                cnt++;   //++
                if (cnt <= 2) {

                    nums[sum++] = nums[i];
                }
            } else {//!=
                pre = nums[i];
                cnt = 1;

                nums[sum ++] = nums[i];
            }
        }
        return sum;
    }


    public int removeDuplicates1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        //k 对新数组长度计数  cnt对重复元素计数   pre存前一个
        int k = 1, cnt = 1, pre = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if(nums[i]==pre){
                cnt++;
                if (cnt<3){
                    nums[k]=nums[i];
                    k++;
                }
            }else {//!=
                cnt=1;
                pre=nums[i];

                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}

