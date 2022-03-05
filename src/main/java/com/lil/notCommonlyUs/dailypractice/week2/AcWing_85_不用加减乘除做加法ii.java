package com.lil.notCommonlyUs.dailypractice.week2;

/**
 * @author Lil
 * @date 2021/4/25 22:20
 */
public class AcWing_85_不用加减乘除做加法ii {
    public int add(int num1, int num2) {
        int cin = 0;
        int tmp = 1;
        int res = 0;
        for (int i = 0; i < 32; i++) {
            int a = num1 & tmp;
            int b = num2 & tmp;
            int S = a ^ b ^ cin;
            int cout = (a&b)|(a&cin)|(b&cin);
            cin = cout<<1;
            res += S;
            tmp <<= 1;
        }
        return res;
    }
}
