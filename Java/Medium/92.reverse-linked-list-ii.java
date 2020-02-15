/*
 * @lc app=leetcode id=92 lang=java
 *
 * [92] Reverse Linked List II
 *
 * https://leetcode.com/problems/reverse-linked-list-ii/description/
 *
 * algorithms
 * Medium (37.07%)
 * Likes:    1796
 * Dislikes: 118
 * Total Accepted:    239.8K
 * Total Submissions: 644.9K
 * Testcase Example:  '[1,2,3,4,5]\n2\n4'
 *
 * Reverse a linked list from position m to n. Do it in one-pass.
 * 
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * 
 * Example:
 * 
 * 
 * Input: 1->2->3->4->5->NULL, m = 2, n = 4
 * Output: 1->4->3->2->5->NULL
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m >= n) {
            return head;
        }
        ListNode slow = head, fast = head;
        for (int i = 1; i < m - 1; i++) {
            slow = slow.next;
        }
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        if (m > 1) {
            slow.next = reverseList(slow.next, fast);
        } else {
            head = reverseList(head, fast);
        }
        return head;
    }

    public ListNode reverseList(ListNode head, ListNode end) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = end, p = head;
        while (p != end) {
            ListNode next = p.next;
            p.next = res;
            res = p;
            p = next;
        }
        return res;
    }
}
// @lc code=end
