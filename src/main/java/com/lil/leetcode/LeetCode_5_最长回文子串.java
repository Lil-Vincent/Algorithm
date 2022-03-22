package com.lil.leetcode;

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
        int n = s.length();
        String res = "";

        for (int i = 0; i < n; i++) {
            int l = i - 1, r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {//没有越界， 两个对称的字符串相等
                l--;
                r++;
            }
            if (res.length() < r - l - 1) res = s.substring(l + 1, r - l - 1);

            l = i;
            r = i + 1;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                l--;
                r++;
            }
            if (res.length() < r - l - 1) res = s.substring(l + 1, r - l - 1);
        }
        return res;
    }


    public static void main(String[] args) {
        String s = "cbbd";
        longestPalindrome(s);
    }
}