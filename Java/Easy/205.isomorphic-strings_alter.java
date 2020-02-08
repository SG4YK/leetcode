/*
 * @lc app=leetcode id=205 lang=java
 *
 * [205] Isomorphic Strings
 *
 * https://leetcode.com/problems/isomorphic-strings/description/
 *
 * algorithms
 * Easy (38.90%)
 * Likes:    1077
 * Dislikes: 297
 * Total Accepted:    259.4K
 * Total Submissions: 666.1K
 * Testcase Example:  '"egg"\n"add"'
 *
 * Given two strings s and t, determine if they are isomorphic.
 * 
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * 
 * All occurrences of a character must be replaced with another character while
 * preserving the order of characters. No two characters may map to the same
 * character but a character may map to itself.
 * 
 * Example 1:
 * 
 * 
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "foo", t = "bar"
 * Output: false
 * 
 * Example 3:
 * 
 * 
 * Input: s = "paper", t = "title"
 * Output: true
 * 
 * Note:
 * You may assume both s and t have the same length.
 * 
 */

// @lc code=start
class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() <= 1 || s.equals(t)) {
            return true;
        }
        char[] arr1  = s.toCharArray();
        char[] arr2  = t.toCharArray();
        char[] map1 = new char[128];
        char[] map2 = new char[128];
        for (int i = 0; i < arr1.length; i++) {
            if (map1[arr1[i]] == 0 && map2[arr2[i]] == 0) {
                map1[arr1[i]] = arr2[i];
                map2[arr2[i]] = arr1[i];
            } else if(map1[arr1[i]] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
// @lc code=end
