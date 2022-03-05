package com.lil.notCommonlyUs.fondation.week4;
import java.util.Scanner;
/**
 * @author Lil
 * @date 2021/6/13 22:04
 */
public class 堆排序 {
    public static int N = 100010;
    static int h[] = new int[N];
    static int n, m;
    static int size;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 1; i < n + 1; i++) h[i] = in.nextInt();
        size = n;

        for (int i = n / 2; i != 0; i --) down(i);

        while (m -- > 0){
            System.out.print(h[1] + " ");
            h[1] = h[size --];
            down(1);
        }
    }

    private static void down(int u) {
        int t = u;
        if (u * 2 <= size && h[t] > h[2 * u]) t = u * 2;
        if (u * 2 + 1 <= size && h[t] > h[2 * u + 1]) t = u * 2 + 1;
        if (u != t){
            int a = h[u];
            h[u] = h[t];
            h[t] = a;
            down(t);
        }
    }
}
