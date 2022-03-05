package com.lil.notCommonlyUs.dailypractice.week1;

/**
 * @author Lil
 * @date 2021/4/19 20:20
 */
public class 反转链表2 {
     public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

      public ListNode reverseList(ListNode head) {
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
