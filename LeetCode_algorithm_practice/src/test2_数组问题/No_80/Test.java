package test2_数组问题.No_80;

/**
 * \Date: 2018/2/7
 * \
 * \Description:
 * \
 */
public class Test {

    public static void main(String[] args) {
        int[] nums={1, 1, 1, 2, 2, 2,2};
        System.out.println(new Solution1().removeDuplicates(nums));
        for (int a:nums
                ) {
            System.out.print(a+" ");
        }
    }
}
