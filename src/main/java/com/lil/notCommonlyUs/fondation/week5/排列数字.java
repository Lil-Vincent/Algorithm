package com.lil.notCommonlyUs.fondation.week5;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/6/18 7:12
 */
public class 排列数字 {
    static int n = 0;
    static int q[] = new int[10];
    static int st[] = new int[10];

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        dfs(1);
    }

    static void dfs(int u){
        if(u > n){
            for(int i = 1;i <= n;i ++){
                System.out.print(q[i]+" ");
            }
            System.out.println();
            return ;
        }
        for(int i = 1;i <= n;i ++)
        {
            if(st[i] == 0)
            {
                st[i] = 1;
                q[u] = i;
                dfs(u + 1);
                st[i] = 0;
            }
        }
    }
}
