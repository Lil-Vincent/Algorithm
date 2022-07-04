package com.lil.leetcode.week4;

/**
 * @author Lil
 * @date 2022/07/04 23:03
 **/
public class LeetCode_63_不同路_II {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length, m = obstacleGrid[0].length;
        int[][] f = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (obstacleGrid[i][j] == 0) {
                    if (i == 0 && j == 0) {
                        f[i][j] = 1;
                    } else {
                        if (i > 0) f[i][j] = f[i][j - 1];
                        if (j > 0) f[i][j] = f[i - 1][j];
                    }
                }
            }
        }
        return f[n - 1][m - 1];
    }
}