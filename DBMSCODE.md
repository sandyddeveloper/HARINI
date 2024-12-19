
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
