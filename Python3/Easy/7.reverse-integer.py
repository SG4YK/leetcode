#
# @lc app=leetcode id=7 lang=python3
#
# [7] Reverse Integer
#
# https://leetcode.com/problems/reverse-integer/description/
#
# algorithms
# Easy (25.51%)
# Likes:    2549
# Dislikes: 3972
# Total Accepted:    845.5K
# Total Submissions: 3.3M
# Testcase Example:  '123'
#
# Given a 32-bit signed integer, reverse digits of an integer.
#
# Example 1:
#
#
# Input: 123
# Output: 321
#
#
# Example 2:
#
#
# Input: -123
# Output: -321
#
#
# Example 3:
#
#
# Input: 120
# Output: 21
#
#
# Note:
# Assume we are dealing with an environment which could only store integers
# within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose
# of this problem, assume that your function returns 0 when the reversed
# integer overflows.
#
#

# @lc code=start


class Solution:
    def reverse(self, x: int) -> int:
        max = 2**31
        res = int(str(abs(x))[::-1]) * (1 if x > 0 else -1)
        return res if (res < max and res >= -max) else 0

# @lc code=end
