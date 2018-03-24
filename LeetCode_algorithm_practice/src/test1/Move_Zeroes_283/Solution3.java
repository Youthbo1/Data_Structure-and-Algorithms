package test1.Move_Zeroes_283;

public class Solution3 {
    public static void moveZeroes(int[] nums) {

        int k = 0; //nums中,[0,k)的元素均为非0

        //遍历到第一个元素后，保证[0,i]中所有元素非0
        //都按照顺序排列在[0,...k)中
        //[k,i]为0
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if(i!=k)
                    swap(nums, k++, i);
                else //i==k  全0
                    k++;
            }
        }

    }

    private static void swap(int[] nums, int a, int b) {
        nums[a] = nums[a] + nums[b];
        nums[b] = nums[a] - nums[b];
        nums[a] = nums[a] - nums[b];
    }

    public static void main(String[] args) {
        int[] nums={0,0,0,3,12};
        Solution3.moveZeroes(nums);
        for (int a:nums
             ) {
            System.out.print(a+" ");
        }
    }
}

