package com.lil.算法基础._2_数据结构;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2022/03/04 23:57
 **/
public class C_栈 {
    public static int N = 100010;
    static int stk[] = new int[N], tt;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n -- > 0) {
            String str = in.next();
            if (str.equals("push")) {
                int m = in.nextInt();
                stk[++ tt] = m;
            }else if (str.equals("pop")) {
                tt --;
            }else if (str.equals("empty")) {
                System.out.println((tt == 0 ? "YES" : "NO"));
            }else{
                System.out.println(stk[tt]);
            }
        }
    }
}