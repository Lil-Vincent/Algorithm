package com.lil.杂.fondation.week2;/**
 * @author Lil
 * @date 2021/5/11 10:46
 */

import java.io.*;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/11 10:46
 * @version 1.0
 */
public class 差分矩阵 {
    static int N = 1010;
    static int a[][] = new int[N][N];
    static int b[][] = new int[N][N];

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str1 = in.readLine().split(" ");
        int n = Integer.parseInt(str1[0]);
        int m = Integer.parseInt(str1[1]);
        int q = Integer.parseInt(str1[2]);

        for (int i = 1; i < n + 1; i++) {
            String[] str2 = in.readLine().split(" ");
            for (int j = 1; j < m + 1; j++) {
                a[i][j] = Integer.parseInt(str2[j - 1]);
                insert(i, j, i, j, a[i][j]);
            }
        }

        while (q-- > 0){
            String[] str3 = in.readLine().split(" ");
            int x1 = Integer.parseInt(str3[0]);
            int y1 = Integer.parseInt(str3[1]);
            int x2 = Integer.parseInt(str3[2]);
            int y2 = Integer.parseInt(str3[3]);
            int c = Integer.parseInt(str3[4]);

            insert(x1, y1, x2, y2, c);
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                b[i][j]=b[i-1][j]+b[i][j-1]-b[i-1][j-1]+b[i][j];
                out.write(b[i][j] + " ");
            }
            out.write("\n");
        }
        out.flush();
    }
    static void insert(int x1, int y1, int x2, int y2, int c){
        b[x1][y1] += c;
        b[x2 + 1][y1] -= c;
        b[x1][y2 + 1] -= c;
        b[x2 + 1][y2 + 1] += c;
    }
}
