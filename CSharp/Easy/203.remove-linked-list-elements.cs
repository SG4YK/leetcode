/*
 * @lc app=leetcode id=203 lang=csharp
 *
 * [203] Remove Linked List Elements
 *
 * https://leetcode.com/problems/remove-linked-list-elements/description/
 *
 * algorithms
 * Easy (36.99%)
 * Likes:    1204
 * Dislikes: 70
 * Total Accepted:    284.9K
 * Total Submissions: 767.7K
 * Testcase Example:  '[1,2,6,3,4,5,6]\n6'
 *
 * Remove all elements from a linked list of integers that have value val.
 * 
 * Example:
 * 
 * 
 * Input:  1->2->6->3->4->5->6, val = 6
 * Output: 1->2->3->4->5
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }    
 */
public class Solution {
    public ListNode RemoveElements (ListNode head, int val) {
        if (head == null) {
            return head;
        }
        var dummy = new ListNode (0), p = dummy;
        dummy.next = head;
        while (p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return dummy.next;
    }
}
// @lc code=end