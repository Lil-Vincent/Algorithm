package com.lil.notCommonlyUs.offer;
import java.util.*;
import java.util.ArrayList;

/**
 * @author Lil
 * @date 2021/7/14 12:44
 */

public class 从尾到头打印链表JZ3 {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public int[] printListReversingly(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode p = head;
        int n = 0;
        while (p != null) {
            stack.push(p.val);
            p = p.next;
            n ++;
        }
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = stack.pop();
        }
        return q;
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        ListNode p = listNode;
        while (p != null) {
            stack.push(p.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
