import java.util.ArrayList;

/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 *
 * algorithms
 * Easy (48.23%)
 * Likes:    877
 * Dislikes: 84
 * Total Accepted:    295.6K
 * Total Submissions: 611.8K
 * Testcase Example:  '5'
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's
 * triangle.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 * Example:
 * 
 * 
 * Input: 5
 * Output:
 * [
 * ⁠    [1],
 * ⁠   [1,1],
 * ⁠  [1,2,1],
 * ⁠ [1,3,3,1],
 * ⁠[1,4,6,4,1]
 * ]
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>(numRows);
        if (numRows == 0) {
            return res;
        }
        ArrayList<Integer> tmp = new ArrayList<Integer>(1);
        tmp.add(1);
        res.add(tmp);
        for (int i = 1; i < numRows; i++) {
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
        return res;
    }
}
// @lc code=end
