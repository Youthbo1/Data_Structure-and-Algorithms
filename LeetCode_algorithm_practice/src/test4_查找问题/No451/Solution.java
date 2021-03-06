package test4_查找问题.No451;

import java.util.*;

/**
 * \Date: 2017/12/11
 * \
 * \Description:
 * \Given a string, sort it in decreasing order based on the frequency of characters.
 * Example 1:

 Input:
 "tree"

 Output:
 "eert"

 Explanation:
 'e' appears twice while 'r' and 't' both appear once.
 So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

 给定一个字符串，按照字母出现频率的倒序重组整个字符串
 如“tree”，返回“eert”
 如“cccaaa”，返回“cccaaa”
 如“Aabb”，返回“bbAa”
 对于相同频次的字母，顺序任意。大小写敏感。

 */
public class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        List<Map.Entry<Character, Integer>> list = new LinkedList<>();
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            list.add(m);
        }

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> m1, Map.Entry<Character, Integer> m2) {
                return m2.getValue() - m1.getValue();
            }
        });

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> m : list) {
            for (int i = 0; i < m.getValue(); i++) {
                sb.append(m.getKey());
            }
        }
        return sb.toString();
    }
}
