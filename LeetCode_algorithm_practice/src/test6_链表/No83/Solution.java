package test6_链表.No83;

import data_structure.*;

/**
 * \Date: 2017/12/14
 * \
 * \Description:
 * 83. Remove Duplicates from Sorted List
 * \给出一个有序链表，删除其中所有重复元素，使得每个元素只保留一次。
 * - 如 1->1->2，返回1->2
 * - 如 1->1->2->3->3，返回1->2->3
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pre = head;
        ListNode cur = head.next;
        while (cur != null) {

            if (cur.val == pre.val) {
                pre.next = cur.next;//删除重复的节点
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return head;

    }
}

