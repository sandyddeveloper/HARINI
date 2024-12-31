

# Console Input and Output
```java
import java.util.Scanner;

public class ConsoleIOExample {

    public static void main(String[] args) {
        // Create a Scanner object for reading console input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        double decimal = scanner.nextDouble();

        // Display the collected inputs
        System.out.println("\n--- Output ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Decimal number: " + decimal);

        // Close the scanner
        scanner.close();
    }
}
```

### Explanation:

1. **Input via `Scanner`**:
   - `Scanner` reads input from `System.in` (the console).
   - Different methods of `Scanner` handle different types of input:
     - `nextLine()`: Reads a full line of text.
     - `nextInt()`: Reads an integer.
     - `nextDouble()`: Reads a decimal number.

2. **Output via `System.out`**:
   - `System.out.print`: Outputs text without a newline.
   - `System.out.println`: Outputs text followed by a newline.

3. **Closing the Scanner**:
   - Always close the `Scanner` object to release the associated resources.

###  Input and Output:
```
Enter your name: Alice
Enter your age: 25
Enter a decimal number: 3.14

--- Output ---
Name: Alice
Age: 25
Decimal number: 3.14
```

