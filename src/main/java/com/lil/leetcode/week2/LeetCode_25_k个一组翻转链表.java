package com.lil.leetcode.week2;

import java.util.List;

/**
 * @author Lil
 * @date 2022/04/09 16:32
 **/

// 遍历数组，
// 1.首先查看是否存在第k个节点，
// 2. k个节点内先反转
// 3. 外部再画图查看连接
public class LeetCode_25_k个一组翻转链表 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        for (ListNode p = dummy; ; ) {
            //指针往前走看是否能走到k个元素
            ListNode q = p;
            for (int i = 0; i < k && q != null; i++) q = q.next;
            if (q == null) break;

            //内部交换节点
            ListNode a = p.next;
            ListNode b = a.next;
            for (int i = 0; i < k - 1; i++) {
                ListNode c = b.next;
                b.next = a;
                a = b;
                b = c;
            }
            ListNode c = p.next;
            p.next = a;
            c.next = b;
            //下一组的前一个元素
            p = c;
        }
        return dummy.next;
    }
}