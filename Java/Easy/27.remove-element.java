// import java.util.Arrays;
// import java.util.LinkedList;
// import java.util.List;

/*
 * @lc app=leetcode id=27 lang=java
 *
 * [27] Remove Element
 */

// @lc code=start
class Solution {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int x : nums) {
            if (x == val) {
                n++;
            }
        }
        if (n == 0) {
            return nums.length;
        } else if (n == nums.length) {
            return 0;
        }
        int i = 0;
        int k = nums.length - 1;
        for (; i < k; i++) {
            if (nums[i] == val) {
                if (nums[k] != val) {
                    int temp = nums[i];
                    nums[i] = nums[k];
                    nums[k] = temp;
                } else {
                    i--;
                }
                k--;
            }
        }
        int rst = nums.length - n;
        return rst;
    }
}
// @lc code=end
