
//给定一个二叉树，返回它的 后序 遍历。 
//
// 示例: 
//
// 输入: [1,null,2,3]  
//   1
//    \
//     2
//    /
//   3 
//
//输出: [3,2,1] 
//
// 进阶: 递归算法很简单，你可以通过迭代算法完成吗？ 
// Related Topics 栈 树 深度优先搜索 二叉树 
// 👍 613 👎 0

package com.lei.leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        Solution solution = new BinaryTreePostorderTraversal().new Solution();
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

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return new ArrayList<>();
        }
        postorderTraversal_r(root, list);
        return list;
    }

    public void postorderTraversal_r(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postorderTraversal_r(root.left, list);
        postorderTraversal_r(root.right, list);
        list.add(root.val);

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}