import java.util.HashSet;
import java.util.Set;

/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 *
 * https://leetcode.com/problems/happy-number/description/
 *
 * algorithms
 * Easy (48.25%)
 * Likes:    1382
 * Dislikes: 321
 * Total Accepted:    319.3K
 * Total Submissions: 660.7K
 * Testcase Example:  '19'
 *
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process: Starting with
 * any positive integer, replace the number by the sum of the squares of its
 * digits, and repeat the process until the number equals 1 (where it will
 * stay), or it loops endlessly in a cycle which does not include 1. Those
 * numbers for which this process ends in 1 are happy numbers.
 * 
 * Example: 
 * 
 * 
 * Input: 19
 * Output: true
 * Explanation: 
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * 
 */

// @lc code=start
class Solution {
    public Set<Integer> exsist = new HashSet<>();

    public boolean isHappy(int n) {
        while (n != 1) {
            if (exsist.contains(n)) {
                return false;
            }
            exsist.add(n);
            n = replace(n);
        }
        return true;
    }

    public int replace(int n) {
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n /= 10;
        }
        return sum;
    }
}
// @lc code=end
