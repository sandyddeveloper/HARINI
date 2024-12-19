### **Question 1: Bank Database**

**a) Create a Bank Database Table with Constraints**  
Hint: Use `PRIMARY KEY`, `CHECK`, and `NOT NULL` constraints in the table.

```sql
-- Create a table for the bank database
CREATE TABLE Bank (
    Account_No INT PRIMARY KEY,
    Customer_Name VARCHAR(100) NOT NULL,
    Balance DECIMAL(10, 2) CHECK (Balance >= 0),
    Account_Type VARCHAR(20) CHECK (Account_Type IN ('Savings', 'Current'))
);

-- Insert rows
INSERT INTO Bank VALUES (101, 'Alice', 150000.00, 'Savings');
INSERT INTO Bank VALUES (102, 'Bob', 250000.00, 'Current');

-- Update a record
UPDATE Bank
SET Balance = Balance + 50000
WHERE Account_No = 101;

-- Delete a record
DELETE FROM Bank
WHERE Account_No = 102;
```

---

**b) PL/SQL Program to Retrieve Depositors with Balance Above 10 Lakhs**  
Hint: Use the `WHERE` and `HAVING` clauses.

```sql
DECLARE
    CURSOR high_balance_cursor IS
        SELECT Customer_Name, Balance
        FROM Bank
        WHERE Balance > 1000000;

BEGIN
    FOR record IN high_balance_cursor LOOP
        DBMS_OUTPUT.PUT_LINE('Customer: ' || record.Customer_Name || ', Balance: ' || record.Balance);
    END LOOP;
END;
```

---

### **Question 2: Cargo Service Database**

**a) Create Tables with Referential Integrity**  
Hint: Use `FOREIGN KEY` to establish relationships.

```sql
-- Create tables
CREATE TABLE Cargo (
    Cargo_ID INT PRIMARY KEY,
    Cargo_Name VARCHAR(100),
    Weight DECIMAL(10, 2)
);

CREATE TABLE Booking (
    Booking_ID INT PRIMARY KEY,
    Cargo_ID INT,
    Booking_Date DATE,
    FOREIGN KEY (Cargo_ID) REFERENCES Cargo(Cargo_ID)
);

-- Insert data
INSERT INTO Cargo VALUES (1, 'Electronics', 500.50);
INSERT INTO Booking VALUES (101, 1, '2024-12-01');
```

---

**b) Create Triggers for Cargo Booking and Cancellation**  
Hint: Use triggers to log booking and cancellation events.

```sql
-- Trigger for cargo booking
CREATE OR REPLACE TRIGGER BookingTrigger
AFTER INSERT ON Booking
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Cargo booked: ID ' || :NEW.Booking_ID);
END;

-- Trigger for cargo cancellation
CREATE OR REPLACE TRIGGER CancellationTrigger
AFTER DELETE ON Booking
FOR EACH ROW
BEGIN
    DBMS_OUTPUT.PUT_LINE('Cargo booking canceled: ID ' || :OLD.Booking_ID);
END;
```

---

### **Question 3: Library Management System**

**a) Query to Retrieve Books on "Distributed Database"**  
Hint: Use the `WHERE` clause to filter by subject.

```sql
-- Query books with subject "Distributed Database"
SELECT * 
FROM Books
WHERE Subject = 'Distributed Database';
```

---

**b) Procedure to Insert Book Details After Purchase**  
Hint: Write a procedure to automate insertion.

```sql
CREATE PROCEDURE InsertBook (
    IN BookID INT, 
    IN Title VARCHAR(100), 
    IN Author VARCHAR(100), 
    IN Subject VARCHAR(50)
)
BEGIN
    INSERT INTO Books (Book_ID, Title, Author, Subject)
    VALUES (BookID, Title, Author, Subject);
END;
```

---

### **Question 4: Product, Sales, and Purchase Tables**

**a) Create Tables Using DDL Commands**  
Hint: Use `CREATE TABLE` for defining structure.

```sql
-- Create Product table
CREATE TABLE Product (
    Product_ID INT PRIMARY KEY,
    Product_Name VARCHAR(100),
    Price DECIMAL(10, 2)
);

-- Create Sales table
CREATE TABLE Sales (
    Sale_ID INT PRIMARY KEY,
    Product_ID INT,
    Sale_Amount DECIMAL(10, 2),
    FOREIGN KEY (Product_ID) REFERENCES Product(Product_ID)
);

-- Create Purchase table
CREATE TABLE Purchase (
    Purchase_ID INT PRIMARY KEY,
    Product_ID INT,
    Purchase_Amount DECIMAL(10, 2),
    FOREIGN KEY (Product_ID) REFERENCES Product(Product_ID)
);
```

---

**b) Procedure to Add 20 Records to Each Table**  
Hint: Use loops to insert multiple records.

