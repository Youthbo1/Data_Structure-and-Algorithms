package test_12_05.Remove_Element_27;

//删除数组中指定的元素，并且返回新的数组长度。
public class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }

        return c;

    }
}
