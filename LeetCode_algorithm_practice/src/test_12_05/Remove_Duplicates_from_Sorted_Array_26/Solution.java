package test_12_05.Remove_Duplicates_from_Sorted_Array_26;

/*Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array,
you must do this by modifying the input array in-place with O(1) extra memory.*/
public class Solution {
    public static  int removeDuplicates(int[] nums) {

        int n = nums.length;
        if (n == 0)
            return 0;
        int l = 0;
        for (int r = 1; r < n; r++) {
            System.out.println("l:"+l+"  --nums[l]:"+nums[l]+"   r:"+r+" nums[r]"+nums[r]);
            if (nums[r] != nums[l]) {
                l++;
                System.out.println("******************");
                System.out.println("l:"+l+"  --nums[l]:"+nums[l]+"   r:"+r+" nums[r]"+nums[r]);
                nums[l] = nums[r];
                System.out.println("nums[l]:"+nums[l]+"   nums[r]"+nums[r]);
            }
        }
        System.out.println(nums.length);
        return l + 1;

    }

    public static void main(String[] args) {
        int[] n={0,0,2,2,5};
        System.out.println(removeDuplicates(n));
    }
}
