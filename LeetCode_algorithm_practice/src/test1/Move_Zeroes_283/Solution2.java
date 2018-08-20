package test1.Move_Zeroes_283;

public class Solution2 {
    public void moveZeroes(int[] nums) {

        int k = 0; //nums中,[0,k)的元素均为非0

        //遍历到第一个元素后，保证[0,i]中所有元素非0
        //都按照顺序排列在[0,...k)中
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }
        for (int i = k; i < nums.length; i++) {
            nums[i] = 0;
        }

    }
    public static void moveZerwoes1(int[] nums) {

        int k = 0; //nums中,[0,k)的元素均为非0

        //遍历到第一个元素后，保证[0,i]中所有元素非0
        //都按照顺序排列在[0,...k)中
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[k++]=nums[i];
            }
        }
        for (int i = k; i <nums.length ; i++) {
            nums[i]=0;
        }
    }
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        Solution2.moveZerwoes1(nums);

        for (int n:nums
                ) {
            System.out.print(n+" ");
        }
//        System.out.println(nums);
//        int[] a=new int[nums.length];
//        a[0]=1;a[1]=2;
//        System.out.println(a.length);
    }
}
