

# Using the `StringBuffer` Class
```java
public class StringBufferExample {

    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer("Hello");

        // Display the original string
        System.out.println("Original String: " + sb);

        // Append a string
        sb.append(" World");
        System.out.println("After append: " + sb);

        // Insert a string at a specific index
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);

        // Replace a portion of the string
        sb.replace(6, 10, "Awesome");
        System.out.println("After replace: " + sb);

        // Delete a portion of the string
        sb.delete(6, 13);
        System.out.println("After delete: " + sb);

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Display the capacity of the StringBuffer
        System.out.println("Capacity: " + sb.capacity());
    }
}
```

### Explanation:

1. **Create a `StringBuffer`**:
   - `StringBuffer sb = new StringBuffer("Hello");` initializes a `StringBuffer` with the string "Hello".

2. **Append**:
   - `append(String str)` adds a string to the end of the current `StringBuffer`.

3. **Insert**:
   - `insert(int offset, String str)` inserts a string at the specified index.

4. **Replace**:
   - `replace(int start, int end, String str)` replaces characters in the specified range with the given string.

5. **Delete**:
   - `delete(int start, int end)` removes characters in the specified range.

6. **Reverse**:
   - `reverse()` reverses the sequence of characters.

7. **Capacity**:
   - `capacity()` returns the current capacity of the `StringBuffer`. It starts at 16 characters by default, plus the length of the initial string.

### Output:
```
Original String: Hello
After append: Hello World
After insert: Hello Java World
After replace: Hello Awesome World
After delete: Hello World
After reverse: dlroW olleH
Capacity: 27
```

