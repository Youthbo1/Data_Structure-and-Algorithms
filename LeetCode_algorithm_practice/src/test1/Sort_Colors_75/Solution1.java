package test1.Sort_Colors_75;

/*给定一个包含红，白，蓝且长度为n的数组，将数组元素进行分类使同颜色的元素相邻，
并按照红、白、蓝的顺序进行排序。
我们可以使用整数0，1和2分别代表红，白，蓝。*/
public class Solution1 {
    public void sortColors(int[] nums) {
      // 三路快排
        int zero = -1;  //[0...zero]==0
        int two = nums.length;  //[two....n-1]==2
        for (int i = 0; i < two; ) {
            if(nums[i]==1) { //[zero+1,two-1]
                i++;
            } else if (nums[i]==2) {
                two--;
                swap(nums,i,two);
            }else{// ==0
                assert (nums[i]==0);
                zero++;
                swap(nums,i,zero);
                i++;
            }

        }

    }
    private  void swap(int[] nums, int a, int b) {
        int temp = nums[b] ;
        nums[b] = nums[a] ;
        nums[a] = temp;
    }


    public void sortColors1(int[] nums) {
        int zero=-1;//[0...zero]==0
        int two = nums.length;  //[two....n-1]==2

        for (int i = 0; i < two; ) {
            if(nums[i]==1){
                i++;
            }else if(nums[i]==2){
                two--;
                swap1(nums,i,two);
            }else{
                assert (nums[i]==0);
                zero++;
                swap1(nums,zero,i);
                i++;
            }
        }
    }

    private void swap1(int[] n,int a,int b){
        int t=n[a];
        n[a]=n[b];
        n[b]=t;
    }
}
