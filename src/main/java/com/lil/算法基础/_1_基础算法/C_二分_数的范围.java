package com.lil.算法基础._1_基础算法;

import com.sun.media.sound.SoftTuning;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/12/09 23:12
 **/
public class C_二分_数的范围 {
    public static void main(String[] args) {
        int N = 100010;
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int count = in.nextInt();
        int q[] = new int[len];
        for (int i = 0; i < len; i++) q[i] = in.nextInt();


        while (count-- > 0) {
            int x = in.nextInt();
            int l = 0, r = len - 1;
            while (l < r) {
                int mid = l + r >> 1;
                if (q[mid] >= x) r = mid;
                else l = mid + 1;
            }

            if (q[l] != x) System.out.println("-1" + "-1");
            else {
                System.out.print(l + " ");
                l = 0;
                r = len - 1;
                while (l < r) {
                    int mid = l + r + 1 >> 1;
                    if (q[mid] <= x) l = mid;
                    else r = mid - 1;
                }
                System.out.println(l);
            }
        }
    }
}