/*
 * @lc app=leetcode id=637 lang=java
 *
 * [637] Average of Levels in Binary Tree
 *
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
 *
 * algorithms
 * Easy (60.94%)
 * Likes:    1031
 * Dislikes: 142
 * Total Accepted:    105.4K
 * Total Submissions: 172K
 * Testcase Example:  '[3,9,20,15,7]'
 *
 * Given a non-empty binary tree, return the average value of the nodes on each
 * level in the form of an array.
 * 
 * Example 1:
 * 
 * Input:
 * ⁠   3
 * ⁠  / \
 * ⁠ 9  20
 * ⁠   /  \
 * ⁠  15   7
 * Output: [3, 14.5, 11]
 * Explanation:
 * The average value of nodes on level 0 is 3,  on level 1 is 14.5, and on
 * level 2 is 11. Hence return [3, 14.5, 11].
 * 
 * 
 * 
 * Note:
 * 
 * The range of node's value is in the range of 32-bit signed integer.
 * 
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.List;
import java.util.ArrayList;

class Solution {
    private List<Integer> counts;
    private List<Double> res;

    public List<Double> averageOfLevels(TreeNode root) {
        // store how many nodes in each level;
        counts = new ArrayList<>();

        res = new ArrayList<>();

        // first calculate sum and number of nodes in each level
        traverse(root, 0);

        // calculate average
        for (int i = 0; i < res.size(); i++) {
            res.set(i, res.get(i) / counts.get(i));
        }
        return res;
    }

    private void traverse(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (res.size() <= level) {
            res.add((double)(node.val));
            counts.add(1);
        } else {
            res.set(level, res.get(level) + node.val);
            counts.set(level, counts.get(level) + 1);
        }
        traverse(node.left, level + 1);
        traverse(node.right, level + 1);
    }
}
// @lc code=end
