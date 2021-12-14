package com.lil.算法基础._1_基础算法;

/**
 * @author Lil
 * @date 2021/12/12 23:14
 **/

import java.sql.SQLOutput;
import java.util.Scanner;

public class Z_递归的理解 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;
        printStartTerminal(0, n - 1);
    }



    private static void printStartTerminal(int l, int r) {
        System.out.print(" r = " + r +  " , ");
        if (l == r) System.out.print("l == r = " + l +  " , ");
        else {
            int mid = (l + r) / 2;
            System.out.print("mid = " + mid +  " , ");
            printStartTerminal(l, mid);
            printStartTerminal(mid + 1, r);
        }

    }

}