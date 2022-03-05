package com.lil.notCommonlyUs.fondation.week2;/**
 * @author Lil
 * @date 2021/5/11 9:56
 */

import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/11 9:56
 * @version 1.0
 */
public class 差分 {
    static int N = 100010;
    static int a[] = new int[N];
    static int b[] = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int a[] = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            a[i] = in.nextInt();
            insert(i, i, a[i]);
        }

        while (m -- != 0){
            int l = in.nextInt();
            int r = in.nextInt();
            int c = in.nextInt();

            insert(l, r, c);
        }

        for (int i = 1; i < n + 1; i++) b[i] += b[i - 1];
        for (int i = 1; i < n + 1; i++) System.out.print(b[i] + " ");
    }

    public static void insert(int l, int r, int c){
        b[l] += c;
        b[r + 1] -= c;
    }
}
