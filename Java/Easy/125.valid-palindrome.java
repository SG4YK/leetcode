/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 *
 * https://leetcode.com/problems/valid-palindrome/description/
 *
 * algorithms
 * Easy (32.70%)
 * Likes:    721
 * Dislikes: 2128
 * Total Accepted:    425.1K
 * Total Submissions: 1.3M
 * Testcase Example:  '"A man, a plan, a canal: Panama"'
 *
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 * 
 * Example 1:
 * 
 * 
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "race a car"
 * Output: false
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }
        String str = s.toLowerCase();
        int i = 0;
        int j = str.length() - 1;
        try {
            while (i <= j) {
                while (!isAlphanumeric(str.charAt(i))) {
                    i++;
                }
                while (!isAlphanumeric(str.charAt(j))) {
                    j--;
                }
                if (i >= j) {
                    return true;
                }
                if (str.charAt(i) == str.charAt(j)) {
                    i++;
                    j--;
                } else {
                    return false;
                }

            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return true;
    }

    public boolean isAlphanumeric(char c) {
        return ('a' <= c && c <= 'z') || ('0' <= c && c <= '9');
    }
}
// @lc code=end
