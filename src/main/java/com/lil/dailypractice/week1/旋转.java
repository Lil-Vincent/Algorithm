package com.lil.dailypractice.week1;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/4/22 20:50
 */
public class 旋转 {
/*    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = n - 1; j <= 0; j--) {
                System.out.println(arr[j][i]+" ");
            }
            System.out.println();
        }
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int arr[][] = new int[x][y];


        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[x][y] = sc.nextInt();
            }
        }
        if (x == 0 || y == 0) return;

        for (int i = 0; i < y; i++) {
            for (int j = x -1; j <= 0 ; j--) {
                System.out.println(arr[j][i]);
            }
        }
    }

}
