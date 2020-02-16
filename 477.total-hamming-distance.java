/*
 * @lc app=leetcode id=477 lang=java
 *
 * [477] Total Hamming Distance
 *
 * https://leetcode.com/problems/total-hamming-distance/description/
 *
 * algorithms
 * Medium (50.11%)
 * Likes:    670
 * Dislikes: 48
 * Total Accepted:    56.7K
 * Total Submissions: 113K
 * Testcase Example:  '[4,14,2]'
 *
 * The Hamming distance between two integers is the number of positions at
 * which the corresponding bits are different.
 * 
 * Now your job is to find the total Hamming distance between all pairs of the
 * given numbers.
 * 
 * 
 * Example:
 * 
 * Input: 4, 14, 2
 * 
 * Output: 6
 * 
 * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is
 * 0010 (just
 * showing the four bits relevant in this case). So the answer will be:
 * HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2
 * + 2 + 2 = 6.
 * 
 * 
 * 
 * Note:
 * 
 * Elements of the given array are in the range of 0  to 10^9
 * Length of the array will not exceed 10^4. 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int totalHammingDistance(int[] nums) {
        int count = 0;
        for (int bits = 0; bits < 32; bits++) {
            int zeros = 0;
            int ones = 0;
            for (int i = 0; i < nums.length; i++) {
                if ((nums[i] & 1) == 1) {
                    ones++;
                } else {
                    zeros++;
                }
                nums[i] >>>= 1;
            }
            count += zeros * ones;
        }
        return count;
    }
}
// @lc code=end
