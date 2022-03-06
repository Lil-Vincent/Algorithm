package com.lil.算法基础._2_数据结构;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Lil
 * @date 2022/03/05 23:51
 *
 **/
public class F_滑动窗口_单调队列 {
    public static int N = 1000010;
    public static int hh, tt = -1;
    public static int q[] = new int[N];

    /**
     * 用队列来维护一个单调的队列，用于存放数组的一个下标。
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(n + " " + k);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {

            // i - k + 1是以i为右端点、长度为k的区间的左端点，如果q[hh]的值比左端点小，那就说明队头节点已经不在区间中了，需要弹出。
            if (hh <= tt && q[hh] < i - k + 1) {hh ++;}

            while (hh <= tt && a[q[tt]] >= a[i]) {tt --;}

            q[++ hh] = i;

            // i > k - 1 保证右端点 i 到 i - k + 1 的长度是有k个数值的
            if (i + 1 >= k){System.out.println(a[q[hh]] + " ");}
        }
    }
}