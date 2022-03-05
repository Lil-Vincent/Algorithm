package com.lil.notCommonlyUs.offer;

import java.util.Stack;

/**
 * @author Lil
 * @date 2021/3/30 12:05
 */
public class JZ5StackImplementationQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.size() <= 0) {
            while (stack1.size() != 0) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
