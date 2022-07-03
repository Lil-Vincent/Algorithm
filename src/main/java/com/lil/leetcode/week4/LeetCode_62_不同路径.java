package com.lil.leetcode.week4;

/**
 * @author Lil
 * @date 2022/07/03 19:47
 **/
public class LeetCode_62_不同路径 {
    public int uniquePaths(int m, int n) {
        int[][] f = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    f[i][j] = 1;
                } else {
                    if (i > 0) f[i][j] += f[i - 1][j];
                    if (j > 0) f[i][j] += f[i][j - 1];
                }
            }
        }
        return f[m - 1][n - 1];
    }
}