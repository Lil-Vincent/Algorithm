package com.lil.算法基础._1_基础算法;

public class test {


    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        swamp(i, j);
        System.out.println("i" + i);
        System.out.println("j" + j);

    }
    static void swamp(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
