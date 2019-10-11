import java.util.Stack;

/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 *
 * https://leetcode.com/problems/valid-parentheses/description/
 *
 * algorithms
 * Easy (37.36%)
 * Likes:    3442
 * Dislikes: 167
 * Total Accepted:    719.6K
 * Total Submissions: 1.9M
 * Testcase Example:  '"()"'
 *
 * Given a string containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * 
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Note that an empty string is also considered valid.
 * 
 * Example 1:
 * 
 * 
 * Input: "()"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: "()[]{}"
 * Output: true
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: "(]"
 * Output: false
 * 
 * 
 * Example 4:
 * 
 * 
 * Input: "([)]"
 * Output: false
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "{[]}"
 * Output: true
 * 
 * 
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        if (s.length() % 2 != 0) {
            return false;
        }
        char tmp;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
            case '(':
                stk.push(s.charAt(i));
                break;
            case '{':
                stk.push(s.charAt(i));
                break;
            case '[':
                stk.push(s.charAt(i));
                break;
            case ')':
                if (stk.empty()) {
                    return false;
                }
                tmp = stk.pop();
                if (tmp != '(') {
                    stk.push(tmp);
                }
                break;
            case '}':
                if (stk.empty()) {
                    return false;
                }
                tmp = stk.pop();
                if (tmp != '{') {
                    stk.push(tmp);
                }
                break;
            case ']':
                if (stk.empty()) {
                    return false;
                }
                tmp = stk.pop();
                if (tmp != '[') {
                    stk.push(tmp);
                }
                break;
            default:
                break;
            }
        }
        return stk.empty();
    }
}
// @lc code=end
