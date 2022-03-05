package com.lil.杂.offer;
import java.util.Scanner;

/**
 * @author Lil
 * @date 2021/5/15 15:49
 */

public class 写出这个数 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String[] PY = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};

        int sum = 0;
        for (int i = 0; i < s.length(); i++) sum += s.charAt(i) - 48;//char类型转换为int类型之后求前缀和

        String s1 = sum + "";
        for (int i = 0; i < s1.length(); i++) {
            if(i != 0)
                System.out.print(" ");//格式化输出，第一个输出前无空格
            System.out.print(PY[s1.charAt(i) - 48]);//输出结果
        }

    }
}
