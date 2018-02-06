package test4_查找问题.No242;

import java.util.Arrays;

/**
 * \Date: 2017/12/11
 * \
 * \Description:
 * \Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 */
public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();

        Arrays.sort(sArr);
        Arrays.sort(tArr);

        return String.valueOf(sArr).equals(String.valueOf(tArr));
    }
}
