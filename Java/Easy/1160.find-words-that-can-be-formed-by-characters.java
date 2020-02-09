import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=1160 lang=java
 *
 * [1160] Find Words That Can Be Formed by Characters
 *
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/description/
 *
 * algorithms
 * Easy (66.96%)
 * Likes:    186
 * Dislikes: 45
 * Total Accepted:    31K
 * Total Submissions: 46.2K
 * Testcase Example:  '["cat","bt","hat","tree"]\n"atach"'
 *
 * You are given an array of strings words and a string chars.
 * 
 * A string is good if it can be formed by characters from chars (each
 * character can only be used once).
 * 
 * Return the sum of lengths of all good strings in words.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: words = ["cat","bt","hat","tree"], chars = "atach"
 * Output: 6
 * Explanation: 
 * The strings that can be formed are "cat" and "hat" so the answer is 3 + 3 =
 * 6.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr"
 * Output: 10
 * Explanation: 
 * The strings that can be formed are "hello" and "world" so the answer is 5 +
 * 5 = 10.
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * 1 <= words.length <= 1000
 * 1 <= words[i].length, chars.length <= 100
 * All strings contain lowercase English letters only.
 * 
 */

// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
        if (words.length == 0 || chars.length() == 0) {
            return 0;
        }
        int[] count = new int[26];
        char[] pattern = chars.toCharArray();
        for (int i = 0; i < pattern.length; i++) {
            count[pattern[i] - 'a']++;
        }
        int length = 0;
        for (String word : words) {
            length += form(word, count);
        }
        return length;
    }

    public int form(String word, int[] pattern) {
        char[] chars = word.toCharArray();
        char[] count = new char[26];
        for (char c : chars) {
            if (count[c - 'a'] >= pattern[c - 'a']) {
                return 0;
            }
            count[c - 'a']++;
        }
        return chars.length;
    }
}
// @lc code=end