```sql
CREATE PROCEDURE AddRecords()
BEGIN
    DECLARE i INT DEFAULT 1;

    WHILE i <= 20 DO
        INSERT INTO Product (Product_ID, Product_Name, Price) VALUES (i, CONCAT('Product', i), i * 10);
        INSERT INTO Sales (Sale_ID, Product_ID, Sale_Amount) VALUES (i, i, i * 100);
        INSERT INTO Purchase (Purchase_ID, Product_ID, Purchase_Amount) VALUES (i, i, i * 50);
        SET i = i + 1;
    END WHILE;
END;
```

---

### **Question 5: Employee, Salary, and Department Tables**

**a) Create Tables and Determine Salary Metrics**  
Hint: Use aggregate functions like `MIN`, `MAX`, `AVG`, and `SUM`.

```sql
-- Create Employee_Personal table
CREATE TABLE Employee_Personal (
    Employee_ID INT PRIMARY KEY,
    Name VARCHAR(100),
    Department_ID INT
);

-- Create Salary table
CREATE TABLE Salary (
    Employee_ID INT PRIMARY KEY,
    Basic_Salary DECIMAL(10, 2),
    Incentives DECIMAL(10, 2),
    FOREIGN KEY (Employee_ID) REFERENCES Employee_Personal(Employee_ID)
);

-- Create Department table
CREATE TABLE Department (
    Department_ID INT PRIMARY KEY,
    Department_Name VARCHAR(100)
);

-- Calculate metrics
SELECT 
    MIN(Basic_Salary) AS MinSalary,
    MAX(Basic_Salary) AS MaxSalary,
    AVG(Basic_Salary) AS AvgSalary,
    SUM(Basic_Salary) AS TotalSalary
FROM Salary;
```

---

**b) User-Defined Function to Update Salary with Incentives**  
Hint: Use `CREATE FUNCTION` to define the operation.

```sql
CREATE FUNCTION UpdateSalary (EmpID INT)
RETURNS DECIMAL(10, 2)
DETERMINISTIC
BEGIN
    DECLARE NewSalary DECIMAL(10, 2);
    SELECT Basic_Salary + Incentives INTO NewSalary
    FROM Salary
    WHERE Employee_ID = EmpID;
    RETURN NewSalary;
END;
``` 
---

**Question 6: Online Purchase Database**

a) **DDL and DML Commands**  
Hint: DDL (Data Definition Language) commands define the database structure, while DML (Data Manipulation Language) commands manipulate the data.  

```sql
-- Create the online purchase database
CREATE TABLE Items (
    Item_ID INT PRIMARY KEY,
    Item_Name VARCHAR(100),
    Price DECIMAL(10, 2),
    Stock INT
);

-- Insert sample data
INSERT INTO Items (Item_ID, Item_Name, Price, Stock) VALUES
(1, 'Laptop', 1000.00, 10),
(2, 'Phone', 500.00, 20),
(3, 'Tablet', 300.00, 15);

-- Display purchased items using subquery
SELECT Item_ID, Item_Name, Price
FROM Items
WHERE Item_ID IN (SELECT DISTINCT Item_ID FROM Purchase);
```

b) **PL/SQL Triggers**  
Hint: Use triggers to execute actions automatically after events like INSERT, UPDATE, or DELETE.

```sql
-- Trigger to show available items after a purchase
CREATE OR REPLACE TRIGGER AfterPurchase
AFTER INSERT ON Purchase
FOR EACH ROW
BEGIN
    UPDATE Items
    SET Stock = Stock - 1
    WHERE Item_ID = :NEW.Item_ID;

    DBMS_OUTPUT.PUT_LINE('Available items after purchase:');
    SELECT * FROM Items;
END;
```

---

**Question 7: Omni Bus Reservation**

a) **DDL and DML Commands with Join**  
Hint: Use JOIN operations to combine data from multiple tables.

```sql
-- Create tables for Omni bus reservation
CREATE TABLE Buses (
    Bus_ID INT PRIMARY KEY,
    Bus_Name VARCHAR(100),
    Seats INT
);

CREATE TABLE Reservations (
    Reservation_ID INT PRIMARY KEY,
    Bus_ID INT,
    Passenger_Name VARCHAR(100),
    FOREIGN KEY (Bus_ID) REFERENCES Buses(Bus_ID)
);

-- Insert data
INSERT INTO Buses VALUES (1, 'Volvo', 50), (2, 'Mercedes', 40);
INSERT INTO Reservations VALUES (1, 1, 'Alice'), (2, 2, 'Bob');

-- Join operation to display reservations with bus details
SELECT Reservations.Reservation_ID, Passenger_Name, Bus_Name
FROM Reservations
JOIN Buses ON Reservations.Bus_ID = Buses.Bus_ID;
```

b) **Procedure for Booking Reduction**  
Hint: Procedures are reusable SQL blocks.

```sql
CREATE PROCEDURE ReduceBooking (BusID INT)
BEGIN
    UPDATE Buses
    SET Seats = Seats - 1
    WHERE Bus_ID = BusID;

    SELECT * FROM Buses;
END;
```

### **Question 8: Scooter Manufacturing Database**

a) **Create a Database and Use the HAVING Clause**  
Hint: Use the HAVING clause to filter grouped data after aggregation.

