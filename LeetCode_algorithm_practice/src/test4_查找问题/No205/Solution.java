package test4_查找问题.No205;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * \Date: 2017/12/11
 * \
 * \Description:
 * \Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.
 判断两个字符串是否同构？
 如果我们能够寻找到一个字符集到字符集的映射，使得通过这个字符集的映射，s可以转变为t，则称为s和t同构。
 如 egg 和 add，返回true
 如 foo 和 bar，返回false
 如 paper 和 title，返回true

 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        //init check
        if(s==null || t==null) return false;
        if(s.length() != t.length()) return false;

        Map<Character, Character> map = new HashMap<Character, Character>();
        Set<Character> set = new HashSet<Character>();

        for(int i=0; i<s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map.containsKey(c1)) {
                if(map.get(c1) != c2) return false;
            } else {
                if(set.contains(c2)) return false;
                else {
                    map.put(c1, c2);
                    set.add(c2);
                }
            }
        }
        return true;
    }
}
