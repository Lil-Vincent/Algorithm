package com.lil.算法基础._2_数据结构;

import java.io.*;
import java.util.Scanner;

/**
 * @author Lil
 * @date 2022/03/20 15:58
 */
public class G_KMP001 {
  static int N = 100010;
  static int ne[] = new int[N];

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String P = in.next();
    P = " " + P;
    int m = in.nextInt();
    String S = in.next();
    S = " " + S;
    char p[] = P.toCharArray();
    char s[] = S.toCharArray();

    for (int i = 2, j = 0; i < n; i++) {
      while (j != 0 && p[i] != p[j + 1]) j = ne[j];
      if (p[i] == p[j + 1]) j++;
      ne[i] = j; // 因为 j ++
    }

    for (int i = 1, j = 0; i < m; i++) {
      while (i != 0 && s[i] != p[j + 1]) j = ne[j];
      if (s[i] == p[j + 1]) j++;
      if (j == n) {
        // 匹配成功
      }
    }
  }
}
