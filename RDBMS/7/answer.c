#include <stdio.h>
#include <sqlca.h>  // SQL communication area

// Embedded SQL function to connect to the database
EXEC SQL INCLUDE SQLCA;

void connect_to_db() {
    EXEC SQL CONNECT TO :database_name USER :username IDENTIFIED BY :password;
    if (sqlca.sqlcode != 0) {
        printf("Failed to connect to the database.\n");
    } else {
        printf("Successfully connected to the database.\n");
    }
}

// Function to insert a new student into the database
void insert_student(int student_id, char *name, int age, char *department) {
    EXEC SQL INSERT INTO students (student_id, name, age, department)
        VALUES (:student_id, :name, :age, :department);
    if (sqlca.sqlcode != 0) {
        printf("Error inserting student record.\n");
    } else {
        printf("Student inserted successfully.\n");
    }
}

// Function to update a student’s data
void update_student(int student_id, char *name) {
    EXEC SQL UPDATE students SET name = :name WHERE student_id = :student_id;
    if (sqlca.sqlcode != 0) {
        printf("Error updating student record.\n");
    } else {
        printf("Student updated successfully.\n");
    }
}

// Function to delete a student’s data
void delete_student(int student_id) {
    EXEC SQL DELETE FROM students WHERE student_id = :student_id;
    if (sqlca.sqlcode != 0) {
        printf("Error deleting student record.\n");
    } else {
        printf("Student deleted successfully.\n");
    }
}

// Function to select and display student data
void select_student(int student_id) {
    char name[100], department[100];
    int age;

    EXEC SQL SELECT name, age, department INTO :name, :age, :department 
        FROM students WHERE student_id = :student_id;

    if (sqlca.sqlcode != 0) {
        printf("Error retrieving student data.\n");
    } else {
        printf("Student ID: %d\nName: %s\nAge: %d\nDepartment: %s\n", student_id, name, age, department);
    }
}

int main() {
    int choice, student_id, age;
    char name[100], department[100];

    // Call the connect_to_db function to connect to the database
    connect_to_db();

    while (1) {
        printf("1. Insert Student\n");
        printf("2. Update Student\n");
        printf("3. Delete Student\n");
        printf("4. View Student\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                printf("Enter Student ID: ");
                scanf("%d", &student_id);
                printf("Enter Student Name: ");
                scanf("%s", name);
                printf("Enter Age: ");
                scanf("%d", &age);
                printf("Enter Department: ");
                scanf("%s", department);
                insert_student(student_id, name, age, department);
                break;

            case 2:
                printf("Enter Student ID: ");
                scanf("%d", &student_id);
                printf("Enter New Name: ");
                scanf("%s", name);
                update_student(student_id, name);
                break;

            case 3:
                printf("Enter Student ID to delete: ");
                scanf("%d", &student_id);
                delete_student(student_id);
                break;

            case 4:
                printf("Enter Student ID to view: ");
                scanf("%d", &student_id);
                select_student(student_id);
                break;

            case 5:
                printf("Exiting...\n");
                return 0;

            default:
                printf("Invalid choice.\n");
        }
    }

    return 0;
}
