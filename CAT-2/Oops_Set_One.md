### Question 6
#### a. Illustrate an outline of exception handling with five keywords.

Exception handling in Java is a mechanism to handle runtime errors, allowing the program to continue execution. Java provides five main keywords for exception handling:

1. **try**: The block of code that might throw an exception.
2. **catch**: Used to handle the exception if it occurs in the `try` block.
3. **finally**: A block that executes after the `try-catch`, regardless of whether an exception occurred or not.
4. **throw**: Allows the program to throw an exception explicitly.
5. **throws**: Declares exceptions that a method can throw.

Example:
```java
public class ExceptionExample {
    public static void main(String[] args) {
        try {
            int division = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("Execution of finally block.");
        }
    }
}
```

In this example, `try` contains code that may cause an exception. `catch` handles the exception, and `finally` executes regardless of whether the exception occurred.

---

#### b. Discuss in detail about exception types and its hierarchy.

Java exceptions are organized in a hierarchy. At the top is the `Throwable` class, which branches into two subclasses:

1. **Error**: Represents serious issues that applications should not attempt to handle, such as `OutOfMemoryError`.
2. **Exception**: Represents conditions that applications might want to catch. It has two main types:
   - **Checked Exception**: These are checked at compile-time, such as `IOException` and `SQLException`.
   - **Unchecked Exception**: These occur at runtime, such as `ArithmeticException` and `NullPointerException`.

Hierarchy:
- `Throwable`
  - `Error`
  - `Exception`
    - `RuntimeException`
    - Other Checked Exceptions

Example:
```java
public class ExceptionHierarchyExample {
    public static void main(String[] args) {
        try {
            int[] arr = new int[2];
            arr[5] = 10; // This will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds.");
        }
    }
}
```

In this example, an `ArrayIndexOutOfBoundsException` (a type of `RuntimeException`) is thrown, demonstrating the hierarchy of exceptions.

---

### Question 7
#### a. Discuss in detail about multithreading.

Multithreading in Java allows multiple threads to execute simultaneously, enhancing the performance of applications, especially on multicore systems. Each thread runs independently, enabling tasks to execute concurrently. Java provides built-in support for multithreading through the `java.lang.Thread` class and `Runnable` interface.

Java multithreading can be implemented by:
1. **Extending the Thread class**: By overriding the `run()` method in a subclass of `Thread`.
2. **Implementing the Runnable interface**: By implementing `run()` in a class that implements `Runnable`.

Example:
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start(); // Starts the new thread
    }
}
```

This example shows a thread running concurrently by extending the `Thread` class.

---

#### b. Illustrate about inter-thread communication.

Inter-thread communication in Java allows threads to coordinate with each other. Java provides methods like `wait()`, `notify()`, and `notifyAll()` for this purpose. These methods are used within synchronized contexts and allow a thread to pause execution (`wait()`) until another thread notifies it (`notify()` or `notifyAll()`).

Example:
```java
class InterThreadCommunication {
    synchronized void waitForNotification() throws InterruptedException {
        System.out.println("Waiting...");
        wait();
        System.out.println("Notified and resumed.");
    }

    synchronized void sendNotification() {
        System.out.println("Sending notification...");
        notify();
    }
}

public class Main {
    public static void main(String[] args) {
        InterThreadCommunication obj = new InterThreadCommunication();

        Thread t1 = new Thread(() -> {
            try {
                obj.waitForNotification();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> obj.sendNotification());

        t1.start();
        t2.start();
    }
}
```

In this example, `waitForNotification` waits until `sendNotification` is called, demonstrating inter-thread communication.

---

### Question 8
#### a. Write in detail about reading and writing files.

In Java, reading and writing files is handled using the `FileReader` and `FileWriter` classes (for character streams) or `FileInputStream` and `FileOutputStream` classes (for byte streams). These classes help manage file I/O operations for text and binary data.

Example of Writing:
```java
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteExample {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt")) {
            writer.write("Hello, World!");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

Example of Reading:
```java
import java.io.FileReader;
import java.io.IOException;

public class FileReadExample {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("example.txt")) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

These examples demonstrate reading from and writing to a file.

---

#### b. Justify in detail about String methods.

Java's `String` class provides many useful methods for manipulating strings. Important methods include:

1. **`length()`**: Returns the length of the string.
2. **`charAt(int index)`**: Returns the character at the specified index.
3. **`substring(int beginIndex, int endIndex)`**: Returns a substring from beginIndex to endIndex.
4. **`equals(Object obj)`**: Checks if two strings are equal.
5. **`toUpperCase()` / `toLowerCase()`**: Converts the string to uppercase or lowercase.

Example:
```java
public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "Hello, Java!";

        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));
        System.out.println("Substring: " + str.substring(0, 5));
        System.out.println("Uppercase: " + str.toUpperCase());
    }
}
```

In this example, various `String` methods are used to manipulate and retrieve information about the string.

---

### Question 9
#### a. Write in detail about reading and writing console I/O.

Java provides classes for console I/O through `System.in` and `System.out`. `System.in` is used for input, typically with `Scanner` to read user input, while `System.out` is used for output, typically with `println()`.

Example:
```java
import java.util.Scanner;

public class ConsoleIOExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.println("Hello, " + name + "!");
    }
}
```

This example reads a name from the console and outputs a greeting message. `System.in` and `System.out` make console interaction straightforward in Java.

---

#### b. Write in detail about generic classes.

Generics in Java allow classes and methods to operate on specified types, promoting code reusability and type safety. A generic class can be defined by adding a type parameter (e.g., `<T>`) to the class definition.

Example:
```java
class GenericBox<T> {
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>();
        stringBox.setContent("Hello, Generics!");
        System.out.println("Content: " + stringBox.getContent());
    }
}
```

In this example, `GenericBox<T>` can hold any type, specified at instantiation. This flexibility allows the same class to work with different types without code duplication.
