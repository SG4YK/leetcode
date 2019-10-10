/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 *
 * https://leetcode.com/problems/reverse-integer/description/
 *
 * algorithms
 * Easy (25.51%)
 * Likes:    2501
 * Dislikes: 3896
 * Total Accepted:    828.1K
 * Total Submissions: 3.2M
 * Testcase Example:  '123'
 *
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * 
 * 
 * Input: 123
 * Output: 321
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: -123
 * Output: -321
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: 120
 * Output: 21
 * 
 * 
 * Note:
 * Assume we are dealing with an environment which could only store integers
 * within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
 * of this problem, assume that your function returns 0 when the reversed
 * integer overflows.
 * 
 */

// @lc code=start
class Solution {
    public int reverse(int x) {
        int rev = 0;
        int minus = 1; // If x<0 set to -1, otherwise set to 1
        if (x < 0) {
            minus = -1;
            x *= -1;
        }
        try {
            while (x > 0) {
                if (rev > Integer.MAX_VALUE / 10) {
                    throw new Exception();
                }
                rev = rev * 10 + x % 10;
                x /= 10;
            }

        } catch (Exception e) {
            return 0; // Overflow
        }
        return rev * minus;
    }
}
// @lc code=end
