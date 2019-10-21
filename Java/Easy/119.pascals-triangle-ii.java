import java.util.ArrayList;

/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 *
 * algorithms
 * Easy (45.56%)
 * Likes:    566
 * Dislikes: 180
 * Total Accepted:    230.5K
 * Total Submissions: 505.7K
 * Testcase Example:  '3'
 *
 * Given a non-negative index k where k ≤ 33, return the k^th index row of the
 * Pascal's triangle.
 * 
 * Note that the row index starts from 0.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 * Example:
 * 
 * 
 * Input: 3
 * Output: [1,3,3,1]
 * 
 * 
 * Follow up:
 * 
 * Could you optimize your algorithm to use only O(k) extra space?
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> tmp = new ArrayList<Integer>(1);
        tmp.add(1);
        if (rowIndex == 0) {
            return tmp;
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>(rowIndex);
        res.add(tmp);
        for (int i = 1; i < rowIndex + 1; i++) {
            tmp = new ArrayList<Integer>(i + 1);
            tmp.add(1);
            for (int j = 1; j < i; j++) {
                int m = res.get(i - 1).get(j - 1);
                int n = res.get(i - 1).get(j);
                tmp.add(m + n);
            }
            tmp.add(1);
            res.add(tmp);
        }
        return res.get(rowIndex);
    }
}
// @lc code=end
