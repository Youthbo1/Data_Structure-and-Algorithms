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
 * 判断字符串t是否是字符串s变换字符顺序后得到的结果
 如 s = “anagram”，t = “nagaram”，则返回true
 如 s = “rat”，t = “car”，则返回false

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
