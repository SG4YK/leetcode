/*
 * @lc app=leetcode id=993 lang=java
 *
 * [993] Cousins in Binary Tree
 *
 * https://leetcode.com/problems/cousins-in-binary-tree/description/
 *
 * algorithms
 * Easy (52.07%)
 * Likes:    415
 * Dislikes: 29
 * Total Accepted:    39K
 * Total Submissions: 74.9K
 * Testcase Example:  '[1,2,3,4]\n4\n3'
 *
 * In a binary tree, the root node is at depth 0, and children of each depth k
 * node are at depth k+1.
 * 
 * Two nodes of a binary tree are cousins if they have the same depth, but have
 * different parents.
 * 
 * We are given the root of a binary tree with unique values, and the values x
 * and y of two different nodes in the tree.
 * 
 * Return true if and only if the nodes corresponding to the values x and y are
 * cousins.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * Input: root = [1,2,3,4], x = 4, y = 3
 * Output: false
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * 
 * Input: root = [1,2,3,null,4,null,5], x = 5, y = 4
 * Output: true
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * 
 * 
 * Input: root = [1,2,3,null,4], x = 2, y = 3
 * Output: false
 * 
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The number of nodes in the tree will be between 2 and 100.
 * Each node has a unique integer value from 1 to 100.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int x, y;
    private int xyHeight = -1;
    private TreeNode xyParent;
    private boolean flag = false;

    public boolean isCousins(TreeNode root, int _x, int _y) {
        x = _x;
        y = _y;
        xyParent = null;
        traverse(root, 0, null);
        return flag;
    }

    private void traverse(TreeNode node, int height, TreeNode parent) {
        if (node == null) {
            return;
        }
        if (node.val == x || node.val == y) {
            if (xyHeight == -1) {
                xyHeight = height;
                xyParent = parent;
            } else {
                flag = (height == xyHeight) && (parent != xyParent);
                return;
            }
        }
        traverse(node.left, height + 1, node);
        traverse(node.right, height + 1, node);
    }
}
// @lc code=end
