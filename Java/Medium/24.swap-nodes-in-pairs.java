/*
 * @lc app=leetcode id=24 lang=java
 *
 * [24] Swap Nodes in Pairs
 *
 * https://leetcode.com/problems/swap-nodes-in-pairs/description/
 *
 * algorithms
 * Medium (46.77%)
 * Likes:    1493
 * Dislikes: 136
 * Total Accepted:    372.5K
 * Total Submissions: 792.8K
 * Testcase Example:  '[1,2,3,4]'
 *
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * You may not modify the values in the list's nodes, only nodes itself may be
 * changed.
 *
 *
 *
 * Example:
 *
 *
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 *
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode foo = head;
        ListNode bar = head.next;
        ListNode res = bar;
        ListNode nextFoo = null;
        ListNode nextBar = null;

        while (foo.next != null && bar.next != null) {
            nextFoo = bar.next;
            nextBar = nextFoo.next;
            bar.next = foo;
            if (nextBar == null) {
                foo.next = nextFoo;
                return res;
            } else {
                foo.next = nextBar;
                foo = nextFoo;
                bar = nextBar;
            }
        }

        foo.next = null;
        bar.next = foo;
        return res;
    }
}
// @lc code=end
