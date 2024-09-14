CREATE TABLE employee (
    Empno INT PRIMARY KEY,      
    Name VARCHAR(100),          
    Department VARCHAR(50),     
    Salary DECIMAL(10, 2)       
);

INSERT INTO employee (Empno, Name, Department, Salary) VALUES
(1, 'Liam', 'accounts', 5000.00),
(2, 'Sophia', 'hr', 6000.00),
(3, 'Lucas', 'accounts', 4500.00),
(4, 'Lily', 'engineering', 7000.00),
(5, 'Emma', 'hr', 5500.00),
(6, 'Noah', 'engineering', 8000.00),
(7, 'Mason', 'accounts', 6200.00),
(8, 'Logan', 'engineering', 7500.00);



-- 1) List all the employees whose name starts with the letter "L":
SELECT * 
FROM employee 
WHERE Name LIKE 'L%';

-- Output:
Empno	Name	Department	   Salary
1	   Liam	    accounts	  5000.00
3	   Lucas	accounts	  4500.00
4	   Lily	    engineering	  7000.00
8	   Logan	engineering	  7500.00


-- 2) Find the maximum salary given to employees in each department:
SELECT Department, MAX(Salary) AS MaxSalary
FROM employee
GROUP BY Department;


-- Output:
Department	  MaxSalary
accounts	  6200.00
hr	          6000.00
engineering	  8000.00


-- 3) Find the number of employees working in the 'accounts' department:
SELECT COUNT(*) AS NumEmployees
FROM employee
WHERE Department = 'accounts';

-- Output:
NumEmployees
3


-- 4) Find the second-highest salary from the table:
SELECT MAX(Salary) AS SecondMaxSalary
FROM employee
WHERE Salary < (SELECT MAX(Salary) FROM employee);

-- Output:
SecondMaxSalary
7500.00
