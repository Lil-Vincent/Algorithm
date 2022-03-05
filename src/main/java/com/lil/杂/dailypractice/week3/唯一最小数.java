package com.lil.杂.dailypractice.week3;


import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/9 10:15
 */
public class 唯一最小数 {
    static int N = 200010;
    static int[] w = new int[N], cnt = new int[N];
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        while (m -- > 0) {
            int n = in.nextInt();
            for (int i = 0; i < n + 1; i ++) cnt[i] = 0;
            for (int i = 0; i < n; i++) {
                w[i] = in.nextInt();
                cnt[w[i]]++;
            }
            int res = -1;
            for (int i = 0; i < n; i++) {
                if (cnt[w[i]] == 1){
                    if (res == -1 || w[res] > w[i]) res = i;
                }
            }
            if (res != -1) res ++;
            System.out.println(res);
        }
    }
}
