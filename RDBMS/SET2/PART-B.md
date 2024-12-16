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
\[
\text{Employee} \ \text{RIGHT OUTER JOIN} \ \text{Loan}
\]

**Output:**

| empno | name    | isbn   |
|-------|---------|--------|
| 101   | Alice   | 12345  |
| 102   | Bob     | 67890  |

---

#### **Full Outer Join**: Includes all rows from both relations, with `NULL` values for missing matches.

**Relational Algebra:**
\[
\text{Employee} \ \text{FULL OUTER JOIN} \ \text{Loan}
\]

**Output:**

| empno | name    | isbn   |
|-------|---------|--------|
| 101   | Alice   | 12345  |
| 102   | Bob     | 67890  |
| 103   | Charlie | NULL   |
