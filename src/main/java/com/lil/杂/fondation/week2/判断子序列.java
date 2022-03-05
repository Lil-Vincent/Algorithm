package com.lil.杂.fondation.week2;/**
 * @author Lil
 * @date 2021/5/15 11:02
 */

import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/15 11:02
 * @version 1.0
 */
public class 判断子序列 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        int a[] = new int[n];
        int b[] = new int[m];
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        for (int i = 0; i < m; i++) b[i] = in.nextInt();

        int i = 0,j = 0;
        while (i < n && j < m){
            if (a[i] == b[j]) i ++;
            j ++;
        }
        if (i == n) System.out.println("Yes");
        else System.out.println("No");
    }
}
