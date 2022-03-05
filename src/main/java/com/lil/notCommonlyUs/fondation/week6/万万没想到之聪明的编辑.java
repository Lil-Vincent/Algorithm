package com.lil.notCommonlyUs.fondation.week6;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/8 16:09
 */
public class 万万没想到之聪明的编辑 {
    private static String solution(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            char num_1 = str.charAt(i);
            char num_2 = str.charAt(i + 1);
            char num_3 = str.charAt(i + 2);
            if (num_1 == num_2) {
                if (num_3 == num_2) {
                    str = str.substring(0, i + 1) + str.substring(i + 2, str.length());
                    i = i - 1;
                } else if (i + 3 < str.length()) {
                    char num_4 = str.charAt(i + 3);
                    if (num_3 == num_4) {
                        str = str.substring(0, i + 2) + str.substring(i + 3, str.length());
                        i = i - 1;
                    }
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            String str = sc.next();
            System.out.println(solution(str));
        }
    }
}
