package com.lil.杂.PAT;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/8/22 21:34
 */
public class 换个格式输出整数 {
    static int GeWei[] = {12, 11, 10};
    static String s;
    static String shi;
    static int ge;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int bai = i / 100;
        int shiwei = i % 100 /10;
        int gewei = i % 100 % 10;

        while (bai > 0) {
            System.out.print("B");
            bai --;
        }

        while (shiwei > 0) {
            System.out.print("S");
            shiwei --;
        }

        for (int j = 1; j <= gewei; j++) {
            System.out.print(j);
        }
    }
}
