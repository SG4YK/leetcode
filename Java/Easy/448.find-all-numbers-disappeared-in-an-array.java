import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode id=448 lang=java
 *
 * [448] Find All Numbers Disappeared in an Array
 *
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
 *
 * algorithms
 * Easy (54.97%)
 * Likes:    2199
 * Dislikes: 202
 * Total Accepted:    205.4K
 * Total Submissions: 373.6K
 * Testcase Example:  '[4,3,2,7,8,2,3,1]'
 *
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some
 * elements appear twice and others appear once.
 * 
 * Find all the elements of [1, n] inclusive that do not appear in this array.
 * 
 * Could you do it without extra space and in O(n) runtime? You may assume the
 * returned list does not count as extra space.
 * 
 * Example:
 * 
 * Input:
 * [4,3,2,7,8,2,3,1]
 * 
 * Output:
 * [5,6]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans = new ArrayList<>(nums.length);
        boolean[] appeared = new boolean[nums.length + 1];
        for(int i = 0; i < nums.length; i++){
            appeared[nums[i]] = true;
        }
        for(int i = 1; i < appeared.length; i++) {
            if(appeared[i] == false){
                ans.add(i);
            }
        }
        return ans;
    }
}
// @lc code=end