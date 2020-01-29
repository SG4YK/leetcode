/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 *
 * https://leetcode.com/problems/longest-palindrome/description/
 *
 * algorithms
 * Easy (49.34%)
 * Likes:    740
 * Dislikes: 71
 * Total Accepted:    122.4K
 * Total Submissions: 247.9K
 * Testcase Example:  '"abccccdd"'
 *
 * Given a string which consists of lowercase or uppercase letters, find the
 * length of the longest palindromes that can be built with those letters.
 * 
 * This is case sensitive, for example "Aa" is not considered a palindrome
 * here.
 * 
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * 
 * 
 * Example: 
 * 
 * Input:
 * "abccccdd"
 * 
 * Output:
 * 7
 * 
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        char[] ss = s.toCharArray();
        int[] count = new int[58];
        int length = 0, flag = 0;
        for (int i = 0; i < ss.length; i++) {
            count[ss[i] - 'A']++;
        }
        for (int i = 0; i < count.length; i++) {
            if ((count[i] & 1) != 0) {
                length += count[i] - 1;
                flag = 1;
            } else {
                length += count[i];
            }
        }
        return length + flag;
    }
}
// @lc code=end
