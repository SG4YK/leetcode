/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 *
 * https://leetcode.com/problems/excel-sheet-column-number/description/
 *
 * algorithms
 * Easy (52.54%)
 * Likes:    673
 * Dislikes: 125
 * Total Accepted:    245.7K
 * Total Submissions: 466.9K
 * Testcase Example:  '"A"'
 *
 * Given a column title as appear in an Excel sheet, return its corresponding
 * column number.
 * 
 * For example:
 * 
 * 
 * ⁠   A -> 1
 * ⁠   B -> 2
 * ⁠   C -> 3
 * ⁠   ...
 * ⁠   Z -> 26
 * ⁠   AA -> 27
 * ⁠   AB -> 28 
 * ⁠   ...
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: "A"
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "AB"
 * Output: 28
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "ZY"
 * Output: 701
 * 
 */

// @lc code=start
class Solution {
    public int titleToNumber(String s) {
        if (s == null) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res *= 26;
            res += s.charAt(i) - 'A' + 1;
        }
        return res;
    }
}
// @lc code=end
