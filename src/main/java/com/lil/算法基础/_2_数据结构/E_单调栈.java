package com.lil.算法基础._2_数据结构;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2022/03/05 09:59
 **/
public class E_单调栈 {
    public static int N = 100010,tt;
    public static int stk[] = new int[N];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int q[] = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = in.nextInt();
            while (tt != 0 && q[i] <= stk[tt]) tt --;
            if (tt != 0) System.out.print(stk[tt] + " ");
            else System.out.print(-1 + " ");
            stk[++ tt] = q[i];
        }
        return;
    }

}