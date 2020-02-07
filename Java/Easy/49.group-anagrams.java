import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 *
 * https://leetcode.com/problems/group-anagrams/description/
 *
 * algorithms
 * Medium (51.67%)
 * Likes:    2497
 * Dislikes: 146
 * Total Accepted:    478.8K
 * Total Submissions: 916.5K
 * Testcase Example:  '["eat","tea","tan","ate","nat","bat"]'
 *
 * Given an array of strings, group anagrams together.
 * 
 * Example:
 * 
 * 
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
 * Output:
 * [
 * ⁠ ["ate","eat","tea"],
 * ⁠ ["nat","tan"],
 * ⁠ ["bat"]
 * ]
 * 
 * Note:
 * 
 * 
 * All inputs will be in lowercase.
 * The order of your output does not matter.
 * 
 * 
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new LinkedList<>();
        if (strs.length < 1) {
            return ans;
        }
        if (strs.length == 1) {
            List<String> tmp = new LinkedList<>();
            tmp.add(strs[0]);
            ans.add(tmp);
            return ans;
        }
        int groupsNum = 0;
        // <HashCode, GroupIndex>
        Map<String, Integer> groups = new HashMap<>();
        for (String str : strs) {
            String id = getID(str);
            // new group
            if (!groups.containsKey(id)) {
                groups.put(id, groupsNum++);
                ans.add(new LinkedList<String>());
            }
            // insert to group
            ans.get(groups.get(id)).add(str);
        }
        return ans;
    }

    public static String getID(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder sBuilder = new StringBuilder(str.length());
        for (char c : ch) {
            sBuilder.append(c);
        }
        return sBuilder.toString();
    }
}
// @lc code=end
