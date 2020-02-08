import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 *
 * https://leetcode.com/problems/intersection-of-two-arrays/description/
 *
 * algorithms
 * Easy (59.00%)
 * Likes:    585
 * Dislikes: 1000
 * Total Accepted:    294.7K
 * Total Submissions: 499.3K
 * Testcase Example:  '[1,2,2,1]\n[2,2]'
 *
 * Given two arrays, write a function to compute their intersection.
 * 
 * Example 1:
 * 
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * 
 * 
 * Note:
 * 
 * 
 * Each element in the result must be unique.
 * The result can be in any order.
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }
        if (nums1.length <= nums2.length) {
            return findIntersecton(nums1, nums2);
        } else {
            return findIntersecton(nums2, nums1);
        }
    }

    public static int[] findIntersecton(int[] nums1, int nums2[]) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> temp = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                temp.add(i);
            }
        }
        int[] ans = new int[temp.size()];
        int i = 0;
        for (int j : temp) {
            ans[i++] = j;
        }
        return ans;
    }
}
// @lc code=end
