--
-- @lc app=leetcode id=181 lang=mysql
--
-- [181] Employees Earning More Than Their Managers
--
-- https://leetcode.com/problems/employees-earning-more-than-their-managers/description/
--
-- database
-- Easy (52.95%)
-- Likes:    477
-- Dislikes: 56
-- Total Accepted:    147.7K
-- Total Submissions: 278.1K
-- Testcase Example:  '{"headers": {"Employee": ["Id", "Name", "Salary", "ManagerId"]}, "rows": {"Employee": [[1, "Joe", 70000, 3], [2, "Henry", 80000, 4], [3, "Sam", 60000, null], [4, "Max", 90000, null]]}}'
--
-- The Employee table holds all employees including their managers. Every
-- employee has an Id, and there is also a column for the manager Id.
-- 
-- 
-- +----+-------+--------+-----------+
-- | Id | Name  | Salary | ManagerId |
-- +----+-------+--------+-----------+
-- | 1  | Joe   | 70000  | 3         |
-- | 2  | Henry | 80000  | 4         |
-- | 3  | Sam   | 60000  | NULL      |
-- | 4  | Max   | 90000  | NULL      |
-- +----+-------+--------+-----------+
-- 
-- 
-- Given the Employee table, write a SQL query that finds out employees who
-- earn more than their managers. For the above table, Joe is the only employee
-- who earns more than his manager.
-- 
-- 
-- +----------+
-- | Employee |
-- +----------+
-- | Joe      |
-- +----------+
-- 
-- 
--

-- @lc code=start
-- # Write your MySQL query statement below
SELECT a.Name as 'Employee'
FROM Employee AS a, Employee AS b
WHERE a.ManagerId = b.id AND a.Salary > b.Salary;
-- @lc code=end

