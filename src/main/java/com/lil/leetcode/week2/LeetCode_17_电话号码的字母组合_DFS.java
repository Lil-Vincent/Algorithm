package com.lil.leetcode.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/04/05 14:26
 **/
public class LeetCode_17_电话号码的字母组合_DFS {
    static String[] strs = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static List<String> ans = new ArrayList<>();

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return ans;
        dfs(digits, 0, "");
        return ans;
    }

    //u:digits的当前下标
    private static void dfs(String digits, int u, String path) {
        if (u == digits.length()) ans.add(path);
        else {
            String str = strs[digits.charAt(u) - '0'];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                dfs(digits, u + 1, c + path);
            }
        }
    }

    public static void main(String[] args) {
        letterCombinations("23");
    }
}