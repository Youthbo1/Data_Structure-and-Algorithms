package test_12_11_查找问题.No242;

import java.util.HashMap;

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
public class Solution1 {
    public boolean isAnagram(String s, String t) {
        if (s.equals(t)) {
            return true;
        }

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            if (sMap.containsKey(s.charAt(i))) {
                sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
            } else {
                sMap.put(s.charAt(i), 1);
            }

            if (tMap.containsKey(t.charAt(i))) {
                tMap.put(t.charAt(i), tMap.get(t.charAt(i)) + 1);
            } else {
                tMap.put(t.charAt(i), 1);
            }
        }
        for (Character key : sMap.keySet()) {
            if (!tMap.containsKey(key) || !tMap.get(key).equals(sMap.get(key))) {
                return false;
            }
        }
        return true;
    }
}
