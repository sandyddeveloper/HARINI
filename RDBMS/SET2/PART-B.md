# 13) a)

### 1. Create all tables with key attributes
```sql
CREATE TABLE Employee (
    empno INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    office VARCHAR(100),
    age INT
);

CREATE TABLE Books (
    isbn VARCHAR(20) PRIMARY KEY,
    title VARCHAR(200) NOT NULL,
    authors VARCHAR(200),
    publisher VARCHAR(100)
);

CREATE TABLE Loan (
    empno INT,
    isbn VARCHAR(20),
    date DATE,
    PRIMARY KEY (empno, isbn),
    FOREIGN KEY (empno) REFERENCES Employee(empno),
    FOREIGN KEY (isbn) REFERENCES Books(isbn)
);
```

---

### 2. Find the names of all employees who have borrowed a book published by McGraw-Hill
```sql
SELECT DISTINCT e.name
FROM Employee e
JOIN Loan l ON e.empno = l.empno
JOIN Books b ON l.isbn = b.isbn
WHERE b.publisher = 'McGraw-Hill';
```

---

### 3. Find the names of all employees who have borrowed **all books** published by McGraw-Hill
```sql
SELECT e.name
FROM Employee e
JOIN Loan l ON e.empno = l.empno
JOIN Books b ON l.isbn = b.isbn
WHERE b.publisher = 'McGraw-Hill'
GROUP BY e.empno, e.name
HAVING COUNT(DISTINCT b.isbn) = (
    SELECT COUNT(DISTINCT isbn)
    FROM Books
    WHERE publisher = 'McGraw-Hill'
);
```

---

### 4. Find the names of employees who have borrowed **more than five different books** published by McGraw-Hill
```sql
SELECT e.name
FROM Employee e
JOIN Loan l ON e.empno = l.empno
JOIN Books b ON l.isbn = b.isbn
WHERE b.publisher = 'McGraw-Hill'
GROUP BY e.empno, e.name
HAVING COUNT(DISTINCT b.isbn) > 5;
```

# 13) b)

### 1. **Select** (σ)

The **select** operation in relational algebra retrieves tuples (rows) from a relation that satisfy a specific condition.

#### Example:
Suppose we have a relation **Employee(empno, name, office, age)**.

**Query:** Retrieve employees who are older than 30.

**Relational Algebra:**

\sigma_{\text{age} > 30} (\text{Employee})


**Result:** All tuples from the Employee table where the age is greater than 30.

#### Example Data:

| empno | name    | office  | age |
|-------|---------|---------|-----|
| 101   | Alice   | A1      | 25  |
| 102   | Bob     | A2      | 35  |
| 103   | Charlie | A3      | 40  |

**Output:**

| empno | name    | office  | age |
|-------|---------|---------|-----|
| 102   | Bob     | A2      | 35  |
| 103   | Charlie | A3      | 40  |

---

### 2. **Project** (π)

The **project** operation retrieves specific columns from a relation, eliminating duplicates.

#### Example:
**Query:** Retrieve the names and ages of employees.

**Relational Algebra:**


#### Example Data:

| empno | name    | office  | age |
|-------|---------|---------|-----|
| 101   | Alice   | A1      | 25  |
| 102   | Bob     | A2      | 35  |
| 103   | Charlie | A3      | 40  |

**Output:**

| name    | age |
|---------|-----|
| Alice   | 25  |
| Bob     | 35  |
| Charlie | 40  |

---

### 3. **Cartesian Product** (×)

The **Cartesian product** operation combines tuples from two relations. For each tuple in the first relation, it pairs with every tuple in the second relation.

#### Example:
Suppose we have two relations:

**Employee(empno, name):**

| empno | name    |
|-------|---------|
| 101   | Alice   |
| 102   | Bob     |

**Department(dept_id, dept_name):**

| dept_id | dept_name   |
|---------|-------------|
| 1       | HR          |
| 2       | IT          |

**Query:** Combine Employee and Department data.

**Relational Algebra:**
Employee *Department


**Output:**

| empno | name    | dept_id | dept_name |
|-------|---------|---------|-----------|
| 101   | Alice   | 1       | HR        |
| 101   | Alice   | 2       | IT        |
| 102   | Bob     | 1       | HR        |
| 102   | Bob     | 2       | IT        |

---

### 4. **Outer Joins**

Outer joins include tuples from one or both relations even if they do not match.

#### Example:
Suppose we have:

**Employee(empno, name):**

