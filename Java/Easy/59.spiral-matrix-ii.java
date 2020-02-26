/*
 * @lc app=leetcode id=59 lang=java
 *
 * [59] Spiral Matrix II
 *
 * https://leetcode.com/problems/spiral-matrix-ii/description/
 *
 * algorithms
 * Medium (50.51%)
 * Likes:    773
 * Dislikes: 100
 * Total Accepted:    172.9K
 * Total Submissions: 337.6K
 * Testcase Example:  '3'
 *
 * Given a positive integer n, generate a square matrix filled with elements
 * from 1 to n^2 in spiral order.
 * 
 * Example:
 * 
 * 
 * Input: 3
 * Output:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 8, 9, 4 ],
 * ⁠[ 7, 6, 5 ]
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    private int[][] res;
    private int curNum = 1;
    private int n;

    public int[][] generateMatrix(int _n) {
        n = _n;
        res = new int[n][n];
        if (n <= 0) {
            return res;
        }
        for (int i = 0; i < n / 2; i++) {
            fillLevel(i);
        }

        // if n is odd, fill the central one manually
        if ((n & 1) == 1) {
            res[n / 2][n / 2] = n * n;
        }
        return res;
    }

    private void fillLevel(int level) {
        // steps in every pass, 4 pass in total
        int steps = n - 2 * level - 1;

        // left to right
        for (int i = 0; i < steps; i++) {
            res[level][level + i] = curNum++;
        }

        // top to bottom
        for (int i = 0; i < steps; i++) {
            res[level + i][n - 1 - level] = curNum++;
        }

        // right to left
        for (int i = 0; i < steps; i++) {
            res[n - 1 - level][n - 1 - level - i] = curNum++;
        }

        // bottom to top
        for (int i = 0; i < steps; i++) {
            res[n - 1 - level - i][level] = curNum++;
        }
    }
}
// @lc code=end
