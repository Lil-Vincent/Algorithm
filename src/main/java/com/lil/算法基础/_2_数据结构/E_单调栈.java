package com.lil.算法基础._2_数据结构;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Lil
 * @date 2022/03/05 09:59
 **/
public class E_单调栈 {
    public static int N = 100010;
    public static int stk[] = new int[N];
    public static int tt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n -- > 0) {
            int x = in.nextInt();
            while (tt >= 0 && x <= stk[tt]) tt --;
            if (tt == 0) System.out.print(-1 + " ");
            else System.out.print(stk[tt] + " ");
            stk[ ++ tt] = x;
        }
    }
}