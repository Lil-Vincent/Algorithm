package com.lil.notCommonlyUs.dailypractice.week1;
import java.io.BufferedInputStream;
import java.util.Scanner;
/**
 * @author Lil
 * @date 2021/4/20 15:10
 */
public class 小明上学 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new BufferedInputStream(System.in));
        int r = scanner.nextInt();
        int y = scanner.nextInt();
        int g = scanner.nextInt();
        int n = scanner.nextInt();
        int res = 0;
        while (n > 0){
            int k = scanner.nextInt();//红绿灯状态
            int t = scanner.nextInt();//显示倒计时
            if (k == 0) res = t ;
            else if (k == 1) res = t;
            else if (k == 2) res = t + r;
            else if (k == 3) res = 0;
            n--;
        }
        System.out.println(res);

    }
}