package test4_查找问题.No350;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * \Date: 2017/12/11
 * \
 * \Description:
 * \给定两个数组nums，求两个数组的交集。
 * \如nums1 = [1, 2, 2, 1], nums2 = [2, 2]
 * \结果为[2, 2]
 * \出现的顺序可以是任意的
 */
public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> record = new HashMap<>(); //  <数字，频次>
        for(int num: nums1)
            if(!record.containsKey(num))
                record.put(num, 1);
            else//包含
                record.put(num, record.get(num) + 1);

        ArrayList<Integer> result = new ArrayList<>();
        for(int num: nums2)
            if(record.containsKey(num) && record.get(num) > 0){
                result.add(num);
                record.put(num, record.get(num) - 1);
            }

        int[] ret = new int[result.size()];
        int index = 0;
        for(Integer num: result)
            ret[index++] = num;

        return ret;
    }

    private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = (new Solution()).intersect(nums1, nums2);
        printArr(res);
    }
}
