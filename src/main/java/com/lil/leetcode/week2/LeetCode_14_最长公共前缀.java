package com.lil.leetcode.week2;

/**
 * @author Lil
 * @date 2022/04/05 21:40
 **/
public class LeetCode_14_最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        if (strs.length == 0) return res;

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (String s : strs) {
                if (i > s.length() - 1) return res;
                if (s.charAt(i) != c) return res;
            }
            res += c;
        }

        return res;
    }


    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        String s = longestCommonPrefix(strs);
    }
}