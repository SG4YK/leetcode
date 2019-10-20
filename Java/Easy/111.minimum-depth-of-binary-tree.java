/*
 * @lc app=leetcode id=111 lang=java
 *
 * [111] Minimum Depth of Binary Tree
 *
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/description/
 *
 * algorithms
 * Easy (36.00%)
 * Likes:    872
 * Dislikes: 491
 * Total Accepted:    332.6K
 * Total Submissions: 923.2K
 * Testcase Example:  '[3,9,20,null,null,15,7]'
 *
 * Given a binary tree, find its minimum depth.
 * 
 * The minimum depth is the number of nodes along the shortest path from the
 * root node down to the nearest leaf node.
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
 * return its minimum depth = 2.
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return search(root, 1);
        }
    }

    public int search(TreeNode p, int curDepth) {
        if (p == null) {
            return curDepth - 1;
        } else if (p.left == null && p.right == null) {
            return curDepth;
        } else if (p.left == null) {
            return search(p.right, curDepth + 1);
        } else if (p.right == null) {
            return search(p.left, curDepth + 1);
        } else {
            return Math.min(search(p.left, curDepth + 1), search(p.right, curDepth + 1));
        }
    }
}
// @lc code=end
