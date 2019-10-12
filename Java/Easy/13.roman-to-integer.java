import java.util.Stack;

/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 *
 * https://leetcode.com/problems/roman-to-integer/description/
 *
 * algorithms
 * Easy (53.45%)
 * Likes:    1493
 * Dislikes: 2926
 * Total Accepted:    503.3K
 * Total Submissions: 941.5K
 * Testcase Example:  '"III"'
 *
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D
 * and M.
 * 
 * 
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * For example, two is written as II in Roman numeral, just two one's added
 * together. Twelve is written as, XII, which is simply X + II. The number
 * twenty seven is written as XXVII, which is XX + V + II.
 * 
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is
 * written as IV. Because the one is before the five we subtract it making
 * four. The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 * 
 * 
 * I can be placed before V (5) and X (10) to make 4 and 9. 
 * X can be placed before L (50) and C (100) to make 40 and 90. 
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * 
 * 
 * Given a roman numeral, convert it to an integer. Input is guaranteed to be
 * within the range from 1 to 3999.
 * 
 * Example 1:
 * 
 * 
 * Input: "III"
 * Output: 3
 * 
 * Example 2:
 * 
 * 
 * Input: "IV"
 * Output: 4
 * 
 * Example 3:
 * 
 * 
 * Input: "IX"
 * Output: 9
 * 
 * Example 4:
 * 
 * 
 * Input: "LVIII"
 * Output: 58
 * Explanation: L = 50, V= 5, III = 3.
 * 
 * 
 * Example 5:
 * 
 * 
 * Input: "MCMXCIV"
 * Output: 1994
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * 
 */

// @lc code=start
class Solution {
    public int romanToInt(String s) {
        if (s.equals("")) {
            return 0;
        }
        Stack<Character> stk = new Stack<Character>();
        int total = 0;
        int i = 0;
        try {
            for (i = 0; i < s.length(); i++) {
                // stk.push(s.charAt(i));
                switch (s.charAt(i)) {
                case 'I': {
                    if (s.charAt(i + 1) == 'V') {
                        total += 4;
                        i++;
                    } else if (s.charAt(i + 1) == 'X') {
                        total += 9;
                        i++;
                    } else {
                        total += 1;
                    }
                    break;
                }
                case 'X': {
                    if (s.charAt(i + 1) == 'L') {
                        total += 40;
                        i++;
                    } else if (s.charAt(i + 1) == 'C') {
                        total += 90;
                        i++;
                    } else {
                        total += 10;
                    }
                    break;
                }
                case 'C': {
                    if (s.charAt(i + 1) == 'D') {
                        total += 400;
                        i++;
                    } else if (s.charAt(i + 1) == 'M') {
                        total += 900;
                        i++;
                    } else {
                        total += 100;
                    }
                    break;
                }
                case 'V':
                    total += 5;
                    break;
                case 'L':
                    total += 50;
                    break;
                case 'D':
                    total += 500;
                    break;
                case 'M':
                    total += 1000;
                    break;
                default:
                    break;
                }
            }
        } catch (Exception e) { // reach the end
            // TODO: handle exception
        }
        if (i < s.length()) {
            switch (s.charAt(s.length() - 1)) { // Last character
            case 'I':
                total += 1;
                break;
            case 'V':
                total += 5;
                break;
            case 'X':
                total += 10;
                break;
            case 'L':
                total += 50;
                break;
            case 'C':
                total += 100;
                break;
            case 'D':
                total += 500;
                break;
            case 'M':
                total += 1000;
                break;
            default:
                break;
            }
        }
        return total;
    }
}
// @lc code=end
