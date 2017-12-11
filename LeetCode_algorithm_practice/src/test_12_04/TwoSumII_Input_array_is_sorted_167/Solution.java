package test_12_04.TwoSumII_Input_array_is_sorted_167;

/*找到给定有序序列中两个数字的和是指定target，返回的是个list，包含两个数的index，从0开始。*/
public class Solution {
    public int[] sortColors(int[] numbers, int target) {

        assert (numbers.length>=2);
        int l = 0, r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                int[] n = {l + 1, r + 1};
                return n;
            } else if (numbers[l] + numbers[r] < target)
                l++;
            else
                r--;

        }
        return null;
    }

}
