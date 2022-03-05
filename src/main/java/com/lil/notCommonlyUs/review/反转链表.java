package com.lil.notCommonlyUs.review;

/**
 * @author Lil
 * @date 2021/7/13 15:04
 */
public class 反转链表 {
    static public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode ReverseList(ListNode head) {
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
        return a;
    }
}
