package com.lil.杂.review;

import java.util.Stack;

/**
 * @author Lil
 * @date 2021/7/13 0:05
 */
public class A用两个栈实现队列JZ5 {
    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> cache = new Stack<Integer>();

    void push(int node) {
        stack.push(node);
    }
    int pop () {
        if (cache.empty()) {
            while (!stack.empty()) cache.push(cache.pop());
        }
        return cache.pop();
    }
}
