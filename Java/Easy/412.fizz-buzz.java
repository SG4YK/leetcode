import java.util.ArrayList;

/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 *
 * https://leetcode.com/problems/fizz-buzz/description/
 *
 * algorithms
 * Easy (60.92%)
 * Likes:    697
 * Dislikes: 996
 * Total Accepted:    277.8K
 * Total Submissions: 455.3K
 * Testcase Example:  '1'
 *
 * Write a program that outputs the string representation of numbers from 1 to
 * n.
 * 
 * But for multiples of three it should output “Fizz” instead of the number and
 * for the multiples of five output “Buzz”. For numbers which are multiples of
 * both three and five output “FizzBuzz”.
 * 
 * Example:
 * 
 * n = 15,
 * 
 * Return:
 * [
 * ⁠   "1",
 * ⁠   "2",
 * ⁠   "Fizz",
 * ⁠   "4",
 * ⁠   "Buzz",
 * ⁠   "Fizz",
 * ⁠   "7",
 * ⁠   "8",
 * ⁠   "Fizz",
 * ⁠   "Buzz",
 * ⁠   "11",
 * ⁠   "Fizz",
 * ⁠   "13",
 * ⁠   "14",
 * ⁠   "FizzBuzz"
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        String fizz = "Fizz", buzz = "Buzz", fizzBuzz = "FizzBuzz";
        List<String> res = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0) {
                res.add(fizzBuzz);
            } else if ((i + 1) % 3 == 0) {
                res.add(fizz);
            } else if ((i + 1) % 5 == 0) {
                res.add(buzz);
            } else {
                res.add(String.valueOf(i + 1));
            }
        }
        return res;
    }
}
// @lc code=end
