package test6_链表.No2;

import data_structure.ListNode;

/**
 * \Date: 2017/12/14
 * \
 * \Description:
 * \给出两个非空链表，表示两个非负整数。其中每一个整数的各位数字以逆序存储，返回这两个整数相加所代表的链表。
 如 342 + 465 = 807
 则给出 2->4->3 和 5->6->4，返回7->0->8

 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lr = new ListNode(0);
        ListNode temp = lr; //used to remember the current scan position, note: this is dummpy head for keeping loop invariant!
        ListNode l1_current = l1; //not dumy head
        ListNode l2_current = l2;
        ListNode newNode = null;
        int carry = 0; //set the initial carry into zero

        while (l1_current != null || l2_current != null) {

            if (l1_current == null && l2_current != null) {
                newNode = new ListNode((l2_current.val + carry) % 10);
                carry = (l2_current.val + carry) / 10; //there is no carry for next digit(next upper digit)
                l2_current = l2_current.next;
                //continue;
            }

            if (l2_current == null && l1_current != null) {
                newNode = new ListNode((l1_current.val + carry) % 10);
                carry = (l1_current.val + carry) / 10;
                l1_current = l1_current.next;
                //continue;
            }

            if (l1_current != null && l2_current != null) {
                newNode = new ListNode((l1_current.val + l2_current.val + carry) % 10);
                carry = (l1_current.val + l2_current.val + carry) / 10;
                l1_current = l1_current.next;
                l2_current = l2_current.next;
                //continue   the continue would jump over the temp~~~~  careful!
            }

            temp.next = newNode; //the head of the result list is recored in lr
            temp = temp.next; //move the scanner to the next position
        }

        if (carry == 1) { //take care, there might be a additional carry in the last digit
            newNode = new ListNode(1);
            temp.next = newNode;
            temp = temp.next;
        }

        return lr.next;
    }
}
