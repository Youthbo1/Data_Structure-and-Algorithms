package test1.Move_Zeroes_283;
//给定一个数字数组，写一个方法将所有的“0”移动到数组尾部，同时保持其余非零元素的相对位置不变。
//例如，给定nums = [0, 1, 0, 3, 12]，在调用你的函数之后，nums应该变为[1, 3, 12, 0, 0]。
//备注：
//     你必须就地完成，不得复制该数组。
//     最小化总共的操作数。
public class Solution {

    //时间 O(n)
    //空间 O(n)
    public void moveZeroes(int[] nums) {
        int[] nonZero=new int[nums.length];
        System.out.println("0nonZero："+nonZero.length);
        //扫一遍 把非0存进数组  然后赋值给原数组
        //i扫原数组  j扫 非零数组
        for (int i = 0,j=0; i <nums.length ; i++) {
            if (nums[i]!=0) {
                nonZero[j] = nums[i];
                j++;
            }
        }

        for (int i = 0; i < nonZero.length; i++) {
            nums[i]=nonZero[i];
        }
        for (int i = nonZero.length; i <nums.length ; i++) {
            nums[i]=0;
        }

    }

    public static void test(int[] nums){
        int[] nonZero=new int[nums.length];
        System.out.println("0nonZero："+nonZero.length);
        for (int i = 0,j=0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nonZero[j++]=nums[i];

            }

        }
        System.out.println("1nonZero："+nonZero.length);
        for (int i = 0; i <nonZero.length ; i++) {
            nums[i]=nonZero[i];
        }
        System.out.println("nonZero："+nonZero.length);
        for (int i = nonZero.length; i <nums.length ; i++) {

            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        Solution.moveZeroes2(nums);

        for (int n:nums
             ) {
            System.out.print(n+" ");
        }
//        System.out.println(nums);
//        int[] a=new int[nums.length];
//        a[0]=1;a[1]=2;
//        System.out.println(a.length);
    }

    public static void moveZeroes2(int[] nums) {
        int[] nonZero=new int[nums.length];

        for (int i = 0,j=0; i <nums.length ; i++) {
            if(nums[i]!=0){
                nonZero[j++]=nums[i];
            }
        }
        for (int i = 0; i <nonZero.length ; i++) {
            nums[i]=nonZero[i];
        }
        for (int i = nonZero.length; i <nums.length ; i++) {

            nums[i]=0;
        }
    }
}
