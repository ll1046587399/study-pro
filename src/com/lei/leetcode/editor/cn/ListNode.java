package com.lei.leetcode.editor.cn;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    //返回链表长度
    static int len(ListNode head){
        int len = 0;
        ListNode p = head;
        while(p != null){
            p = p.next;
            len ++;
        }
        return len;
    }

    //合并并排序  [p,q] [q+1,r]  前提是有序  否则只顺序合并排序
    static ListNode[] merge(ListNode p, ListNode q, ListNode r){
        ListNode newHead = new ListNode();
        ListNode tail = newHead;
        ListNode pa = p;
        ListNode pb = q.next;
        q.next = null;
        if (r != null) {
            r.next = null;
        }
        while (pa != null && pb != null) {
            if (pa.val <= pb.val) {
                tail.next = pa;
                tail = tail.next;
                pa = pa.next;
            } else {
                tail.next = pb;
                tail = tail.next;
                pb = pb.next;
            }
        }
        if (pa != null) {
            tail.next = pa;
            tail = q;
        }
        if (pb != null) {
            tail.next = pb;
            tail = r;
        }
        return new ListNode[]{newHead.next, tail};
    }

    //打印链表
    static void printVal(ListNode head){
        ListNode p = head;
        while(p != null){
            System.out.println(p.val);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        ListNode listNode8 = new ListNode(1);
        ListNode listNode7 = new ListNode(4, listNode8);
        ListNode listNode6 = new ListNode(3, listNode7);
        ListNode listNode5 = new ListNode(2, listNode6);
        ListNode listNode4 = new ListNode(9, listNode5);
        ListNode listNode3 = new ListNode(7, listNode4);
        ListNode listNode2 = new ListNode(8, listNode3);
        ListNode listNode1 = new ListNode(6, listNode2);
        ListNode[] list = merge(listNode1,listNode2,listNode8);
        printVal(list[0]);
    }
}
