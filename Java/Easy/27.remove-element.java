/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int k = nums.length - 1;
        for (; i <= k; i++) {
            if (nums[i] == val) {
                nums[i] = nums[k];
                k--;
                i--;
            }
        }
        return k + 1;
    }

}
// @lc code=end
