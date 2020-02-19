/*
 * @lc app=leetcode id=1189 lang=java
 *
 * [1189] Maximum Number of Balloons
 *
 * https://leetcode.com/problems/maximum-number-of-balloons/description/
 *
 * algorithms
 * Easy (61.07%)
 * Likes:    153
 * Dislikes: 21
 * Total Accepted:    23.2K
 * Total Submissions: 38.1K
 * Testcase Example:  '"nlaebolko"'
 *
 * Given a string text, you want to use the characters of text to form as many
 * instances of the word "balloon" as possible.
 * 
 * You can use each character in text at most once. Return the maximum number
 * of instances that can be formed.
 * 
 * 
 * Example 1:
 * 
 * 
 * 
 * 
 * Input: text = "nlaebolko"
 * Output: 1
 * 
 * 
 * Example 2:
 * 
 * 
 * 
 * 
 * Input: text = "loonbalxballpoon"
 * Output: 2
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: text = "leetcode"
 * Output: 0
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * 1 <= text.length <= 10^4
 * text consists of lower case English letters only.
 * 
 */

// @lc code=start
class Solution {
    public int maxNumberOfBalloons(String text) {
        if (text == null || text.length() < 7) {
            return 0;
        }
        int[] count = new int[26];
        char[] chars = text.toCharArray();
        for (char c : chars) {
            count[c - 'a']++;
        }

        int res = count[0];
        if (res == 0) {
            return res;
        }
        for (int i = 1; i <= 'o' - 'a'; i++) {
            switch ('a' + i) {
            case 'l':
            case 'o':
                count[i] >>= 1;
            case 'n':
            case 'b':
                if (count[i] == 0) {
                    return 0;
                } else if (count[i] < res) {
                    res = count[i];
                }
            default:
                break;
            }
        }
        return res;
    }
}
// @lc code=end
