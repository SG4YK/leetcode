/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 *
 * https://leetcode.com/problems/length-of-last-word/description/
 *
 * algorithms
 * Easy (32.32%)
 * Likes:    456
 * Dislikes: 1876
 * Total Accepted:    304.1K
 * Total Submissions: 941.2K
 * Testcase Example:  '"Hello World"'
 *
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a character sequence consists of non-space
 * characters only.
 * 
 * Example:
 * 
 * 
 * Input: "Hello World"
 * Output: 5
 * 
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.indexOf(" ") < 0) {
            return s.length();
        }
        s = s.trim();
        return s.length() - s.lastIndexOf(" ") - 1;
    }
}
// @lc code=end
