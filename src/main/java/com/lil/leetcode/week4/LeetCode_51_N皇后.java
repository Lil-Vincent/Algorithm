package com.lil.leetcode.week4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/06/27 10:08
 **/
//斜线上对判重，需要把每一
public class LeetCode_51_N皇后 {
    boolean[] col, dg, udg;
    char[][] ans;
    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        col = new boolean[n];
        dg = new boolean[n * 2];
        udg = new boolean[n * 2];
        ans = new char[n][n];
        dfs(0, n);
        return res;
    }

    private void dfs(int u, int n) {
        if (u == n) {
            List<String> cur = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder s = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    s.append(ans[i][j] == 'Q' ? "Q" : ".");
                }
                cur.add(s.toString());
            }
            res.add(cur);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (!col[i] && !dg[i - u + n] && !udg[i + u]) {
                col[i] = dg[i - u + n] = udg[i + u] = true;
                ans[u][i] = 'Q';
                dfs(u + 1, n);
                ans[u][i] = '.';
                col[i] = dg[i - u + n] = udg[i + u] = false;
            }
        }
    }
}