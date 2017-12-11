package test_12_11_查找问题.No349;

import java.util.HashSet;

/**
 * \Date: 2017/12/11
 * \ Intersection of Two Arrays
 * \Description:
 * \Given two arrays, write a function to compute their intersection.
 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 */
public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> record = new HashSet<>();
        for(int num: nums1)
            record.add(num);

        HashSet<Integer> resultSet = new HashSet<>();
        for(int num: nums2)
            if(record.contains(num))
                resultSet.add(num);

        int[] res = new int[resultSet.size()];
        int index = 0;
        for(Integer num: resultSet)
            res[index++] = num;

        return res;
    }

    private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2,1};
        int[] res = (new Solution()).intersection(nums1, nums2);
        printArr(res);
    }
}
