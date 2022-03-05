package com.lil.杂.fondation.week6;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/13 9:49
 */
class Pair {
    int x;
    int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 走迷宫 {

    static int N = 110;
    private static int m, n;
    private static int[][] g = new int[N][N], d = new int[N][N];
    static Scanner in = new Scanner(System.in);

    private static int bfs() {
        Queue<Pair> queue = new LinkedList();
        queue.add(new Pair(0, 0));

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};

        while (!queue.isEmpty()) {
            Pair temp = queue.poll();
            for (int i = 0; i < 4; i++) {
                int x = temp.x + dx[i];
                int y = temp.y + dy[i];

                if (x >= 0 && x < n && y >= 0 && y < m && g[x][y] == 0 && d[x][y] == -1) {
                    d[x][y] = d[temp.x][temp.y] + 1;
                    queue.add(new Pair(x, y));
                }
            }

        }
        return d[n - 1][m - 1];
    }


    public static void main(String[] args) {

        n = in.nextInt();
        m = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j] = -1;
                g[i][j] = in.nextInt();
            }
        }
        d[0][0] = 0;

        System.out.println(bfs());

    }

}

