package com.lil.leetcode.week1;

/**
 * @author Lil
 * @date 2022/03/22 16:06
 * <p>
 * 1。 主要思路是枚举字符串中的字母，以每个字符串为中心，用双指针向两边扩散。
 * 2。 总共两种情况，当以当前字符串为中心，结果字符串是奇数个时， int l = i - 1, r = i + 1;
 * 偶数个时， l = i; r = i + 1;
 **/
public class LeetCode_5_最长回文子串 {
    public static String longestPalindrome(String s) {
        char[] str = s.toCharArray();
        int n = str.length;

        String res = "";
        for (int i = 0; i < n; i++) {

            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && r < str.length && str[l] == str[r]) {
                l--;
                r++;
            }
            if (res.length() < r - l - 1) res = s.substring(l + 1, r);//注意函数左闭右开

            l = i;
            r = i + 1;
            while (l >= 0 && r < str.length && str[l] == str[r]) {
                l--;
                r++;
            }
            if (res.length() < r - l - 1) res = s.substring(l + 1, r);
        }

        return res;
    }


    public static void main(String[] args) {
        String s = "cbbd";
        longestPalindrome(s);
    }
}