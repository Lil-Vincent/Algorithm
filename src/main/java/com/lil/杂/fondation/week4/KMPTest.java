package com.lil.杂.fondation.week4;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/6/3 22:13
 */
public class KMPTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        char[] p = new char[n + 1];
        String P = in.next();
        for (int i = 1; i < n + 1; i++) {
            p[i] = P.charAt(i - 1);
        }

        int m = in.nextInt();
        char[] s = new char[m + 1];
        String S = in.next();
        for (int i = 1; i < m + 1; i++) {
            s[i] = S.charAt(i -1);
        }

        //求next数组
        int[] ne = new int[n + 1];
        for (int i = 2, j = 0; i < n + 1; i++) {
            while (j > 0 && p[i] != p[j + 1]) j = ne[j];
            if (p[i] == p[j + 1]) j ++;
            ne[i] = j;
        }

        //kmp匹配
        for (int i = 1, j = 0; i < m + 1; i++) {
            while (j > 0 && s[i] != p[j + 1]) j = ne[j];
            if (s[i] == p[j + 1]) j ++;
            if (j == n){
                j = ne[j];
                System.out.print(i - n + " ");
            }
        }
    }
}


