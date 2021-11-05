package com.lil.PAT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/8/25 22:16
 */
public class 部分A加B {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] buf = bf.readLine().split(" ");
        char[] a = buf[0].toCharArray();
        char da = buf[1].charAt(0);
        char[] b = buf[2].toCharArray();
        char db = buf[3].charAt(0);
        StringBuilder sb1 = new StringBuilder("0");
        StringBuilder sb2 = new StringBuilder("0");
        System.out.println("buf = " + buf);
        System.out.println("a = " + a);
        System.out.println("da = " + da);
        System.out.println("b = " + b);
        System.out.println("db = " + db);
        System.out.println("sb1 = " + sb1);
        System.out.println("sb2 = " + sb2);
    }

}
