package com.lil.杂.dailypractice.week2;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/4/25 15:57
 */
public class 平分物品 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入T");
        int T = sc.nextInt();
        int[][] ints = new int[T][];
        for (int i = 0; i < T ; i++) {
            System.out.println("输入n");
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            ints[i] = arr;
        }
        System.out.println(1);





    }


//    public int PinFeng(int T,int n, int arr[]){
//        for (int j = 1; j < arr.length; j++) {
//            for (int i = arr.length - j; i > 0 ; i--) {
//                if ( )
//            }
//        }
//
//    }
}
