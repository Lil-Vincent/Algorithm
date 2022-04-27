package com.lil.leetcode.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/04/09 12:43
 **/

// 关键点，
// 1、左括号点数量不大于n，
// 2、右括号点数量不大于n且不大于左括号点数量
public class LeetCode_22_括号生成_DFS {
    List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(n, 0, 0, "");
        return res;
    }

    void dfs(int n, int lc, int rc, String path) {
        if (lc == n && rc == n) {
            res.add(path);
            return;
        } else {
            if (lc < n) dfs(n, lc + 1, rc, path + "(");
            if (rc < lc && rc < n) dfs(n, lc, rc + 1, path + ")");
        }
    }

}