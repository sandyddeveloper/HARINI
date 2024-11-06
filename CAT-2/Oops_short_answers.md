Here are answers for each of the important questions for **Units 3 and 4**. 

---

### Unit 3: Exception Handling and Multi-Threading

1. **Basics of Exception Handling**
   - **Purpose**: Exception handling in Java is a mechanism to handle runtime errors, ensuring the normal flow of the application. Without handling, errors would disrupt program execution.
   - **try, catch, finally**:
     - **try**: Block of code that may throw an exception.
     - **catch**: Handles exceptions thrown by the try block.
     - **finally**: Executes after the try-catch, regardless of whether an exception occurred.
     - **Example**:
       ```java
       try {
           int result = 10 / 0; // ArithmeticException
       } catch (ArithmeticException e) {
           System.out.println("Cannot divide by zero.");
       } finally {
           System.out.println("End of try-catch block.");
       }
       ```

2. **Multiple Catch Clauses**
   - **Description**: Java allows multiple catch blocks to handle different types of exceptions separately.
   - **Example**:
     ```java
     try {
         int[] numbers = {1, 2, 3};
         System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Array index out of bounds.");
     } catch (ArithmeticException e) {
         System.out.println("Arithmetic exception occurred.");
     }
     ```

3. **Nested Try Statements**
   - **Explanation**: A `try` block within another `try` block is called a nested `try` block. It’s useful in handling complex scenarios where an exception in one block leads to another block that also needs exception handling.
   - **Example**:
     ```java
     try {
         try {
             int result = 10 / 0;
         } catch (ArithmeticException e) {
             System.out.println("Inner catch: Division by zero.");
         }
         int[] numbers = {1, 2};
         System.out.println(numbers[5]);
     } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Outer catch: Array index out of bounds.");
     }
     ```

4. **Java's Built-in Exceptions**
   - Common built-in exceptions include:
     - **NullPointerException**: Accessing an object with a `null` reference.
     - **ArrayIndexOutOfBoundsException**: Accessing an invalid index in an array.
     - **ArithmeticException**: Illegal arithmetic operation, such as division by zero.
     - **ClassCastException**: Invalid casting of one type to another.
     - **IllegalArgumentException**: Passing illegal arguments to a method.

5. **User-defined Exceptions**
   - **Creating a Custom Exception**: Custom exceptions are created by extending the `Exception` class.
   - **Example**:
     ```java
     class CustomException extends Exception {
         public CustomException(String message) {
             super(message);
         }
     }

     public class Test {
         public static void main(String[] args) {
             try {
                 throw new CustomException("Custom error message.");
             } catch (CustomException e) {
                 System.out.println("Caught custom exception: " + e.getMessage());
             }
         }
     }
     ```

6. **Java Thread Model**
   - **Explanation**: Java's thread model allows multiple threads of execution, enabling concurrent programming, which can make applications faster and more responsive.
   - **Purpose**: Threads allow the execution of multiple parts of a program simultaneously.

7. **Creating Threads**
   - Two main ways to create threads:
     - **Using `Thread` class**:
       ```java
       class MyThread extends Thread {
           public void run() {
               System.out.println("Thread is running.");
           }
       }

       public class Test {
           public static void main(String[] args) {
               MyThread t1 = new MyThread();
               t1.start();
           }
       }
       ```
     - **Using `Runnable` interface**:
       ```java
       class MyRunnable implements Runnable {
           public void run() {
               System.out.println("Runnable thread is running.");
           }
       }

       public class Test {
           public static void main(String[] args) {
               Thread t1 = new Thread(new MyRunnable());
               t1.start();
           }
       }
       ```

8. **Thread Priorities and Synchronization**
   - **Thread Priorities**: Each thread has a priority that determines the order in which threads are scheduled.
   - **Synchronization**: Synchronization prevents multiple threads from accessing a shared resource simultaneously, avoiding data inconsistency.
   - **Example**:
     ```java
     public synchronized void printNumbers() {
         for (int i = 1; i <= 5; i++) {
             System.out.println(i);
         }
     }
     ```

9. **Thread Communication**
   - **Explanation**: Inter-thread communication allows threads to communicate and coordinate.
   - **Methods**:
     - `wait()`: Makes a thread wait until another thread calls `notify()`.
     - `notify()`: Wakes up a single waiting thread.
     - `notifyAll()`: Wakes up all waiting threads.

---

### Unit 4: Generics, String Handling, and JavaFX

1. **Generics in Java**
   - **Purpose**: Generics allow classes, interfaces, and methods to operate on a specific type.
   - **Example** of a generic class:
     ```java
     class Box<T> {
         private T item;

         public void setItem(T item) {
             this.item = item;
         }

         public T getItem() {
             return item;
         }
     }
     ```

2. **Bounded Types in Generics**
   - **Explanation**: Bounded types restrict the types that can be used as generic parameters.
   - **Example**:
     ```java
     class NumberBox<T extends Number> {
         private T number;

         public void setNumber(T number) {
             this.number = number;
         }

         public T getNumber() {
             return number;
         }
     }
     ```

3. **String Handling**
   - **String Handling in Java**: Java provides `String`, `StringBuilder`, and `StringBuffer` classes for string manipulation.
   - **Differences**:
     - `String`: Immutable.
     - `StringBuilder`: Mutable and not thread-safe.
     - `StringBuffer`: Mutable and thread-safe.
   - **Example**:
     ```java
     StringBuilder sb = new StringBuilder("Hello");
     sb.append(" World");
     System.out.println(sb); // Output: Hello World
     ```

4. **JavaFX Event Handling**
   - **Explanation**: Event handling in JavaFX is managed by registering event handlers to respond to user actions.
   - **Example of handling a button click**:
     ```java
     Button btn = new Button("Click me");
     btn.setOnAction(e -> System.out.println("Button clicked!"));
     ```

5. **JavaFX Controls and Components**
   - **Common Controls**: JavaFX provides controls like `Button`, `Label`, `TextField`, and `ChoiceBox` to create UI elements.
   - **Example of a JavaFX application**:
     ```java
     import javafx.application.Application;
     import javafx.scene.Scene;
     import javafx.scene.control.Button;
     import javafx.scene.layout.StackPane;
     import javafx.stage.Stage;

     public class HelloWorld extends Application {
         @Override
         public void start(Stage primaryStage) {
             Button btn = new Button("Click me");
             btn.setOnAction(e -> System.out.println("Hello, JavaFX!"));

             StackPane root = new StackPane();
             root.getChildren().add(btn);

             Scene scene = new Scene(root, 300, 250);
             primaryStage.setTitle("JavaFX Example");
             primaryStage.setScene(scene);
             primaryStage.show();
         }

         public static void main(String[] args) {
             launch(args);
         }
     }
     ```

