package com.lil.leetcode.week4;

/**
 * @author Lil
 * @date 2022/07/02 13:30
 **/
public class LeetCode_59_螺旋矩阵_II {
    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        //    int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        boolean[][] status = new boolean[n][n];
        for (int i = 1, x = 0, y = 0, d = 0; i <= n * n; i++) {
            res[x][y] = i;
            System.out.println("x:" + x + "y:" + y);
            status[x][y] = true;
            int a = x + dx[d];
            int b = y + dy[d];
            System.out.println("a:" + a + " b:" + b);
            if (a < 0 || a >= n || b < 0 || b >= n || status[a][b]) {
                d = (d + 1) % dx.length;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
            System.out.println("2. x:" + x + "y:" + y);
        }
        return res;
    }
}