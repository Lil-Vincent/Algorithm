package com.lil.算法基础._3_搜索与图论;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2022/04/05 14:43
 * <p>
 * <p>
 * DFS
 **/
public class A_排列数字_DFS_copy {
    static int N = 10;
    static int[] path = new int[N];
    static boolean st[] = new boolean[N];
    static int n;

    public static void dfs(int u) {
        if (u == n) {
            for (int i = 0; i < n; i++) System.out.print(path[i] + " ");
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            if (!st[i]) {
                path[u] = i;
                st[i] = true;
                dfs(u + 1);
                path[u] = 0;
                st[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = 3;
//        System.out.println(n);
        dfs(0);

    }
}