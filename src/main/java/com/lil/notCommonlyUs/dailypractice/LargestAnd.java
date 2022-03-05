package com.lil.notCommonlyUs.dailypractice;/**
 * @author Lil
 * @date 2021/5/13 9:35
 */

import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/13 9:35
 * @version 1.0
 */
public class LargestAnd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        for (int i = 0; i < n; i++) b[i] = in.nextInt();

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == 1) sum += a[i];
        }

        long v = 0, s = 0;
        for (int i = 0; i < n; i++) {
            if (b[i] == 0) s += a[i];
            if (i >= k && b[i - k] == 0) s -= a[i - k];
            v = Math.max(v, s);
        }
        System.out.println(s + v);
    }
}
