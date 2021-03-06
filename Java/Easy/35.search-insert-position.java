/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 *
 * https://leetcode.com/problems/search-insert-position/description/
 *
 * algorithms
 * Easy (41.22%)
 * Likes:    1579
 * Dislikes: 204
 * Total Accepted:    466.4K
 * Total Submissions: 1.1M
 * Testcase Example:  '[1,3,5,6]\n5'
 *
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * 
 * 
 * Input: [1,3,5,6], 5
 * Output: 2
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [1,3,5,6], 2
 * Output: 1
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: [1,3,5,6], 7
 * Output: 4
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: [1,3,5,6], 0
 * Output: 0
 * 
 * 
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        } else if (target > nums[nums.length - 1]) {
            return nums.length;
        } else if (target <= nums[0]) {
            return 0;
        }

        int i = 0;
        int j = nums.length - 1;
        int tmp;
        while (i < j) {
            if (target > nums[(i + j) / 2]) {
                tmp = (i + j) / 2;
                i = tmp == i ? i + 1 : tmp;
            } else if (target < nums[(i + j) / 2]) {
                tmp = (i + j) / 2;
                j = tmp == j ? j - 1 : tmp;
            } else {
                return (i + j) / 2;
            }
        }
        return i;
    }
}
// @lc code=end
