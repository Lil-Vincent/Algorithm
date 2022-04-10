package com.lil.leetcode.week2;

/**
 * @author Lil
 * @date 2022/04/09 21:17
 **/
public class LeetCode_28_实现strStr {
    public int strStr(String haystack, String needle) {
        char[] chars = haystack.toCharArray();

        char key = needle.charAt(0);
        int res = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (chars[i] == key) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}