import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * @lc app=leetcode id=136 lang=java
 *
 * [136] Single Number
 *
 * https://leetcode.com/problems/single-number/description/
 *
 * algorithms
 * Easy (61.74%)
 * Likes:    2943
 * Dislikes: 113
 * Total Accepted:    548.9K
 * Total Submissions: 888.9K
 * Testcase Example:  '[2,2,1]'
 *
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * 
 * Input: [2,2,1]
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: [4,1,2,1,2]
 * Output: 4
 * 
 * 
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int res = 0;
        Set<Integer> numsSet = new HashSet<Integer>();
        for (int i : nums) {
            numsSet.add(i);
            res += i;
        }
        Iterator<Integer> it = numsSet.iterator();
        while (it.hasNext()) {
            res -= 2 * it.next();
        }
        return -res;
    }
}
// @lc code=end
