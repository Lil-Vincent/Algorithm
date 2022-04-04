package com.lil.leetcode.week2;

import java.util.HashMap;

/**
 * @author Lil
 * @date 2022/04/04 14:01
 **/
public class LeetCode_13_罗马数字转整数 {
    public int romanToInt(String s) {
        HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
        char[] chars = s.toCharArray();
        hash.put('I', 1);
        hash.put('V', 5);
        hash.put('X', 10);
        hash.put('L', 50);
        hash.put('C', 100);
        hash.put('D', 500);
        hash.put('M', 1000);

        int res = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i + 1 < chars.length && hash.get(chars[i]) < hash.get(chars[i + 1])) {
                res -= hash.get(chars[i]);
            } else {
                res += hash.get(chars[i]);
            }
        }

        return res;
    }
}