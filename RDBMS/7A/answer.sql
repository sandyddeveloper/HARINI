-- Create the students table
CREATE TABLE students (
    student_id INT PRIMARY KEY,     -- Unique identifier for each student
    name VARCHAR(100),              -- Student name
    dob DATE,                       -- Date of Birth
    branch VARCHAR(50),             -- Student's branch/field of study
    date_of_join DATE               -- Date of joining the institution
);

-- Create the course_details table
CREATE TABLE course_details (
    course_id INT PRIMARY KEY,      -- Unique identifier for each course
    cname VARCHAR(100),             -- Course name
    student_id INT,                 -- Foreign key referencing student_id
    faculty_name VARCHAR(100),      -- Name of the faculty teaching the course
    faculty_id INT,                 -- Unique identifier for faculty
    marks INT,                      -- Marks obtained by the student in the course
    FOREIGN KEY (student_id) REFERENCES students(student_id) -- Establishing a foreign key relation
);


-- Insert data into students table
INSERT INTO students (student_id, name, dob, branch, date_of_join)
VALUES (1, 'Alice', '2001-05-20', 'Computer Science', '2019-08-15');

INSERT INTO students (student_id, name, dob, branch, date_of_join)
VALUES (2, 'Bob', '2000-12-12', 'Electrical Engineering', '2018-07-10');

INSERT INTO students (student_id, name, dob, branch, date_of_join)
VALUES (3, 'Charlie', '2002-01-11', 'Mechanical Engineering', '2020-09-01');

-- Insert data into course_details table
INSERT INTO course_details (course_id, cname, student_id, faculty_name, faculty_id, marks)
VALUES (101, 'Database Systems', 1, 'Dr. Smith', 501, 85);

INSERT INTO course_details (course_id, cname, student_id, faculty_name, faculty_id, marks)
VALUES (102, 'Data Structures', 2, 'Dr. Johnson', 502, 78);

INSERT INTO course_details (course_id, cname, student_id, faculty_name, faculty_id, marks)
VALUES (103, 'RDBMS', 3, 'Dr. Patel', 503, 90);

-- Update the branch of a student
UPDATE students
SET branch = 'Information Technology'
WHERE student_id = 1;


-- Delete a course from course_details table
DELETE FROM course_details
WHERE course_id = 102;

-- Retrieve all students
SELECT * FROM students;

-- Retrieve all course details along with student names (joining both tables)
SELECT c.course_id, c.cname, s.name, c.faculty_name, c.marks
FROM course_details c
JOIN students s ON c.student_id = s.student_id;

-- Retrieve details of a specific student by ID
SELECT * FROM students WHERE student_id = 1;

-- Retrieve courses and marks for a specific student
SELECT cname, marks FROM course_details WHERE student_id = 1;

-- Retrieve student names, courses, and faculty names
SELECT s.name, c.cname, c.faculty_name, c.marks
FROM students s
JOIN course_details c ON s.student_id = c.student_id;


