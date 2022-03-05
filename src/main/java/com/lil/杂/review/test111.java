package com.lil.杂.review;

import java.util.ArrayList;

/**
 * @author Lil
 * @date 2021/7/10 12:14
 */

public class test111 {
    public class ListNode {
        int val;
       ListNode next = null;

                ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null) return new ArrayList<Integer>();
        return ReverseList(listNode);
    }

    public static ArrayList ReverseList(ListNode head) {
        if(head == null){return null;}
        ListNode a = head;
        ListNode b = a.next;

        while(b != null){
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        head.next = null;
        ArrayList<Integer> list=new ArrayList<>();
        while (a != null) {
            list.add(a.val);
            a = a.next;
        }
        return list;
    }
}
