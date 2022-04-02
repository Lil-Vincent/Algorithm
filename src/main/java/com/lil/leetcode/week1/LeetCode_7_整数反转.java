package com.lil.leetcode.week1;

/**
 * @author Lil
 * @date 2022/03/31 17:33
 * <p>
 * 1. 取最后一位通常 x = x % 10; x = x / 10;
 * 例如：
 * 1 2 3 4
 * while(x != 0) {
 * printf(x % 10); // 4, 3, 2, 1
 * x = x / 10;
 * }
 * 2. 将取出来的数字按位数加到数字中： y = y * 10 + x； 其中x为数字
 * 例如 1 2 3 4
 * y = y * 10 + 1
 * y = y * 10 + 2
 * y = y * 10 + 3
 * y = y * 10 + 4
 * 可以得到1234
 * 在本题中分别取出 4 ， 3， 2， 1
 * y = y * 10 + 4;
 * y = y * 10 + 3;
 * y = y * 10 + 2;
 * y = y * 10 + 1;
 **/
public class LeetCode_7_整数反转 {

    public static int reverse(int x) {
        int y = 0;
        while (x != 0) {
            if (y > 0 && y > (Integer.MAX_VALUE - x % 10) / 10) return 0;
            if (y < 0 && y < (Integer.MIN_VALUE - x % 10) / 10) return 0;
            y = y * 10 + x % 10;
            x = x / 10;
        }
        return y;
    }
}