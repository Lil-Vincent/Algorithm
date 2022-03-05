package com.lil.notCommonlyUs.笔试面试;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/10/27 22:21
 */
public class _1_蛇形矩阵 {
    public static int N = 110;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int[][] res = new int[n][m];

        int[] dx = {0, 1, 0, -1}, dy = {1, 0, -1, 0};

        for (int i = 1, x = 0, y = 0, d = 0; i <= n * m; i++) {

            res[x][y] = i;
            System.out.println(res[x][y]);
            int a = x + dx[d];
            int b = y + dy[d];

            if (a < 0 || a >= n || b < 0 || b >= m || res[a][b] != 0) {
                d = (d + 1) % 4;
                a = x + dx[d];
                b = y + dy[d];
            }

            x = a;
            y = b;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
