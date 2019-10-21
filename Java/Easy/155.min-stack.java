import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/*
 * @lc app=leetcode id=155 lang=java
 *
 * [155] Min Stack
 *
 * https://leetcode.com/problems/min-stack/description/
 *
 * algorithms
 * Easy (39.24%)
 * Likes:    2199
 * Dislikes: 242
 * Total Accepted:    361.3K
 * Total Submissions: 920.3K
 * Testcase Example:  '["MinStack","push","push","push","getMin","pop","top","getMin"]\n[[],[-2],[0],[-3],[],[],[],[]]'
 *
 * Design a stack that supports push, pop, top, and retrieving the minimum
 * element in constant time.
 * 
 * 
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * 
 * 
 * 
 * 
 * Example:
 * 
 * 
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> Returns -3.
 * minStack.pop();
 * minStack.top();      --> Returns 0.
 * minStack.getMin();   --> Returns -2.
 * 
 * 
 * 
 * 
 */

// @lc code=start
class MinStack {

    /** initialize your data structure here. */
    int top = -1;
    List<Integer> data = new LinkedList<Integer>();

    public MinStack() {
    }

    public void push(int x) {
        top++;
        if (data.size() < top + 1) {
            data.add(x);
        } else {
            data.set(top, x);
        }
    }

    public void pop() {
        top--;
    }

    public int top() {
        return data.get(top);
    }

    public int getMin() {
        int min = data.get(0);
        int index = 0;
        Iterator<Integer> it = data.iterator();
        while (it.hasNext() && index++ <= top) {
            min = Math.min(min, it.next());
        }
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */
// @lc code=end
