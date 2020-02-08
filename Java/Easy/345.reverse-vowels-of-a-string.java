/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 *
 * https://leetcode.com/problems/reverse-vowels-of-a-string/description/
 *
 * algorithms
 * Easy (42.77%)
 * Likes:    522
 * Dislikes: 933
 * Total Accepted:    189.8K
 * Total Submissions: 442.7K
 * Testcase Example:  '"hello"'
 *
 * Write a function that takes a string as input and reverse only the vowels of
 * a string.
 * 
 * Example 1:
 * 
 * 
 * Input: "hello"
 * Output: "holle"
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "leetcode"
 * Output: "leotcede"
 * 
 * 
 * Note:
 * The vowels does not include the letter "y".
 * 
 * 
 * 
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int i = 0, j = s.length() - 1;
        char[] c = s.toCharArray();
        char[] sArr = s.toCharArray();
        while (i < j) {
            try {
                while (!isVowels(sArr[i])) {
                    i++;
                }
                while (i < j && !isVowels(sArr[j])) {
                    j--;
                }
                if (i < j && c[i] != c[j]) {
                    c[i] = sArr[j];
                    c[j] = sArr[i];
                }
            } catch (Exception e) {
            } finally {
                i++;
                j--;
            }
        }
        StringBuilder sBuilder = new StringBuilder(c.length);
        for (int k = 0; k < c.length; k++) {
            sBuilder.append(c[k]);
        }
        return sBuilder.toString();
    }

    public static boolean isVowels(char c) {
        switch (c) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'E':
        case 'I':
        case 'O':
        case 'U':
            return true;
        default:
            return false;
        }
    }
}
// @lc code=end
