/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 *
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 *
 * algorithms
 * Easy (51.31%)
 * Likes:    1413
 * Dislikes: 98
 * Total Accepted:    376.2K
 * Total Submissions: 733.2K
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
        int[] count = new int[26];
        char[] s1 = s.toCharArray();
        for (char c : s1) {
            count[c - 'a']++;
        }
        for (char c : s1) {
            if (count[c - 'a'] == 1) {
                return find(s1,c);
            }
        }
        return -1;
    }

    public static int find(char[] s, char c) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] == c) {
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end
