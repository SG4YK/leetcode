/*
 * @lc app=leetcode id=476 lang=java
 *
 * [476] Number Complement
 *
 * https://leetcode.com/problems/number-complement/description/
 *
 * algorithms
 * Easy (63.12%)
 * Likes:    650
 * Dislikes: 75
 * Total Accepted:    122.5K
 * Total Submissions: 194K
 * Testcase Example:  '5'
 *
 * Given a positive integer, output its complement number. The complement
 * strategy is to flip the bits of its binary representation.
 * 
 * Note:
 * 
 * The given integer is guaranteed to fit within the range of a 32-bit signed
 * integer.
 * You could assume no leading zero bit in the integer’s binary
 * representation.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: 5
 * Output: 2
 * Explanation: The binary representation of 5 is 101 (no leading zero bits),
 * and its complement is 010. So you need to output 2.
 * 
 * 
 * 
 * Example 2:
 * 
 * Input: 1
 * Output: 0
 * Explanation: The binary representation of 1 is 1 (no leading zero bits), and
 * its complement is 0. So you need to output 0.
 * 
 * 
 */

import java.util.*;

// @lc code=start
class Solution {
    public static int findComplement(int num) {
        int res = 0, base = 1;
        while (num != 0) {
            if ((num & 1) == 0) {
                res += base;
            }
            num >>>= 1;
            base <<= 1;
        }
        return res;
    }
}
// @lc code=end
