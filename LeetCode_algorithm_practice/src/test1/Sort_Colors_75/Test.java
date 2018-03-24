package test1.Sort_Colors_75;

/**
 * \Date: 2018/2/7
 * \
 * \Description:
 * \
 */
public class Test {
    public static void main(String[] args) {
        int[] nums={2,2,2,1,1,0,0,1};

        new Solution().sortColors(nums);

        for (int n:nums
             ) {
            System.out.print(n+" ");
        }
    }
}
