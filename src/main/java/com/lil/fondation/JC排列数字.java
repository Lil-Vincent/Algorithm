package com.lil.fondation;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/17 20:45
 */
public class JC排列数字 {
    static int N = 10;
    static int n;
    static boolean[] st = new boolean[N];
    static int[] path = new int[N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        dfs (0);
    }

    private static void dfs(int u) {
        if (u == n) {
            for (int i = 0; i < n; i++) System.out.print(path[i] + " ");
            System.out.println();
            return;
        }

        for (int i = 1; i <= n; i++) {
            if (!st[i]) {
                path[u] = i;
                st[i] = true;
                dfs(u + 1);
                st[i] = false;
            }
        }
    }
}
