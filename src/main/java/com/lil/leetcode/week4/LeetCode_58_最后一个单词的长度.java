package com.lil.leetcode.week4;

/**
 * @author Lil
 * @date 2022/07/01 23:32
 **/
public class LeetCode_58_最后一个单词的长度 {
    public int lengthOfLastWord(String s) {
        char[] str = s.toCharArray();
        int res = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == ' ') continue;
            int j = i + 1;
            while (j < str.length && str[j] != ' ') j++;
            res = j - i;
            i = j - 1;
        }
        return res;
    }
}