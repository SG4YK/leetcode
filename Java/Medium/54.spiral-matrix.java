import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 *
 * https://leetcode.com/problems/spiral-matrix/description/
 *
 * algorithms
 * Medium (32.32%)
 * Likes:    1724
 * Dislikes: 489
 * Total Accepted:    308.6K
 * Total Submissions: 948.2K
 * Testcase Example:  '[[1,2,3],[4,5,6],[7,8,9]]'
 *
 * Given a matrix of m x n elements (m rows, n columns), return all elements of
 * the matrix in spiral order.
 * 
 * Example 1:
 * 
 * 
 * Input:
 * [
 * ⁠[ 1, 2, 3 ],
 * ⁠[ 4, 5, 6 ],
 * ⁠[ 7, 8, 9 ]
 * ]
 * Output: [1,2,3,6,9,8,7,4,5]
 * 
 * 
 * Example 2:
 * 
 * Input:
 * [
 * ⁠ [1, 2, 3, 4],
 * ⁠ [5, 6, 7, 8],
 * ⁠ [9,10,11,12]
 * ]
 * Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 * 
 */

// @lc code=start
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new ArrayList<Integer>(0);
        }
        int length = matrix.length, width = matrix[0].length;

        List<Integer> ans = new ArrayList<>(length * width);
        if (width == 1) {
            for (int[] row : matrix) {
                ans.add(row[0]);
            }
            return ans;
        }
        int pass = 0, i = 0, direction = 0, j = 0, k = 0;
        while (i < length * width) {
            ans.add(matrix[j][k]);
            i++;
            switch (direction) {
            case 0: // from left to right
                if (k >= width - 2 - pass) {
                    direction = 1;
                }
                k++;
                break;
            case 1: // from top to bottom
                if (j >= length - 2 - pass) {
                    direction = 2;
                }
                j++;
                break;
            case 2: // from right to left
                if (k <= pass + 1) {
                    direction = 3;
                }
                k--;
                break;
            case 3: // from bottom to top
                if (j <= pass + 1) {
                    pass++;
                    j++;
                    k++;
                    direction = k == width - 1 - pass ? 1 : 0;
                }
                j--;
            default:
                break;
            }
        }
        return ans;
    }
}
// @lc code=end