package com.lil.算法基础._2_数据结构;

import java.io.*;
import java.util.Scanner;

/**
 * @author Lil
 * @date 2022/03/20 15:58
 */
public class G_KMP {
  static int N = 100010;
  static int ne[] = new int[N];

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Integer n = Integer.parseInt(br.readLine());
    String s1 = " " + br.readLine();
    Integer m = Integer.parseInt(br.readLine());
    String s2 = " " + br.readLine();
    char[] a1 = s1.toCharArray();
    char[] a2 = s2.toCharArray();

    for (int i = 2, j = 0; i <= n; i++) {
      while (j != 0 && a1[i] != a1[j + 1]) j = ne[j];
      if (a1[i] == a1[j + 1]) j++;
      ne[i] = j;
    }

    for (int i = 1, j = 0; i <= m; i++) {
      while (j != 0 && a2[i] != a1[j + 1]) j = ne[j];
      if (a2[i] == a1[j + 1]) j++;
      if (j == n) {
        j = ne[j];
        bw.write(i - n + " ");
      }
    }
    bw.flush();
  }
}
