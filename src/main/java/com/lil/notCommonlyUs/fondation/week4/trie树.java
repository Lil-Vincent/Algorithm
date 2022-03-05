package com.lil.notCommonlyUs.fondation.week4;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/6/9 9:25
 */
public class trie树 {
    static int N = 20000,idx = 0;
    static int son[][] = new int[N][26];
    static int cnt[] = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n --> 0){
            String str = in.next();
            if (str.equals("I")) insert(in.next());
            else System.out.println(query(in.next()));
        }
        in.close();
    }

    public static void insert(String s){
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (son[p][u] == 0) son[p][u] = ++ idx;
            p = son[p][u];
        }
        cnt[p] ++;
    }

    public static int query(String s){
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            int u = s.charAt(i) - 'a';
            if (son[p][u] == 0) return 0;
            p = son[p][u];
        }
        return cnt[p];
    }
    
}


