package com.lil.dailypractice.week1;

/**
 * @author Lil
 * @date 2021/4/19 21:27
 */
public class LeCode_92_反转链表 {
      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode a = dummy;
        for (int i = 0; i < left - 1; i++) a = a.next;
        ListNode b = a.next,c = b.next;
        for (int i = 0; i < right - left; i++){
            ListNode d = c.next;
            c.next = b;
            b = c;
            c = d;
        }
        a.next.next = c;
        a.next = b;
        return dummy.next;
    }
}