```sql
-- Create a table for scooters
CREATE TABLE Scooters (
    Model_ID INT PRIMARY KEY,
    Model_Name VARCHAR(100),
    Price DECIMAL(10, 2)
);

-- Insert data
INSERT INTO Scooters VALUES 
(1, 'Scooty', 50000.00),
(2, 'Activa', 70000.00),
(3, 'Vespa', 85000.00);

-- Use HAVING clause to display models based on price
SELECT Model_Name, Price
FROM Scooters
GROUP BY Model_Name, Price
HAVING Price > 60000;
```

---

b) **Procedure to Insert and Update Records**  
Hint: Write a procedure for inserting new data and updating the existing data.

```sql
CREATE PROCEDURE InsertOrUpdateScooter (
    IN ModelID INT, 
    IN ModelName VARCHAR(100), 
    IN ModelPrice DECIMAL(10, 2)
)
BEGIN
    IF EXISTS (SELECT * FROM Scooters WHERE Model_ID = ModelID) THEN
        UPDATE Scooters
        SET Model_Name = ModelName, Price = ModelPrice
        WHERE Model_ID = ModelID;
    ELSE
        INSERT INTO Scooters (Model_ID, Model_Name, Price)
        VALUES (ModelID, ModelName, ModelPrice);
    END IF;
END;
```

---

### **Question 9: Flight and Passenger Tables**

a) **Create and Insert Records; Use JOIN Operations**  
Hint: Use JOIN operations to combine the flight and passenger data.

```sql
-- Create tables
CREATE TABLE Flights (
    Flight_ID INT PRIMARY KEY,
    Flight_Name VARCHAR(100),
    Destination VARCHAR(100)
);

CREATE TABLE Passengers (
    Passenger_ID INT PRIMARY KEY,
    Passenger_Name VARCHAR(100),
    Flight_ID INT,
    FOREIGN KEY (Flight_ID) REFERENCES Flights(Flight_ID)
);

-- Insert data
INSERT INTO Flights VALUES (1, 'Indigo', 'New York'), (2, 'Air India', 'London');
INSERT INTO Passengers VALUES (1, 'John', 1), (2, 'Sarah', 2);

-- Join operation to display flight and passenger details
SELECT Passengers.Passenger_Name, Flights.Flight_Name, Flights.Destination
FROM Passengers
JOIN Flights ON Passengers.Flight_ID = Flights.Flight_ID;
```

---

b) **Procedure to Display Month Name from Number**  
Hint: Use a CASE statement to map numbers to month names.

```sql
CREATE PROCEDURE DisplayMonth (IN MonthNum INT)
BEGIN
    SELECT CASE
        WHEN MonthNum = 1 THEN 'January'
        WHEN MonthNum = 2 THEN 'February'
        WHEN MonthNum = 3 THEN 'March'
        -- Add remaining months...
        ELSE 'Invalid Month'
    END AS MonthName;
END;
```

---

### **Question 10: Salesman, Customer, and Orders Tables**

a) **Find Salesmen with More Than One Customer**  
Hint: Use the `GROUP BY` clause and `HAVING` for aggregation.

```sql
SELECT Salesman_ID, COUNT(Customer_ID) AS CustomerCount
FROM CUSTOMER
GROUP BY Salesman_ID
HAVING COUNT(Customer_ID) > 1;
```

---

b) **List Salesmen with and Without Customers Using UNION**  
Hint: Use a `LEFT JOIN` for salesmen without customers and `UNION` for both sets.

```sql
-- Salesmen with customers
SELECT Salesman_ID, Name
FROM SALESMAN
WHERE Salesman_ID IN (SELECT DISTINCT Salesman_ID FROM CUSTOMER)

UNION

-- Salesmen without customers
SELECT Salesman_ID, Name
FROM SALESMAN
WHERE Salesman_ID NOT IN (SELECT DISTINCT Salesman_ID FROM CUSTOMER);
```

---

c) **View Salesman with the Highest Order Value in a Day**  
Hint: Use `MAX` and a `GROUP BY` query.

```sql
SELECT Salesman_ID, MAX(Purchase_Amt) AS HighestOrder
FROM ORDERS
GROUP BY Salesman_ID
ORDER BY HighestOrder DESC
LIMIT 1;
```

---

d) **Delete a Salesman and Cascade Orders**  
Hint: Use `ON DELETE CASCADE` for the foreign key in the `ORDERS` table.

```sql
-- Delete operation
DELETE FROM SALESMAN
WHERE Salesman_ID = 1000;
```

---

e) **Demonstrate Triggers for Above Table**  
Hint: Create a trigger for actions like DELETE to log information.

```sql
CREATE OR REPLACE TRIGGER LogDeleteSalesman
AFTER DELETE ON SALESMAN
FOR EACH ROW
BEGIN
    INSERT INTO LogTable (Action, Salesman_ID, Timestamp)
    VALUES ('DELETE', :OLD.Salesman_ID, NOW());
END;
```

---
