package com.lil.leetcode.week1;

/**
 * @author Lil
 * @date 2022/04/02 16:09
 **/
public class LeetCode_9_回文数 {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int t = x;
        int y = 0;
        while (t != 0) {
            y = t % 10 + y * 10;
            t = t / 10;
        }
        return y == x;
    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}