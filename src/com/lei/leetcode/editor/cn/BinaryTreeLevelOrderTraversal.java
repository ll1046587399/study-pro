
//给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。 
//
// 
//
// 示例： 
//二叉树：[3,9,20,null,null,15,7], 
//
// 
//    3
//   / \
//  9  20
//    /  \
//   15   7
// 
//
// 返回其层序遍历结果： 
//
// 
//[
//  [3],
//  [9,20],
//  [15,7]
//]
// 
// Related Topics 树 广度优先搜索 二叉树 
// 👍 908 👎 0

package com.lei.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreeLevelOrderTraversal().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {

            List<List<Integer>> list = new ArrayList<>();
            if (root == null) {
                return list;
            }
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            List<Integer> rootList = new ArrayList<>();
            rootList.add(root.val);
            list.add(rootList);
            int level = 0;
            while (!queue.isEmpty()) {
                List<Integer> resultList = new ArrayList<>();
                TreeNode newNode = queue.poll();

                if (newNode.left != null) {
                    queue.add(newNode.left);
                }
                if (newNode.right != null) {
                    queue.add(newNode.right);
                }
                levelOrder_r(newNode,resultList);
                if(resultList.size()>0){
                    level ++;
                    list.add(resultList);

                }
            }

            return list;
        }

        public void levelOrder_r(TreeNode root,List<Integer> list) {
            if (root == null) {
                return;
            }
            if(root.left != null){
                list.add(root.left.val);
            }
            if(root.right != null){
                list.add(root.right.val);

            }
            List<Integer> childList = new ArrayList<>();
            levelOrder_r(root.left, childList);
            levelOrder_r(root.right, childList);

        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}