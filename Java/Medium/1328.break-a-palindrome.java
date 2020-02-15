/*
 * @lc app=leetcode id=1328 lang=java
 *
 * [1328] Break a Palindrome
 *
 * https://leetcode.com/problems/break-a-palindrome/description/
 *
 * algorithms
 * Medium (38.28%)
 * Likes:    45
 * Dislikes: 34
 * Total Accepted:    4.2K
 * Total Submissions: 10.5K
 * Testcase Example:  '"abccba"'
 *
 * Given a palindromic string palindrome, replace exactly one character by any
 * lowercase English letter so that the string becomes the lexicographically
 * smallest possible string that isn't a palindrome.
 * 
 * After doing so, return the final string.  If there is no way to do so,
 * return the empty string.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: palindrome = "abccba"
 * Output: "aaccba"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: palindrome = "a"
 * Output: ""
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= palindrome.length <= 1000
 * palindrome consists of only lowercase English letters.
 * 
 */

// @lc code=start
class Solution {
    public String breakPalindrome(String palindrome) {
        if (palindrome.length() == 1) {
            return "";
        }
        char[] chars = palindrome.toCharArray();
        int i;
        for (i = 0; i < chars.length / 2; i++) {
            if (chars[i] > 'a') {
                chars[i] = 'a';
                break;
            }
        }
        if (i >= chars.length / 2) {
            chars[chars.length - 1] = 'b';
        }
        StringBuilder sBuilder = new StringBuilder(chars.length);
        for (char c : chars) {
            sBuilder.append(c);
        }
        return sBuilder.toString();
    }
}
// @lc code=end
