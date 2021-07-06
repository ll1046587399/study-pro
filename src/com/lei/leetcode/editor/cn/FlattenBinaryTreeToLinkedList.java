
//给你二叉树的根结点 root ，请你将它展开为一个单链表： 
//
// 
// 展开后的单链表应该同样使用 TreeNode ，其中 right 子指针指向链表中下一个结点，而左子指针始终为 null 。 
// 展开后的单链表应该与二叉树 先序遍历 顺序相同。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：root = [1,2,5,3,4,null,6]
//输出：[1,null,2,null,3,null,4,null,5,null,6]
// 
//
// 示例 2： 
//
// 
//输入：root = []
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：root = [0]
//输出：[0]
// 
//
// 
//
// 提示： 
//
// 
// 树中结点数在范围 [0, 2000] 内 
// -100 <= Node.val <= 100 
// 
//
// 
//
// 进阶：你可以使用原地算法（O(1) 额外空间）展开这棵树吗？ 
// Related Topics 栈 树 深度优先搜索 链表 二叉树 
// 👍 838 👎 0

package com.lei.leetcode.editor.cn;
public class FlattenBinaryTreeToLinkedList {
    public static void main(String[] args) {
        Solution solution = new FlattenBinaryTreeToLinkedList().new Solution();
        solution.flatten(new TreeNode(1,new TreeNode(2,new TreeNode(3,null,null),new TreeNode(4,null,null)),new TreeNode(5,null,new TreeNode(6,null,null))));
    }

    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode result = new TreeNode();
    private TreeNode p = result;
    public void flatten(TreeNode root) {
        preorder(root);
        root = result;
    }

    public void preorder(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        System.out.println(root.val);
        p.right = root;
        p = root;
        root.left = null;
        preorder(left);
        preorder(right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}