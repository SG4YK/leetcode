/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 *
 * https://leetcode.com/problems/power-of-four/description/
 *
 * algorithms
 * Easy (41.03%)
 * Likes:    392
 * Dislikes: 173
 * Total Accepted:    132.8K
 * Total Submissions: 323.4K
 * Testcase Example:  '16'
 *
 * Given an integer (signed 32 bits), write a function to check whether it is a
 * power of 4.
 * 
 * Example 1:
 * 
 * 
 * Input: 16
 * Output: true
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 5
 * Output: false
 * 
 * 
 * Follow up: Could you solve it without loops/recursion?
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int num) {
        if (num == 1) {
            return true;
        }
        if (num < 4 || num % 2 != 0) {
            return false;
        }
        int temp;
        while (num > 4) {
            temp = num / 4;
            if (temp * 4 != num) {
                return false;
            } else {
                num = temp;
            }
        }
        return num == 4;
    }
}
// @lc code=end
