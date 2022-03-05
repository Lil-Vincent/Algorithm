package com.lil.杂.dailypractice.week1;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Lil
 * @date 2021/4/22 9:12
 */
public class LeetCode_150_逆波兰表达式求值 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                Integer a = stk.pop();
                Integer b = stk.pop();
                if (s.equals("+")) stk.push(a + b);
                if (s.equals("-")) stk.push(b - a);
                if (s.equals("*")) stk.push(a * b);
                if (s.equals("/")) stk.push(a / b);
            }else
                stk.push(Integer.valueOf(s));
        }
        return stk.pop();
    }

    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        String s = SC.next();
        String[] x = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            x[i] = String.valueOf(s.charAt(i));
        }
        int i = evalRPN(x);
        System.out.println(i);
    }
}

