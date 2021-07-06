
//给定一棵二叉树，设计一个算法，创建含有某一深度上所有节点的链表（比如，若一棵树的深度为 D，则会创建出 D 个链表）。返回一个包含所有深度的链表的数组。 
//
// 
//
// 示例： 
//
// 输入：[1,2,3,4,5,null,7,8]
//
//        1
//       /  \ 
//      2    3
//     / \    \ 
//    4   5    7
//   /
//  8
//
//输出：[[1],[2,3],[4,5,7],[8]]
// 
// Related Topics 树 广度优先搜索 链表 二叉树 
// 👍 53 👎 0

package com.lei.leetcode.editor.cn;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListOfDepthLcci {
    public static void main(String[] args) {
        Solution solution = new ListOfDepthLcci().new Solution();
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode[] listOfDepth(TreeNode tree) {
        if(tree == null){
            return new ListNode[0];
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<ListNode> list = new ArrayList<ListNode>();
        queue.add(tree);
        while(!queue.isEmpty()){
            ListNode head = new ListNode();
            ListNode p = head;
            int len = queue.size();
            for(int i=0; i<len; i++){
                TreeNode treeNode = queue.poll();
                p.next = new ListNode(treeNode.val);
                p = p.next;

                if(treeNode.left != null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right != null){
                    queue.add(treeNode.right);
                }
            }

            list.add(head.next);
        }

        ListNode[] resultArr = new ListNode[list.size()];
        for(int i=0; i<list.size(); i++){
            resultArr[i] = list.get(i);
        }

        return  resultArr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}