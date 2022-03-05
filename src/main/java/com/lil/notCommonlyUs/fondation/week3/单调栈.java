package com.lil.notCommonlyUs.fondation.week3;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/5/30 16:37
 */
public class 单调栈 {
    static int N = 100010;
    static int a[] = new int[N];
    static int stk[] = new int[N];
    static int tt;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int x = a[i];
            while (tt != 0 && stk[tt] >= x) tt --;
            if (tt == 0) System.out.print(-1 + " ");
            else System.out.print(stk[tt] + " ");
            stk[++ tt] = x;
        }
    }
}
