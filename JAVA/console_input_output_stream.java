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
---
  ```java
# OUTPUT
  
  ```
