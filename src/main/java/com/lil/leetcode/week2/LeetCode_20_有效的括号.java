package com.lil.leetcode.week2;

import java.util.Stack;

/**
 * @author Lil
 * @date 2022/04/08 21:59
 **/
public class LeetCode_20_有效的括号 {
    public static boolean isValid(String s) {
        char[] strs = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        for (char str : strs) {
            if (str == '(' || str == '[' || str == '{') {
                stack.push(str);
            } else {
                if (!stack.isEmpty() && Math.abs(stack.peek() - str) <= 2) stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        isValid("()");
    }
}