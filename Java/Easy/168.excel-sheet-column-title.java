/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 *
 * https://leetcode.com/problems/excel-sheet-column-title/description/
 *
 * algorithms
 * Easy (29.71%)
 * Likes:    864
 * Dislikes: 175
 * Total Accepted:    189.2K
 * Total Submissions: 635.6K
 * Testcase Example:  '1'
 *
 * Given a positive integer, return its corresponding column title as appear in
 * an Excel sheet.
 *
 * For example:
 *
 *
 * ⁠   1 -> A
 * ⁠   2 -> B
 * ⁠   3 -> C
 * ⁠   ...
 * ⁠   26 -> Z
 * ⁠   27 -> AA
 * ⁠   28 -> AB
 * ⁠   ...
 *
 *
 * Example 1:
 *
 *
 * Input: 1
 * Output: "A"
 *
 *
 * Example 2:
 *
 *
 * Input: 28
 * Output: "AB"
 *
 *
 * Example 3:
 *
 *
 * Input: 701
 * Output: "ZY"
 *
 */

// @lc code=start
class Solution {
    public String convertToTitle(int n) {
        if (n <= 0) {
            return "";
        }

        StringBuilder sBuilder =new StringBuilder();
        do {
            sBuilder.append((char) ((--n % 26) + 'A'));
            n /= 26;
        } while (n > 0);
        return sBuilder.reverse().toString();
    }
}
// @lc code=end
