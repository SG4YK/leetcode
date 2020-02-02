/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 *
 * https://leetcode.com/problems/missing-number/description/
 *
 * algorithms
 * Easy (50.08%)
 * Likes:    1310
 * Dislikes: 1717
 * Total Accepted:    369.8K
 * Total Submissions: 738.4K
 * Testcase Example:  '[3,0,1]'
 *
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n,
 * find the one that is missing from the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [3,0,1]
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [9,6,4,2,3,5,7,0,1]
 * Output: 8
 * 
 * 
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement
 * it using only constant extra space complexity?
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int sum = nums.length * (nums.length - 1) / 2;
        for (int i : nums) {
            sum -= i;
        }
        return sum;
    }
}
// @lc code=end
