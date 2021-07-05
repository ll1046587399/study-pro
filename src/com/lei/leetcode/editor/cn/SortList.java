
//给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。 
//
// 进阶： 
//
// 
// 你可以在 O(n log n) 时间复杂度和常数级空间复杂度下，对链表进行排序吗？ 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：head = [4,2,1,3]
//输出：[1,2,3,4]
// 
//
// 示例 2： 
//
// 
//输入：head = [-1,5,3,4,0]
//输出：[-1,0,3,4,5]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目在范围 [0, 5 * 104] 内 
// -105 <= Node.val <= 105 
// 
// Related Topics 排序 链表 
// 👍 1180 👎 0

package com.lei.leetcode.editor.cn;

import static com.lei.leetcode.editor.cn.ListNode.len;

public class SortList {
    public static void main(String[] args) {
        Solution solution = new SortList().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        int n = len(head);
        int step = 1;
        while(step < n){
            ListNode newHead = new ListNode();
            ListNode tail = newHead;
            ListNode p = head;
            while(p != null){
                ListNode q = p;
                for(int i=0;i<step;i++){
                    q = q.next;
                }
                //[p,q]
                p = q.next;
            }
            step = step*2;
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}