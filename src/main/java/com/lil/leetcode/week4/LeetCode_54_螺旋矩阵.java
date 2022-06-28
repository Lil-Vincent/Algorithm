package com.lil.leetcode.week4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Lil
 * @date 2022/06/28 22:57
 **/
public class LeetCode_54_螺旋矩阵 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new LinkedList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};
        boolean[][] status = new boolean[n][m];
        System.out.println(n + "" + m);
        for (int i = 0, x = 0, y = 0, d = 0; i < n * m; i++) {
            res.add(matrix[x][y]);
            status[x][y] = true;
            int a = x + dx[d];
            int b = y + dy[d];
            if (a < 0 || a >= n || b < 0 || b >= m || status[a][b]) {
                d = (d + 1) % dx.length;
                a = x + dx[d];
                b = y + dy[d];
            }
            x = a;
            y = b;
        }

        return res;
    }
}