CREATE TABLE employee (
    Empno INT PRIMARY KEY,      -- Employee number, serves as the unique identifier
    Name VARCHAR(100),          -- Employee name, variable-length character string
    Department VARCHAR(50),     -- Department name, variable-length character string
    Salary DECIMAL(10, 2)       -- Salary with 2 decimal places for currency representation
);


-- 1) List all the employees whose name starts with the letter "L":
SELECT * 
FROM employee 
WHERE Name LIKE 'L%';


-- 2) Find the maximum salary given to employees in each department:
SELECT Department, MAX(Salary) AS MaxSalary
FROM employee
GROUP BY Department;

-- 3) Find the number of employees working in the 'accounts' department:
SELECT COUNT(*) AS NumEmployees
FROM employee
WHERE Department = 'accounts';

-- 4) Find the second-highest salary from the table:
SELECT MAX(Salary) AS SecondMaxSalary
FROM employee
WHERE Salary < (SELECT MAX(Salary) FROM employee);


