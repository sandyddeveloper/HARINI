

## **Why Parameterized Types are Important?**

Parameterized types allow us to write code that works with **different data types** while ensuring **type safety**. Java uses **Generics** to implement parameterized types.

### **Why are they important?**
1. **Type Safety**:  
   - Ensures the data type is checked at **compile-time**, preventing errors at runtime.  
   - Example: If you specify `List<Integer>`, only integers can be added.

2. **Code Reusability**:  
   - Allows us to write a single class or method that can work with any data type.  
   - Example: A single `Box<T>` class can hold integers, strings, or other objects.

3. **No Typecasting**:  
   - Eliminates the need for typecasting, making the code **cleaner and easier to read**.

4. **Readability**:  
   - The code clearly shows what types are being used, improving clarity and maintainability.  

---

## **What are Generics in Java?**

Generics allow us to use **type parameters** (like `T`, `E`, `K`, or `V`) in classes, methods, or interfaces.  

- `T` → Represents a Type (e.g., `Integer`, `String`).  
- Generics ensure type safety and reusability.

---

## **1. Generic Class**

A generic class uses a type parameter so it can work with any type.

### **Example: Generic Class**
```java
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(100);
        System.out.println("Integer: " + intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("Generics");
        System.out.println("String: " + strBox.getValue());
    }
}
```
### **Explanation**:  
- `Box<T>` is a generic class where `T` is a placeholder for a type.  
- It can store any data type (like `Integer` or `String`) without rewriting the code.

---

## **2. Generic Method**

A generic method works with any type.

### **Example: Generic Method**
```java
public class Main {
    public static <T> void printArray(T[] array) {
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3};
        String[] words = {"Hello", "World"};

        printArray(numbers);  // Works for integers
        printArray(words);    // Works for strings
    }
}
```
### **Explanation**:  
- `<T>` before the method means it’s a generic method.  
- The `printArray` method works for both `Integer[]` and `String[]`.

---

## **3. Bounded Type Parameters**

We can restrict the type parameter to certain types using the **`extends`** keyword.

### **Example: Bounded Type**
```java
class Calculator<T extends Number> {
    private T num;

    public Calculator(T num) {
        this.num = num;
    }

    public double square() {
        return num.doubleValue() * num.doubleValue();
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator<Integer> intCalc = new Calculator<>(5);
        System.out.println("Square: " + intCalc.square());

        Calculator<Double> doubleCalc = new Calculator<>(4.5);
        System.out.println("Square: " + doubleCalc.square());
    }
}
```
### **Explanation**:  
- `T extends Number` ensures `T` can only be a number type (`Integer`, `Double`, etc.).

---

## **4. Wildcards in Generics**

Wildcards are used when the exact type is unknown.

### **Example: Wildcard `<?>`**
```java
import java.util.List;

public class Main {
    public static void printList(List<?> list) {
        for (Object item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3);
        List<String> words = List.of("Java", "Generics");

        printList(numbers);  // Works for integers
        printList(words);    // Works for strings
    }
}
```
### **Explanation**:  
- `List<?>` means the method can accept a list of **any type**.

---

## **Summary**

- Parameterized types (Generics) provide **type safety**, **reusability**, and **readability** in Java.  
- Generics include:  
  1. **Generic Classes**  
  2. **Generic Methods**  
  3. **Bounded Types**  
  4. **Wildcards**  

### **Key Features**

| Feature            | Description                                |
|--------------------|--------------------------------------------|
| Generic Class      | Works with any type using `T`.            |
| Generic Method     | A method that accepts any type.           |
| Bounded Type       | Restricts types using `extends`.          |
| Wildcard `<?>`     | Represents an unknown type in collections.|

Generics make Java code **safe, clean, and reusable**, which are core principles of Object-Oriented Programming.

--- 