| empno | name    |
|-------|---------|
| 101   | Alice   |
| 102   | Bob     |
| 103   | Charlie |

**Loan(empno, isbn):**

| empno | isbn    |
|-------|---------|
| 101   | 12345   |
| 102   | 67890   |

---

#### **Left Outer Join**: Includes all rows from the left relation and matching rows from the right relation. Non-matching rows in the right relation will have `NULL` values.

**Relational Algebra:**
\[
\text{Employee} \ \text{LEFT OUTER JOIN} \ \text{Loan}
\]

**Output:**

| empno | name    | isbn   |
|-------|---------|--------|
| 101   | Alice   | 12345  |
| 102   | Bob     | 67890  |
| 103   | Charlie | NULL   |

---

#### **Right Outer Join**: Includes all rows from the right relation and matching rows from the left relation. Non-matching rows in the left relation will have `NULL` values.

**Relational Algebra:**
[
{Employee}{RIGHT OUTER JOIN}{Loan}]

**Output:**

| empno | name    | isbn   |
|-------|---------|--------|
| 101   | Alice   | 12345  |
| 102   | Bob     | 67890  |

---

#### **Full Outer Join**: Includes all rows from both relations, with `NULL` values for missing matches.

**Relational Algebra:**
\[
{Employee}{FULL OUTER JOIN}{Loan}
\]

**Output:**

| empno | name    | isbn   |
|-------|---------|--------|
| 101   | Alice   | 12345  |
| 102   | Bob     | 67890  |
| 103   | Charlie | NULL   |

# 16, a) 

Here is the **DDL (Data Definition Language)** and **DML (Data Manipulation Language)** script for a `Student` database containing `student-details` and `course-details` tables:

---

### **1. DDL for Creating Tables**

#### Create the `Student` Table
```sql
CREATE TABLE Student (
    id INT PRIMARY KEY,              -- Unique student ID
    name VARCHAR(100) NOT NULL,      -- Student name
    dob DATE NOT NULL,               -- Date of birth
    branch VARCHAR(50) NOT NULL,     -- Branch of study
    date_of_join DATE NOT NULL       -- Date of joining
);
```

#### Create the `Course` Table
```sql
CREATE TABLE Course (
    cid INT PRIMARY KEY,             -- Unique course ID
    cname VARCHAR(100) NOT NULL,     -- Course name
    sid INT NOT NULL,                -- Student ID (foreign key)
    faculty_name VARCHAR(100) NOT NULL, -- Faculty name
    fid INT NOT NULL,                -- Faculty ID
    marks INT,                       -- Marks obtained in the course
    FOREIGN KEY (sid) REFERENCES Student(id) -- Relating course to student
);
```

---

### **2. DML for Adding Data**

#### Insert Data into `Student` Table
```sql
INSERT INTO Student (id, name, dob, branch, date_of_join) 
VALUES 
(1, 'Alice', '2000-01-15', 'Computer Science', '2018-08-01'),
(2, 'Bob', '2001-03-10', 'Mechanical Engineering', '2019-08-01'),
(3, 'Charlie', '1999-12-22', 'Electrical Engineering', '2017-08-01');
```

#### Insert Data into `Course` Table
```sql
INSERT INTO Course (cid, cname, sid, faculty_name, fid, marks) 
VALUES 
(101, 'Data Structures', 1, 'Dr. Smith', 201, 85),
(102, 'Thermodynamics', 2, 'Dr. Johnson', 202, 78),
(103, 'Circuit Analysis', 3, 'Dr. Williams', 203, 92),
(104, 'Algorithms', 1, 'Dr. Brown', 204, 88),
(105, 'Machine Design', 2, 'Dr. Lee', 205, 74);
```

---

### **3. Query Examples**

#### a) Retrieve all students with their details:
```sql
SELECT * FROM Student;
```

#### b) Retrieve the courses taken by a specific student (e.g., Alice):
```sql
SELECT c.cname, c.faculty_name, c.marks
FROM Course c
JOIN Student s ON c.sid = s.id
WHERE s.name = 'Alice';
```

#### c) Find the average marks for each course:
```sql
SELECT cname, AVG(marks) AS average_marks
FROM Course
GROUP BY cname;
```

#### d) Retrieve students who scored more than 80 in any course:
```sql
SELECT DISTINCT s.name, c.cname, c.marks
FROM Student s
JOIN Course c ON s.id = c.sid
WHERE c.marks > 80;
```
