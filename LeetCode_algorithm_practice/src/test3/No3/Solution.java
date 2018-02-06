package test3.No3;

/**
 * \Date: 2017/12/8
 * \
 * \Description:
 * \
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {

        int[] freq = new int[256];//ascii码表 256个

        int l = 0, r = -1; // sliding window: s[l...r]
        int res = 0;

        while (r + 1 < s.length()) {

            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                r++;
                freq[s.charAt(r)]++;
            } else {//freq[s[r+1]] == 1
                freq[s.charAt(l)]--;
                l++;
            }

            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
