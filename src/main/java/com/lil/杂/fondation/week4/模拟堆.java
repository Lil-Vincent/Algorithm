package com.lil.杂.fondation.week4;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/6/14 16:48
 */
public class 模拟堆 {
    static int N = 100010;
    static int h[] = new int[N];
    static int size;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        while (m -- > 0){
            int op = in.nextInt();
            if ("I".equals(op)){
                int x = in.nextInt();
                h[++ size] = x;
                up(size);
            }
            else if ("PM".equals(op)){
                System.out.println(h[1]);
            }
            else if ("DM".equals(op)){
                h[1] = h[size --];
                down(1);
            }
            else if ("D".equals(op)){
                int k = in.nextInt();
                h[k] = h[size --];
                up(k); down(k);
            }
            else {
                int k = in.nextInt();
                int x = in.nextInt();
                h[k] = x;
                up(k); down(k);
            }
        }
    }

    private static void down(int u) {
        int t = u;
        if (2 * u <= size && h[t] > h[2 * u]) t = 2 * u;
        if (2 * u + 1 <= size && h[t] > h[2 * u + 1]) t = 2 * u + 1;
        if (t != u){
            int a = h[t];
            h[t] = h[u];
            h[u] = a;
            down(t);
        }
    }

    private static void up(int u) {

    }
}
