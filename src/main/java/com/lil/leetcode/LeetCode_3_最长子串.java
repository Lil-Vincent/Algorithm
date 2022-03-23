package com.lil.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lil
 * @date 2022/03/18 23:39
 **/
public class LeetCode_3_最长子串 {
    public int lengthOfLongestSubstring(String s) {
        char str[] = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        int res = 0;
        for (int i = 0, j = 0; j < str.length; j++) {
            map.put(str[j], map.getOrDefault(map.get(str[j]), 0) + 1);

            while (map.get(str[j]) > 1) {
                map.put(str[i], map.get(str[i]) - 1);
                i++;
            }

            res = Math.max(res, j - i + 1);
        }

        return res;
    }
}