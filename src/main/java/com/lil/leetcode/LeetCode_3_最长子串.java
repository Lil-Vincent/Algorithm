package com.lil.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lil
 * @date 2022/03/18 23:39
 **/
public class LeetCode_3_最长子串 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> hash = new HashMap<>();
        char[] c = s.toCharArray();
        int res = 0;
        for (int i = 0, j = 0; j < s.length(); j++) {
            hash.put(c[j], hash.getOrDefault(c[j], 0) + 1);
            while (hash.get(c[j]) > 1) {
                hash.put(c[i], hash.get(c[i]) - 1);
                i ++;
            }
            res = Math.max(j - i + 1, res);
        }
        return res;

    }
}