/*
 * @lc app=leetcode id=14 lang=java
 *
 * [14] Longest Common Prefix
 *
 * https://leetcode.com/problems/longest-common-prefix/description/
 *
 * algorithms
 * Easy (34.21%)
 * Likes:    1655
 * Dislikes: 1496
 * Total Accepted:    558.6K
 * Total Submissions: 1.6M
 * Testcase Example:  '["flower","flow","flight"]'
 *
 * Write a function to find the longest common prefix string amongst an array
 * of strings.
 * 
 * If there is no common prefix, return an empty string "".
 * 
 * Example 1:
 * 
 * 
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 * 
 * Note:
 * 
 * All given inputs are in lowercase letters a-z.
 * 
 */

// @lc code=start
class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        for (String str : strs) {
            if (str.equals("")) {
                return str;
            }
        }

        int comPre = 0;
        char comChr = strs[0].charAt(comPre);
        try {
            while (true) {
                for (int i = 0; i < strs.length; i++) {
                    if (strs[i].charAt(comPre) != comChr) {
                        throw new Exception();
                    }
                }
                comPre++;
                comChr = strs[0].charAt(comPre);
            }

        } catch (Exception e) {

            // TODO: handle exception
        }
        return strs[0].substring(0, comPre);
    }
}
// @lc code=end
