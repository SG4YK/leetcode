/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 *
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 *
 * algorithms
 * Easy (51.32%)
 * Likes:    1422
 * Dislikes: 98
 * Total Accepted:    377.8K
 * Total Submissions: 736.1K
 * Testcase Example:  '"leetcode"'
 *
 * 
 * Given a string, find the first non-repeating character in it and return it's
 * index. If it doesn't exist, return -1.
 * 
 * Examples:
 * 
 * s = "leetcode"
 * return 0.
 * 
 * s = "loveleetcode",
 * return 2.
 * 
 * 
 * 
 * 
 * Note: You may assume the string contain only lowercase letters.
 * 
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
        if (s.length() == 1) {
            return 0;
        }
        if (s.length() == 0) {
            return -1;
        }
        int[] idx = new int[26];
        Arrays.fill(idx, -1);
        for (int i = 0; i < s.length(); i++) {
            int curIdx = s.charAt(i) - 'a';
            if (idx[curIdx] == -1) {
                idx[curIdx] = i;
            } else if (idx[curIdx] < s.length()) {
                idx[curIdx] = s.length();
            }
        }
        int ans = -1;
        for (int i : idx) {
            if (i > -1 && i < s.length()) {
                if (ans == -1) {
                    ans = i;
                } else {
                    ans = i < ans ? i : ans;
                }
            }
        }
        return ans;
    }
}
// @lc code=end
