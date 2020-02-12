import java.util.*;
import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode id=199 lang=java
 *
 * [199] Binary Tree Right Side View
 *
 * https://leetcode.com/problems/binary-tree-right-side-view/description/
 *
 * algorithms
 * Medium (51.24%)
 * Likes:    1645
 * Dislikes: 87
 * Total Accepted:    230.2K
 * Total Submissions: 447.7K
 * Testcase Example:  '[1,2,3,null,5,null,4]'
 *
 * Given a binary tree, imagine yourself standing on the right side of it,
 * return the values of the nodes you can see ordered from top to bottom.
 * 
 * Example:
 * 
 * 
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 * 
 * ⁠  1            <---
 * ⁠/   \
 * 2     3         <---
 * ⁠\     \
 * ⁠ 5     4       <---
 * 
 */

// @lc code=start
/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    List<Integer> res;
    int maxLevel = -1;

    public List<Integer> rightSideView(TreeNode root) {
        res = new ArrayList<>(30);
        if (root == null) {
            return res;
        }
        traverse(root, 0);
        return res;
    }

    public void traverse(TreeNode node, int level) {
        if (node == null) {
            return;
        }
        if (level > maxLevel) {
            res.add(node.val);
            maxLevel++;
        }
        traverse(node.right, level + 1);
        traverse(node.left, level + 1);
    }
}
// @lc code=end
