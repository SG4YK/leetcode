/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
 *
 * https://leetcode.com/problems/odd-even-linked-list/description/
 *
 * algorithms
 * Medium (51.76%)
 * Likes:    1214
 * Dislikes: 266
 * Total Accepted:    198.6K
 * Total Submissions: 381.4K
 * Testcase Example:  '[1,2,3,4,5]'
 *
 * Given a singly linked list, group all odd nodes together followed by the
 * even nodes. Please note here we are talking about the node number and not
 * the value in the nodes.
 * 
 * You should try to do it in place. The program should run in O(1) space
 * complexity and O(nodes) time complexity.
 * 
 * Example 1:
 * 
 * 
 * Input: 1->2->3->4->5->NULL
 * Output: 1->3->5->2->4->NULL
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: 2->1->3->5->6->4->7->NULL
 * Output: 2->3->6->7->1->5->4->NULL
 * 
 * 
 * Note:
 * 
 * 
 * The relative order inside both the even and odd groups should remain as it
 * was in the input.
 * The first node is considered odd, the second node even and so on ...
 * 
 * 
 */

// @lc code=start
/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode(int x) { val = x; } }
 */
class Solution {
    private ListNode lastEven = null;

    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }
        ListNode lastOddNode = findLastOdd(head);

        // move all even nodes
        ListNode oddNode = head, evenNode = head.next, p = lastOddNode;

        while (oddNode != lastOddNode) {
            try {
                // move even node to the end of the list
                p.next = evenNode;
                p = p.next;

                // detatch the original even node
                oddNode.next = evenNode.next;
                evenNode.next = null;

                // update odd node and even node
                oddNode = oddNode.next;
                evenNode = oddNode.next;
            } catch (Exception e) {
            }
        }
        // add the last even node to the end if length is even
        p.next = lastEven;
        
        return head;
    }

    private ListNode findLastOdd(ListNode head) {
        ListNode p = head;
        while (p.next != null && p.next.next != null) {
            p = p.next.next;
        }
        lastEven = p.next;
        return p;
    }
}
// @lc code=end
