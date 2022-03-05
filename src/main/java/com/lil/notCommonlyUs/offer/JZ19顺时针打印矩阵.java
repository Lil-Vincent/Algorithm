package com.lil.notCommonlyUs.offer;

/**
 * @author Lil
 * @date 2021/7/27 0:52
 * 思路:
 *  1. 下表和方向关联. {0, 1, 2, 3}分别代表 上, 右, 下, 左
 *  2. 由于 1 的存在, 所以改变方向 d = d = (d + 1) % 4, xx = x + dx[d]; yy = y + dy[d];
 */
public class JZ19顺时针打印矩阵 {
    class Solution {
        public int[] printMatrix(int[][] matrix) {
            if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new int[0];

            int n = matrix.length, m = matrix[0].length;
            boolean[][] st = new boolean[n][m];
            int[] res = new int[n * m];

            int[] dx = {-1, 0, 1, 0}, dy = {0, 1, 0, -1};
            int x = 0, y = 0, d = 1;
            for (int i = 0; i < n * m; i++) {
                res[i] = matrix[x][y];
                st[x][y] = true;

                int xx = x + dx[d], yy = x + dy[d];
                if (xx < 0 || xx >= n || yy < 0 || yy >= m || st[xx][yy] == true){
                    d = (d + 1) % 4;
                    xx = x + dx[d]; yy = y + dy[d];
                }
                x = xx; y = yy;
            }
            return res;
        }
    }

}
