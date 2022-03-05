package com.lil.notCommonlyUs.fondation.week2;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/5/17 22:26
 */
public class n的二进制表示中第k位是几 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        System.out.println(n >> k & 1);//1&0=0；1&1=1
    }
}
