
### Question 6
#### a. Discuss in detail about the methods to create a thread in Java.

In Java, threads are the smallest units of execution that allow for concurrent processing. Threads are created to perform multiple tasks simultaneously, which is essential for high-performance applications. Java offers two main methods to create threads:

1. **Extending the `Thread` Class**: To create a thread by extending the `Thread` class, you define a subclass that overrides the `run()` method. The `run()` method contains the code that will be executed by the thread. By calling the `start()` method, the JVM creates a new thread and executes `run()` asynchronously.

   ```java
   class MyThread extends Thread {
       public void run() {
           System.out.println("Thread is running...");
       }
   }

   public class Main {
       public static void main(String[] args) {
           MyThread thread = new MyThread();
           thread.start(); // Starts the thread
       }
   }
   ```

2. **Implementing the `Runnable` Interface**: Another approach to create a thread is by implementing the `Runnable` interface. You implement the `run()` method in a class, then pass an instance of this class to a `Thread` object. The `start()` method is called on the `Thread` instance, beginning execution.

   ```java
   class MyRunnable implements Runnable {
       public void run() {
           System.out.println("Thread is running...");
       }
   }

   public class Main {
       public static void main(String[] args) {
           Thread thread = new Thread(new MyRunnable());
           thread.start(); // Starts the thread
       }
   }
   ```

In general, implementing `Runnable` is preferred as it allows for better object-oriented design and multiple inheritance, unlike extending `Thread`.

---

#### b. Illustrate an outline of Java's multithreading system and outline the two ways to create a thread.

Java’s multithreading system allows multiple tasks to run concurrently. This is achieved through Java’s `java.lang.Thread` class and `Runnable` interface. A thread can be created either by extending the `Thread` class or by implementing the `Runnable` interface.

1. **Extending `Thread`**: When a class extends `Thread`, it must override the `run()` method. An instance of this class can then be created and started using the `start()` method.

   ```java
   class MyThread extends Thread {
       public void run() {
           System.out.println("Executing via Thread");
       }
   }
   ```

2. **Implementing `Runnable`**: When a class implements `Runnable`, it must provide an implementation for `run()`. An instance of `Thread` can then be created with the `Runnable` instance passed to its constructor.

   ```java
   class MyRunnable implements Runnable {
       public void run() {
           System.out.println("Executing via Runnable");
       }
   }
   ```

Each approach has advantages. Implementing `Runnable` allows for multiple inheritance, while extending `Thread` simplifies thread creation if no other inheritance is needed.

---

### Question 7
#### a. How would thread synchronization be managed in Java? Write example code.

Thread synchronization in Java is essential to prevent multiple threads from accessing shared resources simultaneously, which could lead to data inconsistencies. Java provides the `synchronized` keyword, which can be used to control access to code blocks or methods.

A `synchronized` method ensures that only one thread can access it at a time. Similarly, a `synchronized` block can lock specific parts of a code, allowing finer control over thread access.

Example:
```java
class Counter {
    private int count = 0;

    // synchronized method to increment count
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create two threads that increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
```

In this example, the `increment()` method is synchronized, which ensures only one thread can access it at a time, avoiding inconsistent results.

---

#### b. What is Java exception? Outline how Java exception handling is managed.

In Java, exceptions are unexpected events that disrupt the normal flow of a program. Exceptions are objects representing errors, like arithmetic errors, file-not-found issues, or null pointer errors. Java provides a structured approach to handle exceptions using `try`, `catch`, `finally`, and `throw`.

- `try` block: Contains code that may cause an exception.
- `catch` block: Handles specific types of exceptions.
- `finally` block: Executes regardless of exceptions, often used for cleanup.
- `throw` statement: Allows explicit throwing of exceptions.

Example:
```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will cause ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            System.out.println("This block always runs.");
        }
    }
}
```

In this example, dividing by zero raises an `ArithmeticException`, which is caught and handled by the `catch` block. The `finally` block runs after, ensuring proper cleanup.

---

### Question 8
#### a. Write in detail about the restrictions and limitations of using generics in Java Programming.

Generics in Java allow for type safety by letting classes, interfaces, and methods operate on user-defined types. However, there are notable restrictions and limitations to generics:

1. **Type Erasure**: Generic type information is erased at runtime, so you cannot determine the actual type parameter at runtime. This limits certain operations, such as checking an object’s type or instantiating a generic type.

2. **Cannot Use Primitive Types**: Generics only work with reference types. To use primitives, you must use wrapper classes (e.g., `Integer` instead of `int`), which can add a performance overhead.

3. **Cannot Create Instances of Generic Types**: Since Java erases generic types at runtime, creating instances of generic types is prohibited (e.g., `T obj = new T()` is invalid).

4. **Static Context Limitation**: Static fields or methods cannot use generic types as they are class-level constructs and generics are meant for instance-specific information.

---

#### b. Apply the String handling function to do the following operations:
   - **i) Compare two strings**
   - **ii) Reverse the String "Happy"**

Example:
```java
public class Main {
    public static void main(String[] args) {
        // i) Compare two strings
        String str1 = "Hello";
        String str2 = "Hello";
        System.out.println("Are strings equal? " + str1.equals(str2));

        // ii) Reverse the String "Happy"
        String original = "Happy";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("Reversed String: " + reversed);
    }
}
```

In this example:
- The `equals()` method is used to compare two strings for equality, which returns `true` if they contain the same characters.
- `StringBuilder`'s `reverse()` method efficiently reverses the string "Happy".

---

### Question 9
#### a. What is `StringBuffer`? Name and outline the constructors defined by `StringBuffer` with code fragments.

`StringBuffer` in Java is a mutable sequence of characters, allowing modifications like appending, deleting, or inserting characters without creating a new object each time, unlike `String`. This makes `StringBuffer` efficient for scenarios where strings need frequent modification. It is synchronized, making it thread-safe.

Constructors:
1. **`StringBuffer()`**: Creates an empty `StringBuffer` with an initial capacity of 16 characters.
   ```java
   StringBuffer sb1 = new StringBuffer();
   ```

2. **`StringBuffer(int capacity)`**: Creates a `StringBuffer` with a specified initial capacity.
   ```java
   StringBuffer sb2 = new StringBuffer(50);
   ```

3. **`StringBuffer(String str)`**: Initializes `StringBuffer` with the specified string.
   ```java
   StringBuffer sb3 = new StringBuffer("Hello");
   ```

---

#### b. Write in detail about the different methods of generic type.

Generic methods provide flexibility by allowing the programmer to define methods that work with any data type. This is particularly useful for classes or methods that operate on collections or data structures without needing to specify a specific type.

Example:
```java
public class Main {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] strArray = {"A", "B", "C"};
        
        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(str

Array);
    }
}
```

In this example, the `<T>` parameter before the `void` return type defines a generic method. The `printArray()` method can work with any array type, such as `Integer[]` or `String[]`, demonstrating the flexibility of generics.
