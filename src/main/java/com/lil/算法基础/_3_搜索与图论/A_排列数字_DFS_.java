package com.lil.算法基础._3_搜索与图论;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author Lil
 * @date 2022/04/05 14:43
 * <p>
 * <p>
 * DFS
 **/
public class A_排列数字_DFS_ {
    static int n = 3;
    static int N = 10;
    static int path[] = new int[N];
    static boolean st[] = new boolean[N];//n


    static void dfs(int u) {
        if (u == n) {
            for (int i = 0; i < n; i++) System.out.print(path[i]);
            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {
            if (!st[i]) {//初始状态false，所以初始时  !st[i] == true
                path[u] = i;
                st[i] = true;
                dfs(u + 1);
                st[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}