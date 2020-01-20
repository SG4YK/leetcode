/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 *
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (32.02%)
 * Likes:    6254
 * Dislikes: 1625
 * Total Accepted:    1.1M
 * Total Submissions: 3.4M
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 *
 * Example:
 *
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 *
 *
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode p = res;
        ListNode pre = new ListNode(0);
        int carry = 0;
        while (l1 != null && l2 != null) { // stop when either of the listnodes reaches its end
            int cur = l1.val + l2.val + carry;
            if (cur < 10) {
                carry = 0;
            } else {
                carry = cur / 10;
                cur = cur % 10;
            }
            p.next = new ListNode(cur);
            pre = p;
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null || l2 == null) {
            if (l1 == null && l2 == null && carry != 0) { // both listnodes reach the end
                pre.next.next = new ListNode(carry);
            } else { // only one of the listnode reach its end
                ListNode notEnd = l2 == null ? l1 : l2;
                if (carry == 0) {
                    p.next = notEnd;
                } else {
                    p.next = addCarry(notEnd, carry);
                    carry = 0;
                }
            }
        }
        return res.next;
    }

    /**
     * Add the carry to the target listnode.
     * @param l     The first node of the rest part of the listnode, which didn't
     *              reach the end.
     * @param carry Carry.
     * @return The listnode which has been added.
     */
    public ListNode addCarry(ListNode l, int carry) {
        ListNode p = l;
        ListNode pre = p;
        while (p != null) {
            p.val += carry;
            if (p.val < 10) {
                return l;
            } else {
                carry = p.val / 10;
                p.val %= 10;
                pre = p;
                p = p.next;
            }
        }
        if (carry != 0) {
            pre.next = new ListNode(carry);
        }
        return l;
    }
}
// @lc code=end
