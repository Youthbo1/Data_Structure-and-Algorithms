package test4_查找问题.No290;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * \Date: 2017/12/11
 * \
 * \Description:
 * \Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.

 给出一个模式（pattern）以及一个字符串，判断这个字符串是否符合模式？
 如pattern=“abba”，str=“dog cat cat dog”，返回true
 如pattern=“abba”，str=“dog cat cat fish”，返回false

 */
public class Solution {

    public boolean wordPattern(String pattern, String str) {
        //input check

        String[] strs = str.split(" ");
        if(pattern.length() != strs.length  ) {
            return false;
        }

        Map<Character, String> map = new HashMap<>();
        Set<String> unique = new HashSet<>();

        for(int i=0; i<pattern.length(); i++) {
            char c = pattern.charAt(i);
            if(map.containsKey(c) ) {
                if(!map.get(c).equals(strs[i])) {
                    return false;
                }
            } else {
                if(unique.contains(strs[i])) {
                    return false;
                }
                map.put(c, strs[i]);
                unique.add(strs[i]);
            }
        }
        return true;
    }
}
