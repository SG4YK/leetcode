/*
 * @lc app=leetcode id=21 lang=java
 *
 * [21] Merge Two Sorted Lists
 *
 * https://leetcode.com/problems/merge-two-sorted-lists/description/
 *
 * algorithms
 * Easy (49.28%)
 * Likes:    2738
 * Dislikes: 399
 * Total Accepted:    707.5K
 * Total Submissions: 1.4M
 * Testcase Example:  '[1,2,4]\n[1,3,4]'
 *
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 * 
 * Example:
 * 
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            if (l2 == null) {
                return null; // l2, l2 are both null
            }
            return l2; // l1 is null
        }
        if (l2 == null) {
            return l1; // l2 is null
        }

        ListNode l3;
        if (l1.val < l2.val) { // Initialized l3 with the smaller val
            l3 = l1;
            l1 = l1.next;
        } else {
            l3 = l2;
            l2 = l2.next;
        }
        ListNode p =l3;

        while ((l1 != null && l2 != null)) { // Until either of the lists reach its end
            if (l1.val < l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        p.next = l1 == null ? l2 : l1; 
        return l3;
    }
}
// @lc code=end
