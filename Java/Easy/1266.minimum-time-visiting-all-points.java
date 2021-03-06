/*
 * @lc app=leetcode id=1266 lang=java
 *
 * [1266] Minimum Time Visiting All Points
 *
 * https://leetcode.com/problems/minimum-time-visiting-all-points/description/
 *
 * algorithms
 * Easy (78.86%)
 * Likes:    160
 * Dislikes: 44
 * Total Accepted:    24.5K
 * Total Submissions: 30.9K
 * Testcase Example:  '[[1,1],[3,4],[-1,0]]'
 *
 * On a plane there are n points with integer coordinates points[i] = [xi, yi].
 * Your task is to find the minimum time in seconds to visit all points.
 * 
 * You can move according to the next rules:
 * 
 * 
 * In one second always you can either move vertically, horizontally by one
 * unit or diagonally (it means to move one unit vertically and one unit
 * horizontally in one second).
 * You have to visit the points in the same order as they appear in the
 * array.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: points = [[1,1],[3,4],[-1,0]]
 * Output: 7
 * Explanation: One optimal path is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3]
 * -> [1,2] -> [0,1] -> [-1,0]   
 * Time from [1,1] to [3,4] = 3 seconds 
 * Time from [3,4] to [-1,0] = 4 seconds
 * Total time = 7 seconds
 * 
 * Example 2:
 * 
 * 
 * Input: points = [[3,2],[-2,2]]
 * Output: 5
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * points.length == n
 * 1 <= n <= 100
 * points[i].length == 2
 * -1000 <= points[i][0], points[i][1] <= 1000
 * 
 * 
 */

// @lc code=start
class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        if (points.length < 2) {
            return 0;
        }
        int totalTime = 0;
        for (int i = 0; i < points.length - 1; i++) {
            int distX = Math.abs(points[i][0] - points[i + 1][0]);
            int distY = Math.abs(points[i][1] - points[i + 1][1]);
            totalTime += Math.max(distX, distY);
        }
        return totalTime;
    }
}
// @lc code=end
