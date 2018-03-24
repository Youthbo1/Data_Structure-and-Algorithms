package test2_数组问题.Remove_Element_27;

/*删除数组中指定的元素，并且返回新的数组长度。
给定一个数组nums和一个数值val，将数组中所有等于val的元素删除，并返回剩余的元素个数。
如nums = [3, 2, 2, 3], val = 3；
返回2，且nums中前两个元素为2
*/
public class Solution {
    public int removeElement(int[] nums, int val) {
        int c = 0;//[0,c]里没有val
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }

        return c;

    }
}
