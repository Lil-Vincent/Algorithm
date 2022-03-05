package com.lil.杂.fondation.week6;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/10 17:15
 */
public class 排列数字 {
    static int n,N = 8;
    static boolean st[] = new boolean[N];
    static int path[] = new int[N];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        dfs(0);
    }
    private static void dfs(int u) {//递归处理每一个位置
        if(u==n) {
            for(int i = 0 ; i < n; i++) System.out.print(path[i]+" ");
            System.out.println();
            return;
        }
        for(int i = 1;i <= n ; i++) {//抉择每一个数能不能放入当前位置
            if(!st[i]) {
                path[u] = i;
                st[i] = true;
                dfs(u+1);
                st[i] = false;
            }
        }
    }
}
