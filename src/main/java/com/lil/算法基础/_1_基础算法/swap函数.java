package com.lil.算法基础._1_基础算法;

/**
 * @author Lil
 * @date 2021/12/18 17:36
 **/
public class swap函数 {
    static int a = 1;
    static int b = 2;
    static void swap() {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        System.out.println(a + " " + b);
        swap();
        System.out.println(a + " " + b);
    }
}