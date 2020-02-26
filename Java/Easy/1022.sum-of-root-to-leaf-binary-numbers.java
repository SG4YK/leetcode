/*
 * @lc app=leetcode id=1022 lang=java
 *
 * [1022] Sum of Root To Leaf Binary Numbers
 *
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/
 *
 * algorithms
 * Easy (64.02%)
 * Likes:    321
 * Dislikes: 67
 * Total Accepted:    29.9K
 * Total Submissions: 46.3K
 * Testcase Example:  '[1,0,1,0,1,0,1]'
 *
 * Given a binary tree, each node has value 0 or 1.  Each root-to-leaf path
 * represents a binary number starting with the most significant bit.  For
 * example, if the path is 0 -> 1 -> 1 -> 0 -> 1, then this could represent
 * 01101 in binary, which is 13.
 * 
 * For all leaves in the tree, consider the numbers represented by the path
 * from the root to that leaf.
 * 
 * Return the sum of these numbers.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input: [1,0,1,0,1,0,1]
 * Output: 22
 * Explanation: (100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * The number of nodes in the tree is between 1 and 1000.
 * node.val is 0 or 1.
 * The answer will not exceed 2^31 - 1.
 * 
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    private int sum = 0;

    public int sumRootToLeaf(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traverse(root, 0);
        return sum;
    }

    private void traverse(TreeNode node, int num) {
        if (node == null) {
            return;
        }

        // node is leaf
        if (node.left == null && node.right == null) {
            sum += (num << 1) + node.val;
            return;
        }

        // node is not leaf
        traverse(node.left, (num << 1) + node.val);
        traverse(node.right, (num << 1) + node.val);
    }
}
// @lc code=end
