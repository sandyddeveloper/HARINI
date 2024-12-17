

## **Java Program**

```java
import java.util.Arrays; // Import for sorting
import java.util.Scanner; // Import for input

// Class to handle name operations
class NameSorter {
    private String[] names; // Array to store names
    private int n; // Number of names

    // Method to accept names
    public void acceptNames() {
        Scanner scanner = new Scanner(System.in);
        
        // Accept the number of names
        System.out.print("Enter the number of names: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        names = new String[n]; // Initialize the array
        
        // Accept each name
        System.out.println("Enter the names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
    }

    // Method to sort names alphabetically
    public void sortNames() {
        Arrays.sort(names); // Sort the array alphabetically
    }

    // Method to display names
    public void displayNames() {
        System.out.println("\nSorted Names in Alphabetical Order:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
    }
}

public class AlphabeticalNameSort {
    public static void main(String[] args) {
        // Create an object of NameSorter
        NameSorter sorter = new NameSorter();
        
        // Step 1: Accept names
        sorter.acceptNames();
        
        // Step 2: Sort names
        sorter.sortNames();
        
        // Step 3: Display sorted names
        sorter.displayNames();
    }
}
```

---

### **Input**:
```
Enter the number of names: 5
Enter the names:
Name 1: John
Name 2: Alice
Name 3: David
Name 4: Bob
Name 5: Clara
```

### **Output**:
```
Sorted Names in Alphabetical Order:
1. Alice
2. Bob
3. Clara
4. David
5. John
```

---

## **Explanation of Code**

1. **`acceptNames()` Method**:
   - Uses a `Scanner` to accept the number of names and each name from the user.  
   - Names are stored in a `String` array.

2. **`sortNames()` Method**:
   - Uses the `Arrays.sort()` method, which sorts the array alphabetically in ascending order.

3. **`displayNames()` Method**:
   - Prints the sorted names in a clean, numbered format.

4. **Main Method**:
   - Creates an instance of the `NameSorter` class.  
   - Calls the methods **`acceptNames()`**, **`sortNames()`**, and **`displayNames()`** in sequence.

