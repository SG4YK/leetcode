/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 *
 * https://leetcode.com/problems/string-compression/description/
 *
 * algorithms
 * Easy (39.59%)
 * Likes:    562
 * Dislikes: 1766
 * Total Accepted:    83.6K
 * Total Submissions: 211.2K
 * Testcase Example:  '["a","a","b","b","c","c","c"]'
 *
 * Given an array of characters, compress it in-place.
 * 
 * The length after compression must always be smaller than or equal to the
 * original array.
 * 
 * Every element of the array should be a character (not int) of length 1.
 * 
 * After you are done modifying the input array in-place, return the new length
 * of the array.
 * 
 * 
 * Follow up:
 * Could you solve it using only O(1) extra space?
 * 
 * 
 * Example 1:
 * 
 * 
 * Input:
 * ["a","a","b","b","c","c","c"]
 * 
 * Output:
 * Return 6, and the first 6 characters of the input array should be:
 * ["a","2","b","2","c","3"]
 * 
 * Explanation:
 * "aa" is replaced by "a2". "bb" is replaced by "b2". "ccc" is replaced by
 * "c3".
 * 
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input:
 * ["a"]
 * 
 * Output:
 * Return 1, and the first 1 characters of the input array should be: ["a"]
 * 
 * Explanation:
 * Nothing is replaced.
 * 
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input:
 * ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * 
 * Output:
 * Return 4, and the first 4 characters of the input array should be:
 * ["a","b","1","2"].
 * 
 * Explanation:
 * Since the character "a" does not repeat, it is not compressed.
 * "bbbbbbbbbbbb" is replaced by "b12".
 * Notice each digit has it's own entry in the array.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * All characters have an ASCII value in [35, 126].
 * 1 <= len(chars) <= 1000.
 * 
 * 
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        if (chars.length <= 1) {
            return chars.length;
        }
        char curChar = chars[0];
        int idx = 0;
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == curChar) {
                count++;
            } else {
                chars[idx] = curChar;
                idx++;
                if (count > 1) {
                    char[] cnt = String.valueOf(count).toCharArray();
                    for (int j = 0; j < cnt.length; j++) {
                        chars[idx++] = cnt[j];
                    }
                }1
                curChar = chars[i];
                count = 1;
            }
        }
        chars[idx] = curChar;
        idx++;
        if (count > 1) {
            char[] cnt = String.valueOf(count).toCharArray();
            for (int j = 0; j < cnt.length; j++) {
                chars[idx++] = cnt[j];
            }
        }
        curChar = chars[i];
        count = 1;
        return idx;
    }
}
// @lc code=end
