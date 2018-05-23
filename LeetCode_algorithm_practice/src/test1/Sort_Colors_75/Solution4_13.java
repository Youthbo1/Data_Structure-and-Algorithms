package test1.Sort_Colors_75;

/**
 * \Date: 2018/4/13
 * \
 * \Description:
 * \
 */
public class Solution4_13 {
    public void sortColors(int[] nums) {
        int[] cnt={0,0,0};


        for (int i = 0; i <nums.length ; i++) {
            assert(nums[i]>=0&&nums[i]<=2);

            cnt[nums[i]]++;
//            if(nums[i]==0)
//                cnt[0]++;
//            if(nums[i]==1)
//                cnt[1]++;
//            if(nums[i]==2)
//                cnt[2]++;
        }

        int index=0;
        for (int i = 0; i <cnt[0] ; i++) {
            nums[index++]=0;
        }
        for (int i = 0; i <cnt[1] ; i++) {
            nums[index++]=1;
        }
        for (int i = 0; i <cnt[2] ; i++) {
            nums[index++]=2;
        }

    }
}
