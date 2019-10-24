/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 *
 * https://leetcode.com/problems/add-binary/description/
 *
 * algorithms
 * Easy (40.83%)
 * Likes:    1188
 * Dislikes: 223
 * Total Accepted:    348.2K
 * Total Submissions: 851.4K
 * Testcase Example:  '"11"\n"1"'
 *
 * Given two binary strings, return their sum (also a binary string).
 * 
 * The input strings are both non-empty and contains only characters 1 or 0.
 * 
 * Example 1:
 * 
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 * Example 2:
 * 
 * 
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 * 
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sBuilder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            carry = 0;
            if(i >= 0) {
                sum += a.charAt(i) - '0';
            }
            if(j >= 0) {
                sum += b.charAt(j) - '0';
            }
            sBuilder.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        if (carry > 0) {
            sBuilder.append(1);
        }
        return sBuilder.reverse().toString();
    }
}
// @lc code=end
