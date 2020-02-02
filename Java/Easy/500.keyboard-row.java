/*
 * @lc app=leetcode id=500 lang=java
 *
 * [500] Keyboard Row
 *
 * https://leetcode.com/problems/keyboard-row/description/
 *
 * algorithms
 * Easy (63.42%)
 * Likes:    471
 * Dislikes: 573
 * Total Accepted:    102.2K
 * Total Submissions: 160.7K
 * Testcase Example:  '["Hello","Alaska","Dad","Peace"]'
 *
 * Given a List of words, return the words that can be typed using letters of
 * alphabet on only one row's of American keyboard like the image
 * below.
 * 
 * 
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * 
 * 
 * 
 * 
 * Note:
 * 
 * 
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 * 
 * 
 */

// @lc code=start
class Solution {
    public static int[] keys = { 1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2 };

    // {A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z};
    public String[] findWords(String[] words) {
        int count = 0;
        int[] mark = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null || words[i].length() <= 1 || check(words[i])) {
                count++;
                mark[i] = 1;
            }
        }
        String[] ans = new String[count];
        int p = 0;
        for (int i = 0; i < count; i++) {
            while (true) {
                if (mark[p] == 1) {
                    ans[i] = words[p++];
                    break;
                } else {
                    p++;
                }
            }
        }
        return ans;
    }

    public static boolean check(String s) {
        char[] chars = s.toCharArray();
        int row = keys[chars[0] <= 'Z' ? chars[0] - 'A' : chars[0] - 'a'];
        for (int i = 1; i < chars.length; i++) {
            if (row != keys[chars[i] <= 'Z' ? chars[i] - 'A' : chars[i] - 'a']) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
