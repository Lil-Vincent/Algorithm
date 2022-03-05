package com.lil.notCommonlyUs.fondation.week2;/**
 * @author Lil
 * @date 2021/5/12 20:34
 */

import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/12 20:34
 * @version 1.0
 */
public class TargetTheArrayElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int x = in.nextInt();
        int[] q = new int[n];
        int[] s = new int[m];

        for (int i = 0; i < n; i++) q[i] = in.nextInt();
        for (int i = 0; i < m; i++) s[i] = in.nextInt();

        for (int i = 0, j = m - 1; i < n; i++) {
            while (j >= 0 && q[i] + s[j] > x) j--;
            if (q[i] + s[j] == x) {
                System.out.print(i + " " + j);
                break;
            }
        }
    }
}
