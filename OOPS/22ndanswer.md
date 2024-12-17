
## **Java Program**

```java
import java.util.Scanner;

// Class to handle Matrix operations
class MatrixOperations {
    private int[][] matrix1; // First matrix
    private int[][] matrix2; // Second matrix
    private int[][] resultMatrix; // Resultant matrix
    private int size; // Size of the square matrices

    // Method to accept a matrix
    public void acceptMatrices() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the square matrices (n x n): ");
        size = scanner.nextInt();

        // Initialize the matrices
        matrix1 = new int[size][size];
        matrix2 = new int[size][size];
        resultMatrix = new int[size][size];

        // Accept elements for the first matrix
        System.out.println("\nEnter elements of the first matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Matrix1[" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Accept elements for the second matrix
        System.out.println("\nEnter elements of the second matrix:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Matrix2[" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to add two matrices
    public void addMatrices() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    // Method to display a matrix
    public void displayMatrix(int[][] matrix, String matrixName) {
        System.out.println("\n" + matrixName + ":");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to display all matrices
    public void displayResult() {
        // Display the input matrices
        displayMatrix(matrix1, "First Matrix");
        displayMatrix(matrix2, "Second Matrix");

        // Display the resultant matrix
        displayMatrix(resultMatrix, "Resultant Matrix (Sum)");
    }
}

public class MatrixAddition {
    public static void main(String[] args) {
        // Create an object of MatrixOperations
        MatrixOperations matrixOps = new MatrixOperations();

        // Step 1: Accept matrices
        matrixOps.acceptMatrices();

        // Step 2: Add matrices
        matrixOps.addMatrices();

        // Step 3: Display matrices
        matrixOps.displayResult();
    }
}
```

---

## **Program Flow**

1. **Input**:  
   - The user enters the size `n` of the square matrices.  
   - The user enters the elements of two matrices.

2. **Matrix Addition**:  
   - Each corresponding element from the two matrices is added.

3. **Output**:  
   - The program displays:  
     - The first matrix.  
     - The second matrix.  
     - The resulting matrix after addition.

---

## **Sample Input/Output**

### **Input**:
```
Enter the size of the square matrices (n x n): 2

Enter elements of the first matrix:
Matrix1[0][0]: 1
Matrix1[0][1]: 2
Matrix1[1][0]: 3
Matrix1[1][1]: 4

Enter elements of the second matrix:
Matrix2[0][0]: 5
Matrix2[0][1]: 6
Matrix2[1][0]: 7
Matrix2[1][1]: 8
```

### **Output**:
```
First Matrix:
1    2
3    4

Second Matrix:
5    6
7    8

Resultant Matrix (Sum):
6    8
10   12
```

---

