/*
 * @lc app=leetcode id=258 lang=java
 *
 * [258] Add Digits
 *
 * https://leetcode.com/problems/add-digits/description/
 *
 * algorithms
 * Easy (55.41%)
 * Likes:    588
 * Dislikes: 928
 * Total Accepted:    265.8K
 * Total Submissions: 479.7K
 * Testcase Example:  '38'
 *
 * Given a non-negative integer num, repeatedly add all its digits until the
 * result has only one digit.
 * 
 * Example:
 * 
 * 
 * Input: 38
 * Output: 2 
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
 * Since 2 has only one digit, return it.
 * 11
 * 
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */

// @lc code=start
class Solution {
    public int addDigits(int num) {
        return add(num);
    }

    public int add(int num) {
        if (num < 10) {
            return num;
        }
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return add(sum);
    }
}
// @lc code=end
