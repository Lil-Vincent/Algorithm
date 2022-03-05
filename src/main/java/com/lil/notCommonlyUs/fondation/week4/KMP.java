package com.lil.notCommonlyUs.fondation.week4;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/6/3 22:13
 */
public class KMP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] p = new char[n+1];
        String P = sc.next();
        for(int i = 1; i <= n; i++){
            p[i] = P.charAt(i-1);
        }

        int m = sc.nextInt();
        char[] s = new char[m+1];
        String S = sc.next();
        for(int i = 1; i <= m; i++){
            s[i] = S.charAt(i-1);
        }

        int[] ne = new int[n+1];
        for(int i = 2, j = 0; i <= n; i++){
            while(j > 0 && p[i] != p[j+1]) j = ne[j];
            if(p[i] == p[j+1]) j++;
            ne[i] = j;
        }

        //KMP求解
        for(int i = 1, j = 0; i <= m; i++){
            //j = 0 的时候说明模式串的第一个位置就和长串不匹配,需要长串的指针 i 往后移,而不能让字串的j指针往后移,因为j已经不能再往前移了
            while(j != 0 && s[i] != p[j+1]) j = ne[j];
            if(s[i] == p[j+1]) j++;
            if(j == n){
                j = ne[j];
                System.out.print(i-n + " ");
            }
        }
    }
}


