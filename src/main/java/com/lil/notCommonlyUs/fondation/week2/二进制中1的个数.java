package com.lil.notCommonlyUs.fondation.week2;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/5/17 22:56
 */
public class 二进制中1的个数 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n -- != 0){
            int m = in.nextInt();
            int cut = 0;
            while (m != 0){
                m -= lowBit(m);
                cut++;
            }
            System.out.print(cut + " ");
        }
    }
    public static int lowBit(int x){
        return x & -x;
    }
}
