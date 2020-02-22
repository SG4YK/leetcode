/*
 * @lc app=leetcode id=434 lang=java
 *
 * [434] Number of Segments in a String
 *
 * https://leetcode.com/problems/number-of-segments-in-a-string/description/
 *
 * algorithms
 * Easy (37.44%)
 * Likes:    172
 * Dislikes: 660
 * Total Accepted:    67.4K
 * Total Submissions: 180K
 * Testcase Example:  '"Hello, my name is John"'
 *
 * Count the number of segments in a string, where a segment is defined to be a
 * contiguous sequence of non-space characters.
 * 
 * Please note that the string does not contain any non-printable characters.
 * 
 * Example:
 * 
 * Input: "Hello, my name is John"
 * Output: 5
 * 
 * 
 */

// @lc code=start
class Solution {
    public int countSegments(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }
        String[] splited = s.split(" ");
        int count = 0;
        for (String str : splited) {
            if (!str.equals("")) {
                count++;
            }
        }
        return count;
    }
}
// @lc code=end
