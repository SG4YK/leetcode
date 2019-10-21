/*
 * @lc app=leetcode id=112 lang=java
 *
 * [112] Path Sum
 *
 * https://leetcode.com/problems/path-sum/description/
 *
 * algorithms
 * Easy (38.93%)
 * Likes:    1180
 * Dislikes: 377
 * Total Accepted:    363.1K
 * Total Submissions: 932.6K
 * Testcase Example:  '[5,4,8,11,null,13,4,7,2,null,null,null,1]\n22'
 *
 * Given a binary tree and a sum, determine if the tree has a root-to-leaf path
 * such that adding up all the values along the path equals the given sum.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Given the below binary tree and sum = 22,
 * 
 * 
 * ⁠     5
 * ⁠    / \
 * ⁠   4   8
 * ⁠  /   / \
 * ⁠ 11  13  4
 * ⁠/  \      \
 * 7    2      1
 * 
 * 
 * return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int Sum;

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        } else if (root.left == null && root.right == null) {
            return root.val == sum;
        } else {
            this.Sum = sum;
            return search(root, 0);
        }
    }

    public boolean search(TreeNode p, int curSum) {
        if (p.left == null && p.right == null) {
            return curSum + p.val == this.Sum;
        } else if (p.left == null) {
            return search(p.right, curSum + p.val);
        } else if (p.right == null) {
            return search(p.left, curSum + p.val);
        } else {
            return search(p.left, curSum + p.val) || search(p.right, curSum + p.val);
        }
    }
}
// @lc code=end
