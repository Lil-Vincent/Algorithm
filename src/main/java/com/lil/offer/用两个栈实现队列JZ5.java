package com.lil.offer;

import java.util.Stack;

/**
 * @author Lil
 * @date 2021/7/12 23:57
 */
public class 用两个栈实现队列JZ5 {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> cache = new Stack<Integer>();

    void push (int node) {
        stack.push(node);
    }

    int pop () {
        if (cache.empty()) {
            while (!stack.empty()) {
                cache.push(stack.pop());
            }
        }
        return cache.pop();
    }
}
