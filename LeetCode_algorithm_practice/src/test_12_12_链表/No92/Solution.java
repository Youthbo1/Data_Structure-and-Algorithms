package test_12_12_链表.No92;

import test_12_12_链表.ListNode;

/**
 * \Date: 2017/12/14
 * \
 * \Description:
 * \反转一个链表从m到n的元素。
 如对于链表 1->2->3->4->5->NULL, m = 2 , n = 4
 则返回链表 1->4->3->2->5->NULL
 m和n超过链表范围怎么办？
 m > n 怎么办？

 */
public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        if(head==null || m>n) {
            return null;
        }

        ListNode pre=new ListNode(0);
        pre.next=head;
        ListNode p=pre;
        for(int i=1;i<m;i++){
            p=p.next;
        }
        ListNode t=p;  //p到m-1
        int[] temp=new int[n-m+1];  //存[m n] val
        for(int i=0;i<n-m+1;i++){
            t=t.next;
            temp[i]=t.val;
        }
        t=p;
        for(int i=0;i<n-m+1;i++){
            t=t.next;
            t.val=temp[n-m-i];  //倒着存
        }
        return head;

    }
}
