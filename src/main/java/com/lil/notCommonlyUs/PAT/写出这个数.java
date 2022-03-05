package com.lil.notCommonlyUs.PAT;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/8/20 18:11
 */
public class 写出这个数 {
    static String[] pinyin = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int sum = 0;
        for (int i = 0; i < str.length(); i ++) {
            sum += str.charAt(i) - '0';
        }
        String s = sum + "";
        for (int i = 0; i < s.length(); i ++) {
            if (i != 0) {
                System.out.print(" ");
            }
                System.out.println(pinyin[s.charAt(i) - '0']);

        }
    }
}
