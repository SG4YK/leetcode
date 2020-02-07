import java.util.LinkedList;
import java.util.List;

/*
 * @lc app=leetcode id=401 lang=java
 *
 * [401] Binary Watch
 *
 * https://leetcode.com/problems/binary-watch/description/
 *
 * algorithms
 * Easy (46.29%)
 * Likes:    464
 * Dislikes: 805
 * Total Accepted:    74.5K
 * Total Submissions: 161K
 * Testcase Example:  '0'
 *
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and
 * the 6 LEDs on the bottom represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the
 * right.
 * 
 * For example, the above binary watch reads "3:25".
 * 
 * Given a non-negative integer n which represents the number of LEDs that are
 * currently on, return all possible times the watch could represent.
 * 
 * Example:
 * Input: n = 1Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04",
 * "0:08", "0:16", "0:32"]
 * 
 * 
 * Note:
 * 
 * The order of output does not matter.
 * The hour must not contain a leading zero, for example "01:00" is not valid,
 * it should be "1:00".
 * The minute must be consist of two digits and may contain a leading zero, for
 * example "10:2" is not valid, it should be "10:02".
 * 
 * 
 */

// @lc code=start
class Solution {
    public static final String[] hours = { "0:", "1:", "2:", "3:", "4:", "5:", "6:", "7:", "8:", "9:", "10:", "11:" };
    public static final String[] minutes = { "00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11",
            "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29",
            "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47",
            "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59" };

    public List<String> readBinaryWatch(int num) {
        List<String> res = new LinkedList<>();
        if (num == 0) {
            res.add("0:00");
            return res;
        }
        if (num > 8) {
            return res;
        }
        for (int i = 0; i <= num && i < 4; i++) {
            int j = num - i;
            if (j < 6) {
                combine(i, j);
            }
        }
        return res;
    }
}
// @lc code=end
