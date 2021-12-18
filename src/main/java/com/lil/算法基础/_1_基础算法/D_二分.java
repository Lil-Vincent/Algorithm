package com.lil.算法基础._1_基础算法;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/12/18 23:25
 **/
public class D_二分 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m  = in.nextInt();
        int q[] = new int[n];

        for (int i = 0; i < n; i++) q[i] = in.nextInt();

        while (m -- != 0) {
            int l = 0, r = n -1;
            int x = in.nextInt();
            while (l < r) {
                int mid = l + r >> 1;
                if (q[mid] >= x) r = mid;
                else l = mid + 1;
            }

            if (q[l] != x) {
                System.out.println("-1 -1");
            }
            else {
                System.out.print(l + " ");
                l = 0;
                r = n -1;
                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    if (q[mid] <= x) l = mid;
                    else r = mid - 1;
                }
                System.out.println(l + " ");
            }
        }
    }
}