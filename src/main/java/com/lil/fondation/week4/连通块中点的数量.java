package com.lil.fondation.week4;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/6/12 21:50
 */
public class 连通块中点的数量 {
    public static int N = 100010;
    static int n, m;
    static int p[];
    static int size[];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        p = new int[n + 1];
        size = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            p[i] = i;
            size[i] = 1;
        }
        while (m -- > 0){
            String op = in.next();
            if ("C".equals(op)) {
                int a = in.nextInt();
                int b = in.nextInt();
                if (find(a) != find(b)){
                    size[find(b)] += size[find(a)];
                    p[find(a)] = find(b);
                }
            }
            else if ("Q1".equals(op)){
                int a = in.nextInt();
                int b = in.nextInt();
                if (find(a) == find(b)) System.out.println("Yes");
                else System.out.println("No");
            }
            else {
                int x = in.nextInt();
                System.out.println(size[find(x)]);
            }
        }
    }
    public static int find(int x){
        if (x != p[x]) p[x] = find(p[x]);
        return p[x];
    }
}
