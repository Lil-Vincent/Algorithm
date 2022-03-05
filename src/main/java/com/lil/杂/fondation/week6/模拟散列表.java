package com.lil.杂.fondation.week6;

import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/7/8 9:23
 */
public class 模拟散列表 {
    private static int N = 200003;
    //因为要用null标识节点空，所以类型为Integer
    private static Integer[] a = new Integer[N];
    public static int find(int x){
        int k = (x % N + N) % N;
        //别忘了第二个已存在的条件
        while(a[k] != null && a[k] != x){
            k++;
            if(k == N){
                k = 0;
            }
        }
        return k;
    }

    public static void main(String[] args){
        //先将所有位置设为null，标识为空
        for(int i = 0;i < a.length;i++){
            a[i] = null;
        }
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        while(m-- > 0){
            String opt = scanner.next();
            int x = scanner.nextInt();
            if("I".equals(opt)){
                a[find(x)] = x;
            }else{
                //这是比较的是a[find(x)]
                System.out.println(a[find(x)] == null ? "No" : "Yes");
            }
        }
    }
}
