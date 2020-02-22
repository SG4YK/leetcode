/*
 * @lc app=leetcode id=824 lang=java
 *
 * [824] Goat Latin
 *
 * https://leetcode.com/problems/goat-latin/description/
 *
 * algorithms
 * Easy (60.59%)
 * Likes:    221
 * Dislikes: 535
 * Total Accepted:    51.1K
 * Total Submissions: 83.8K
 * Testcase Example:  '"I speak Goat Latin"'
 *
 * A sentence S is given, composed of words separated by spaces. Each word
 * consists of lowercase and uppercase letters only.
 * 
 * We would like to convert the sentence to "Goat Latin" (a made-up language
 * similar to Pig Latin.)
 * 
 * The rules of Goat Latin are as follows:
 * 
 * 
 * If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of
 * the word.
 * For example, the word 'apple' becomes 'applema'.
 * 
 * If a word begins with a consonant (i.e. not a vowel), remove the first
 * letter and append it to the end, then add "ma".
 * For example, the word "goat" becomes "oatgma".
 * 
 * Add one letter 'a' to the end of each word per its word index in the
 * sentence, starting with 1.
 * For example, the first word gets "a" added to the end, the second word gets
 * "aa" added to the end and so on.
 * 
 * 
 * Return the final sentence representing the conversion from S to Goat
 * Latin. 
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: "I speak Goat Latin"
 * Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "The quick brown fox jumped over the lazy dog"
 * Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa
 * hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"
 * 
 * 
 * 
 * 
 * Notes:
 * 
 * 
 * S contains only uppercase, lowercase and spaces. Exactly one space between
 * each word.
 * 1 <= S.length <= 150.
 * 
 * 
 */

// @lc code=start
class Solution {
    public String toGoatLatin(String s) {
        if (s == null || s.length() < 1) {
            return s;
        }
        String[] words = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++) {
            res.append(conver(words[i], i));
            res.append(' ');
        }
        res.append(conver(words[words.length - 1], words.length - 1));
        return res.toString();
    }

    private String conver(String word, int index) {
        StringBuilder res = new StringBuilder();
        char[] chars = word.toCharArray();
        int begin = isVowel(chars[0]) ? 0 : 1;
        for (int i = begin; i < chars.length; i++) {
            res.append(chars[i]);
        }
        if (begin == 1) {
            res.append(chars[0]);
        }
        res.append("ma");
        for (int i = 0; i <= index; i++) {
            res.append('a');
        }
        return res.toString();
    }

    private boolean isVowel(char c) {
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
