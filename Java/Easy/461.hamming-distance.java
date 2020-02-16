/*
 * @lc app=leetcode id=461 lang=java
 *
 * [461] Hamming Distance
 *
 * https://leetcode.com/problems/hamming-distance/description/
 *
 * algorithms
 * Easy (71.02%)
 * Likes:    1517
 * Dislikes: 149
 * Total Accepted:    281K
 * Total Submissions: 395.3K
 * Testcase Example:  '1\n4'
 *
 * The Hamming distance between two integers is the number of positions at
 * which the corresponding bits are different.
 * 
 * Given two integers x and y, calculate the Hamming distance.
 * 
 * Note:
 * 0 ≤ x, y < 2^31.
 * 
 * 
 * Example:
 * 
 * Input: x = 1, y = 4
 * 
 * Output: 2
 * 
 * Explanation:
 * 1   (0 0 0 1)
 * 4   (0 1 0 0)
 * ⁠      ↑   ↑
 * 
 * The above arrows point to positions where the corresponding bits are
 * different.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int hammingDistance(int x, int y) {
        if (x == y) {
            return 0;
        }
        int dist = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                dist++;
            }
            x >>>= 1;
            y >>>= 1;
        }
        return dist;
    }
}
// @lc code=end
