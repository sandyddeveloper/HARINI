### PART - A (2 Marks)

1. **Write the Characteristics that distinguish the Database approach with the File-based Approach?**

   - **Database Approach:**
     - Data is stored in tables (relational model).
     - Provides data abstraction and reduces redundancy.
     - Supports ACID properties (Atomicity, Consistency, Isolation, Durability).
     - Centralized control and multi-user access.
     - Data integrity and security can be enforced.
     - Supports query optimization and scalability.
   - **File-based Approach:**
     - Data stored in files without structure.
     - High redundancy and no standard control.
     - Difficult to enforce data integrity and consistency.
     - No centralized control or indexing.
     - No multi-user concurrent access.
     - Manual searching and data management.

2. **Give an example of one-to-one and one-to-many relationships?**

   - **One-to-One Relationship:** A person and their passport (One person has one passport).
     ```sql
     CREATE TABLE Person (
         person_id INT PRIMARY KEY,
         name VARCHAR(50)
     );
     CREATE TABLE Passport (
         passport_id INT PRIMARY KEY,
         person_id INT UNIQUE,
         FOREIGN KEY (person_id) REFERENCES Person(person_id)
     );
     ```
   - **One-to-Many Relationship:** A department and its employees (One department has many employees).
     ```sql
     CREATE TABLE Department (
         dept_id INT PRIMARY KEY,
         dept_name VARCHAR(50)
     );
     CREATE TABLE Employee (
         emp_id INT PRIMARY KEY,
         dept_id INT,
         FOREIGN KEY (dept_id) REFERENCES Department(dept_id)
     );
     ```

3. **Write the desirable properties of decomposition?**

   - **Lossless Join Property:** Ensures that no information is lost when decomposed tables are joined.
   - **Dependency Preservation:** Functional dependencies are preserved in the decomposed tables.
   - **Redundancy Elimination:** Minimizes duplicate data and ensures efficient storage.
   - **Minimized Data Anomalies:** Reduces update, insertion, and deletion anomalies.

4. **Why 4NF in Normal Form is more desirable than BCNF?**

   - **BCNF (Boyce-Codd Normal Form):** Handles functional dependencies but does not address multi-valued dependencies (MVDs).
   - **4NF (Fourth Normal Form):** Eliminates multi-valued dependencies by ensuring that no table has two or more independent multi-valued facts about an entity.
   - **4NF** provides a higher level of data integrity than BCNF.

5. **What is Serializability? How is it tested?**

   - **Serializability:** Ensures that the result of executing concurrent transactions is equivalent to executing them serially (one after another).
   - **Testing Methods:**
     1. **Conflict Serializability:** Use precedence graph to detect conflicts.
     2. **View Serializability:** Ensures that schedules produce the same result.

6. **What is the difference between shared lock and exclusive lock?**

   - **Shared Lock (Read Lock):**
     - Allows multiple transactions to read the data simultaneously.
     - Prevents write operations until the shared lock is released.
     - Example:
       ```sql
       SELECT * FROM Employee WITH (SHARED);
       ```
   - **Exclusive Lock (Write Lock):**
     - Allows only one transaction to read or modify the data.
     - Prevents other transactions from reading or writing the data.
     - Example:
       ```sql
       UPDATE Employee SET salary = 5000 WHERE emp_id = 1;
       ```

7. **What is the use of RAID?**

   - **RAID (Redundant Array of Independent Disks):**
     - Improves data reliability, availability, and performance by distributing or duplicating data across multiple disks.
     - **Uses:**
       - **RAID 0:** Data striping for performance.
       - **RAID 1:** Data mirroring for redundancy.
       - **RAID 5:** Data striping with parity for fault tolerance.

8. **Differentiate between static hashing and dynamic hashing.**

   - **Static Hashing:**
     - Fixed number of buckets.
     - Causes overflow if data exceeds bucket capacity.
     - Performance decreases with large datasets.
   - **Dynamic Hashing:**
     - Buckets grow and shrink dynamically based on the size of data.
     - Handles large data efficiently without overflow.

