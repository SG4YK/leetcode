import java.lang.annotation.index;

/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 *
 * https://leetcode.com/problems/word-search/description/
 *
 * algorithms
 * Medium (33.45%)
 * Likes:    2729
 * Dislikes: 137
 * Total Accepted:    385.5K
 * Total Submissions: 1.2M
 * Testcase Example:  '[["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]\n"ABCCED"'
 *
 * Given a 2D board and a word, find if the word exists in the grid.
 * 
 * The word can be constructed from letters of sequentially adjacent cell,
 * where "adjacent" cells are those horizontally or vertically neighboring. The
 * same letter cell may not be used more than once.
 * 
 * Example:
 * 
 * 
 * board =
 * [
 * ⁠ ['A','B','C','E'],
 * ⁠ ['S','F','C','S'],
 * ⁠ ['A','D','E','E']
 * ]
 * 
 * Given word = "ABCCED", return true.
 * Given word = "SEE", return true.
 * Given word = "ABCB", return false.
 * 
 * 
 */

// @lc code=start
class Solution {
    char[] chars;
    char[][] board;

    public boolean exist(char[][] _board, String word) {
        board = _board;
        if (board == null || board.length <= 0 || board.length * board[0].length < word.length()) {
            return false;
        }

        if (word.length() <= 0) {
            return true;
        }
        chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                try {
                    dfs(i, j, 0);
                } catch (Exception e) {
                    return true;
                }
            }
        }
        return false;
    }

    private void dfs(int i, int j, int index) throws Exception {
        // out of bound or not equal
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != chars[index]) {
            return;
        }

        // board[i][j] == chars[index]
        if (index == chars.length - 1) {
            // return true; // success
            throw new Exception("Success");
        }

        char c = board[i][j];
        // temporally marked board[i][j] as searched
        board[i][j] = 0;

        dfs(i, j + 1, index + 1);
        dfs(i, j - 1, index + 1);
        dfs(i + 1, j, index + 1);
        dfs(i - 1, j, index + 1);

        board[i][j] = c;
    }
}
// @lc code=end
