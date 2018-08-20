package test1.No27;

/**
 * \Date: 2018/8/20
 * \
 * \Description:
 * \
 */

public class Solution {
    private int c;

    public static int removeElement(int[] nums, int val) {
        int result = 0;
        int index = 0;
        while (index < nums.length) {
            if (nums[index] != val)
                nums[result++] = nums[index];
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] i = {1, 2, 3, 2, 5, 4};
        int c = Solution.removeElement(i, 2);
        System.out.println(c);
    }
}
