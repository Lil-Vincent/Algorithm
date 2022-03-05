package com.lil.杂.dailypractice;/**
 * @author Lil
 * @date 2021/5/11 23:02
 */

import java.util.Scanner;

/**
 * @description: TODO
 * @author xiao
 * @date 2021/5/11 23:02
 * @version 1.0
 */

@SuppressWarnings("all")
public class 最大的和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] a = new long[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        long[] b = new long[n+1];
        for (int i = 1; i <= n; i++) {
            b[i] = sc.nextInt();
        }
        long[] aa = new long[n+1];
        long[] bb = new long[n+1];
        for(int i=1;i<=n;i++){
            if(b[i]==1){
                aa[i]=aa[i-1]+a[i];
            }else{
                aa[i]=aa[i-1];
            }
            bb[i]=bb[i-1]+a[i];
        }

        long res = 0;
        for (int i = k; i <= n; i++) {
            res=Math.max(res,bb[i]-bb[i-k]-aa[i]+aa[i-k]);
        }
        System.out.println(res+aa[n]);
    }
}
