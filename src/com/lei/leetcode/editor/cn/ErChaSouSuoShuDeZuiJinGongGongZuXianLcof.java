
//给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。 
//
// 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（
//一个节点也可以是它自己的祖先）。” 
//
// 例如，给定如下二叉搜索树: root = [6,2,8,0,4,7,9,null,null,3,5] 
//
// 
//
// 
//
// 示例 1: 
//
// 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
//输出: 6 
//解释: 节点 2 和节点 8 的最近公共祖先是 6。
// 
//
// 示例 2: 
//
// 输入: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
//输出: 2
//解释: 节点 2 和节点 4 的最近公共祖先是 2, 因为根据定义最近公共祖先节点可以为节点本身。 
//
// 
//
// 说明: 
//
// 
// 所有节点的值都是唯一的。 
// p、q 为不同节点且均存在于给定的二叉搜索树中。 
// 
//
// 注意：本题与主站 235 题相同：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a
//-binary-search-tree/ 
// Related Topics 树 深度优先搜索 二叉搜索树 二叉树 
// 👍 145 👎 0

package com.lei.leetcode.editor.cn;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class ErChaSouSuoShuDeZuiJinGongGongZuXianLcof {
    public static void main(String[] args) {
        Solution solution = new ErChaSouSuoShuDeZuiJinGongGongZuXianLcof().new Solution();
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
class Solution {
    private TreeNode lca = null;

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return  lca;
    }

    public TreeNode dfs(TreeNode root,TreeNode p, TreeNode q){
        if(root == null){
            return null;
        }
        if(p.val < root.val && q.val < root.val){
            dfs(root.left, p, q);
        }else if(p.val > root.val && q.val > root.val){
            dfs(root.right, p, q);
        }else{
            lca = root;
            return root;
        }
        return  null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}