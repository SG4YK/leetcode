--
-- @lc app=leetcode id=182 lang=mysql
--
-- [182] Duplicate Emails
--
-- https://leetcode.com/problems/duplicate-emails/description/
--
-- database
-- Easy (58.89%)
-- Likes:    362
-- Dislikes: 24
-- Total Accepted:    152.6K
-- Total Submissions: 257.8K
-- Testcase Example:  '{"headers": {"Person": ["Id", "Email"]}, "rows": {"Person": [[1, "a@b.com"], [2, "c@d.com"], [3, "a@b.com"]]}}'
--
-- Write a SQL query to find all duplicate emails in a table named Person.
-- 
-- 
-- +----+---------+
-- | Id | Email   |
-- +----+---------+
-- | 1  | a@b.com |
-- | 2  | c@d.com |
-- | 3  | a@b.com |
-- +----+---------+
-- 
-- 
-- For example, your query should return the following for the above table:
-- 
-- 
-- +---------+
-- | Email   |
-- +---------+
-- | a@b.com |
-- +---------+
-- 
-- 
-- Note: All emails are in lowercase.
-- 
--

-- @lc code=start
SELECT DISTINCT p1.email AS 'Email'
FROM person AS p1, person AS p2
WHERE p1.email = p2.email AND NOT p1.id = p2.id

-- @lc code=end