9. **State CAP Theorem.**

   - **CAP Theorem:** States that a distributed system cannot simultaneously achieve all three of the following:
     - **C (Consistency):** All nodes return the same data at the same time.
     - **A (Availability):** Every request receives a response.
     - **P (Partition Tolerance):** The system continues to operate despite network partition.

10. **What are various fragmentation types?**

    - **Horizontal Fragmentation:** Divides a table into subsets of rows.
      - Example: Split `Employee` table by department.
    - **Vertical Fragmentation:** Divides a table into subsets of columns.
      - Example: Split `Employee` table into `Employee_Basic` and `Employee_Contact`.
    - **Hybrid Fragmentation:** Combines horizontal and vertical fragmentation.
    - **Derived Fragmentation:** Fragments created based on a relationship with another table.

---

# 16 a)
Here are the SQL solutions for **part a** and a general ER model description for **part b** in the given relational database management system (RDBMS) scenario.

---

### Part a: Query Operations using SQL

#### Tables:
- **Degree**: `Degree(degcode, name, subject)`
- **Candidate**: `Candidate(seatno, degcode, semester, month, year, result)`
- **Marks**: `Marks(seatno, degcode, semester, month, year, papcode, marks)`

---

1. **(i) Write a SELECT statement to display all the degree codes which are there in the `Candidate` table but not present in the `Degree` table in the order of `degcode`.**

```sql
SELECT DISTINCT C.degcode
FROM Candidate C
WHERE C.degcode NOT IN (SELECT D.degcode FROM Degree D)
ORDER BY C.degcode;
```

---

2. **(ii) Write a SELECT statement to display the names of all candidates who have got less than 40 marks in exactly 2 subjects.**

```sql
SELECT C.name
FROM Candidate C
JOIN Marks M ON C.seatno = M.seatno
WHERE M.marks < 40
GROUP BY C.name
HAVING COUNT(M.papcode) = 2;
```

---

3. **(iii) Write a SELECT statement to display the name, subject, and number of candidates for all degrees in which there are less than 5 candidates.**

```sql
SELECT D.name, D.subject, COUNT(C.seatno) AS num_candidates
FROM Degree D
LEFT JOIN Candidate C ON D.degcode = C.degcode
GROUP BY D.name, D.subject
HAVING COUNT(C.seatno) < 5;
```

---

4. **(iv) Write a SELECT statement to display the names of all candidates who have got the highest total marks in MSc.,(Maths).**

```sql
SELECT C.name
FROM Candidate C
JOIN Marks M ON C.seatno = M.seatno
WHERE C.degcode = (SELECT degcode FROM Degree WHERE name = 'MSc' AND subject = 'Maths')
GROUP BY C.name
ORDER BY SUM(M.marks) DESC
LIMIT 1;
```

---

# 16 b)

### Part b: ER Model for Car Rental Company

**Entities and Attributes:**

1. **Vehicle** (General Entity)
   - `vehicle_id` (Primary Key)
   - `license_number`
   - `manufacturer`
   - `model`
   - `date_of_purchase`
   - `color`

2. **Specialized Entities** (Subtypes):
   - **Trucks**: `cargo_capacity`
   - **Sports Cars**: `horsepower`, `renter_age_requirement`
   - **Vans**: `number_of_passengers`
   - **Off-road Vehicles**: `ground_clearance`, `drivetrain` (four-wheel/two-wheel)

3. **Relationships**:
   - Vehicles are rented by **Customers**.
     - **Customer** Entity: `customer_id`, `name`, `contact_info`, `license_number`
     - Relationship: A vehicle can be rented by many customers (1:M).
   - Maintenance can be logged for vehicles.
     - **Maintenance** Entity: `maintenance_id`, `vehicle_id`, `date`, `details`, `cost`

**ER Model Representation:**
```
[Vehicle] 1---M [Customer]  (Rented By)
    |
    |--[Trucks]
    |--[Sports Cars]
    |--[Vans]
    |--[Off-road Vehicles]
    |
    |--[Maintenance]  (Logs maintenance details)
```

**Key Notes**:
- Use **inheritance** or specialization to differentiate between the vehicle types.
- Create relationships for rentals (`Rented By`) and maintenance logs (`Maintenance`).

---



