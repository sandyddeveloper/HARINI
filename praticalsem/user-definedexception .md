
```java
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }
}
```

### Explanation:
1. **`InvalidAgeException`**: A custom exception class extending `Exception`. It includes a constructor to pass a custom error message.
2. **`checkAge` Method**: Throws an `InvalidAgeException` if the `age` is less than 18.
3. **`try-catch` Block**: Handles the custom exception and prints the message. 

