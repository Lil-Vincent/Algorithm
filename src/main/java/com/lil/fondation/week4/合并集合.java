package com.lil.fondation.week4;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/6/12 21:50
 */
public class 合并集合 {
    public static int N = 100010;
    static int n, m;
    static int p[] = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for (int i = 1; i < n + 1; i++) {
            p[i] = i;
        }
        while (m -- > 0){
            String op = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            if (op.equals("M")) p[find(a)] = find(b);
            else {
                if (find(a) == find(b)) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
    public static int find(int x){
        if (x != p[x]) p[x] = find(p[x]);
        return p[x];
    }
}
