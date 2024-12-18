Linear inset program

### Program
```java
import java.util.Scanner;

public class LinearSearchInsert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = {10, 20, 30, 40, 50};
        int size = 5;

        // Linear search
        System.out.print("Enter element to search: ");
        int searchElement = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < size; i++) {
            if (array[i] == searchElement) {
                found = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }
        if (!found) System.out.println("Element not found.");

        // Insert at the end
        System.out.print("Enter element to insert: ");
        int newElement = scanner.nextInt();
        if (size < array.length) array[size++] = newElement;

        // Print updated array
        System.out.print("Updated array: ");
        for (int i = 0; i < size; i++) System.out.print(array[i] + " ");
    }
}
```



### Output:
```
Enter element to search: 30
Element found at index 2
Enter element to insert: 60
Updated array: 10 20 30 40 50 60
``` 

