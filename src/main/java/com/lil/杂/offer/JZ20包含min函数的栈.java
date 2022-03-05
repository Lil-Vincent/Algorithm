package com.lil.杂.offer;

import java.util.Stack;

/**
 * @author Lil
 * @date 2021/7/27 21:25
 */
public class JZ20包含min函数的栈 {
    class MinStack {

        Stack<Integer> stk;
        Stack<Integer> min_stk;
        /** initialize your data structure here. */
        public MinStack() {
            stk = new Stack<>();
            min_stk = new Stack<>();
        }

        public void push(int x) {
            stk.push(x);
            if (min_stk.isEmpty() || min_stk.peek() >= x) min_stk.push(x);
        }

        public void pop() {
            if (stk.peek() == min_stk.peek()) min_stk.pop();
            stk.pop();
        }

        public int top() {
            return stk.peek();
        }

        public int getMin() {
            return min_stk.peek();
        }
    }
}
