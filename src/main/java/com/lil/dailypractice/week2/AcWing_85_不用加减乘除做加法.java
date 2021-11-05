package com.lil.dailypractice.week2;

/**
 * @author Lil
 * @date 2021/4/25 20:16
 */
public class AcWing_85_不用加减乘除做加法 {
    public int add(int num1, int num2) {
        while(num2 != 0){
            int sum = num1 ^ num2;
            int carry = (num1 & num2)<< 1;
            num1 = sum;
            num2 = carry;
        }
        System.out.println(num1);
        return num1;
    }
}
