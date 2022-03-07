package com.lil.算法基础._2_数据结构;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Lil
 * @date 2022/03/05 23:51
 *
 **/
public class F_滑动窗口_单调队列 {
    public static int N = 100010;
    public static int q[] = new int[N];
    public static int hh = 0, tt = -1;

    /**
     * 用队列来维护一个单调的队列，用于存放数组的一个下标。
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (tt >= hh && hh < i - k + 1) hh ++;
            while (tt >= hh && a[i] < a[q[hh]]) tt --;
            q[++ tt] = i;
            if (i >= k - 1) System.out.println(a[q[hh]]);
        }
    }

}