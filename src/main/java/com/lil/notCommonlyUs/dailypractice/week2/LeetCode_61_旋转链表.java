package com.lil.notCommonlyUs.dailypractice.week2;

/**
 * @author Lil
 * @date 2021/5/1 16:18
 */
public class LeetCode_61_旋转链表 {
     public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }

     public ListNode roteRight(ListNode head, int k){

         if(head ==null) return head;

         //获得链表的长度,获得尾指针
         int n = 1;
         ListNode tail = head;

         while (tail.next != null){
             n++;
             tail = tail.next;
         }

         k %= n;
         if (k == 0) return head;

         //获得k个数的前一个数
         ListNode q = head;
         for (int i = 0; i < n - k - 1; i++) {
             q = q.next;
         }

         tail.next = head;
         head = q.next;//头节点
         q.next = null;
         return head;
     }
}
