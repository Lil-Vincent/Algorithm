package com.lil.fondation.week2;/**
 * @author Lil
 * @date 2021/5/9 19:25
 */

import java.io.BufferedInputStream;
import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/9 19:25
 * @version 1.0
 */
public class PrefixAnd {
    static int S[];
    static int a[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int a[] = new int[n + 1];
        int S[] = new int[n + 1];

        for (int i = 1; i < n + 1; i++) a[i] = in.nextInt();
        for (int i = 1; i < n + 1; i++) S[i] = S[i - 1] + a[i];

        while (m -- != 0){
            int l = in.nextInt();
            int r = in.nextInt();

            int Si = S[r] - S[l - 1];
            System.out.println(Si);
        }
    }
}
