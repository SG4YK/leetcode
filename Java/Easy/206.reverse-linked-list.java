import java.util.*;
/*
 * @lc app=leetcode id=206 lang=java
 *
 * [206] Reverse Linked List
 *
 * https://leetcode.com/problems/reverse-linked-list/description/
 *
 * algorithms
 * Easy (59.14%)
 * Likes:    3476
 * Dislikes: 78
 * Total Accepted:    812.2K
 * Total Submissions: 1.4M
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * Reverse a singly linked list.
 * 
 * Example:
 * 
 * 
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * 
 * 
 * Follow up:
 * 
 * A linked list can be reversed either iteratively or recursively. Could you
 * implement both?
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    // recursively, 22ms
    // public ListNode reverseList(ListNode head) {
    // if (head == null || head.next == null) {
    // return head;
    // }
    // ListNode fast = head.next, slow = head;
    // while (fast.next != null) {
    // fast = fast.next;
    // slow = slow.next;
    // }
    // slow.next = null;
    // fast.next = reverseList(head);
    // return fast;
    // }

    // using stackm, 1ms
    // public ListNode reverseList(ListNode head) {
    // if (head == null || head.next == null) {
    // return head;
    // }
    // Stack<ListNode> nodes = new Stack<>();
    // ListNode p = head, res;
    // while (p.next != null) {
    // nodes.push(p);
    // p = p.next;
    // }
    // res = p;
    // while (!nodes.empty()) {
    // p.next = nodes.pop();
    // p = p.next;
    // }
    // p.next = null;
    // return res;
    // }

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode res = null, p = head;
        while (p != null) {
            ListNode next = p.next;
			p.next = res;
			res = p;
			p = next;
        }
        return res;
    }
}
// @lc code=end
