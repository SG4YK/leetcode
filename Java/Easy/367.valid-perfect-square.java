/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 *
 * https://leetcode.com/problems/valid-perfect-square/description/
 *
 * algorithms
 * Easy (40.80%)
 * Likes:    589
 * Dislikes: 133
 * Total Accepted:    140.7K
 * Total Submissions: 344.7K
 * Testcase Example:  '16'
 *
 * Given a positive integer num, write a function which returns True if num is
 * a perfect square else False.
 * 
 * Note: Do not use any built-in library function such as sqrt.
 * 
 * Example 1:
 * 
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
 * Input: 14
 * Output: false
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public static boolean isPerfectSquare(int num) {
        if (num >= 0 && num <= 1) {
            return true;
        } else if (num < 0 || num <= 3) {
            return false;
        }
        int left = 2, right = num / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid >= 46340) {
                right = mid - 1;
            } else {
                int temp = mid * mid;
                if (temp == num) {
                    return true;
                } else if (temp < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return false;
    }
}
// @lc code=end
