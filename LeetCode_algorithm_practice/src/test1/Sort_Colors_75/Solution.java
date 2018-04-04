package test1.Sort_Colors_75;

/*给定一个包含红，白，蓝且长度为n的数组，将数组元素进行分类使同颜色的元素相邻，
并按照红、白、蓝的顺序进行排序。
我们可以使用整数0，1和2分别代表红，白，蓝。*/
public class Solution {
    public void sortColors(int[] nums) {

        //o(1)

        int[] count = {0, 0, 0};//存放0 1 2元素频率
        for (int i = 0; i < nums.length; i++) {
            assert (nums[i] >= 0 && nums[i] <= 2);//防止数组越界
            count[nums[i]]++;
        }

        int index = 0;
        for (int i = 0; i <count[0]; i++) {
            nums[index++]=0;
        }
        for (int i = 0; i <count[1] ; i++) {
            nums[index++]=1;
        }
        for (int i = 0; i <count[2] ; i++) {
            nums[index++]=2;
        }

    }


    public void sortColors1(int[] nums) {

        //o(1)

        int[] c={0,0,0};

        for (int i = 0; i <nums.length ; i++) {
            assert (nums[i]>=0&&nums[i]<=2);
            c[nums[i]]++;
        }

        int index=0;
        for (int i = 0; i <c[0] ; i++) {
            nums[index++]=0;
        }
        for (int i = 0; i <c[1] ; i++) {
            nums[index++]=1;
        }
        for (int i = 0; i <c[2] ; i++) {
            nums[index++]=2;
        }

    }
}
