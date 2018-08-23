package test1.No_88;

/**
 * \Date: 2018/4/4
 * \
 * \Description:
 * \给定两个有序整型数组nums1, nums2，将nums2的元素归并到nums1中

 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k = m + n - 1;
        int i = m - 1;
        int j = n - 1;

        while (k >= 0) {
            if (i < 0) {
                nums1[k--] = nums2[j--];
                continue;
            }
            if (j < 0) {
                break;
            }

            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }
}
