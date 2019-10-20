/*
 * @lc app=leetcode id=104 lang=java
 *
 * [104] Maximum Depth of Binary Tree
 *
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (62.50%)
 * Likes:    1623
 * Dislikes: 60
 * Total Accepted:    605.1K
 * Total Submissions: 968.2K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, find its maximum depth.
 * 
 * The maximum depth is the number of nodes along the longest path from the
 * root node down to the farthest leaf node.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Given binary tree [3,9,20,null,null,15,7],
 * 
 * 
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * 
 * return its depth = 3.
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int depth = 1;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            search(root.left, 2);
            search(root.right, 2);
        }
        return depth;
    }

    public void search(TreeNode p, int curDepth) {
        if (p == null) {
            return;
        } else {
            depth = curDepth > depth ? curDepth : depth;
            search(p.left, curDepth + 1);
            search(p.right, curDepth + 1);
        }
    }
}
// @lc code=end
