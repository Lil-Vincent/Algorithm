package com.lil.leetcode.week3;

/**
 * @author Lil
 * @date 2022/04/15 16:46
 **/
public class LeetCode_38_外观数列 {
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 0; i < n - 1; i++) {
            String t = "";
            int l = 0;
            while (l < s.length()) {
                int r = l + 1;
                while (r < s.length() && s.charAt(l) == s.charAt(r)) r++;
                t += r - l + "" + s.charAt(l);
                l = r;
            }
            s = t;
        }
        return s;
    }

    public static void main(String[] args) {
        countAndSay(4);
    }
}