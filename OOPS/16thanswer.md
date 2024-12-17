
## **InputStream in Java**

### **Introduction to InputStream**
- **`InputStream`** is an abstract class in the **`java.io`** package. It is the superclass for all input byte stream classes in Java.
- It is primarily used to **read data (bytes) from a source** such as files, arrays, or other input streams.
- As an abstract class, **`InputStream`** provides a foundation for handling input operations, and specific subclasses like `FileInputStream`, `ByteArrayInputStream`, and `BufferedInputStream` extend it to implement concrete input operations.
- InputStream works with **8-bit bytes**, and it provides methods to read data **sequentially**.

---

## **Methods Defined in InputStream**
The `InputStream` class defines several key methods to perform input operations. Here is an outline of its methods:

### **1. `int read()`**
- **Purpose**: Reads the next byte of data from the input stream.  
- **Returns**: The byte read as an integer (0 to 255), or `-1` if the end of the stream is reached.  
- **Example**:
  ```java
  InputStream input = new FileInputStream("example.txt");
  int data = input.read();
  while (data != -1) {
      System.out.print((char) data);
      data = input.read();
  }
  input.close();
  ```

---

### **2. `int read(byte[] b)`**
- **Purpose**: Reads bytes of data into a **byte array**.  
- **Returns**: The number of bytes read, or `-1` if the end of the stream is reached.  
- **Example**:
  ```java
  byte[] buffer = new byte[10];
  int bytesRead = input.read(buffer);
  System.out.println("Bytes Read: " + bytesRead);
  ```

---

### **3. `int read(byte[] b, int off, int len)`**
- **Purpose**: Reads up to `len` bytes into a specified portion of a byte array starting at index `off`.  
- **Returns**: The number of bytes read, or `-1` if the end of the stream is reached.  
- **Usage**: Useful for partial reads into an array.

---

### **4. `long skip(long n)`**
- **Purpose**: Skips `n` bytes of input and discards them.  
- **Returns**: The actual number of bytes skipped.  
- **Example**:
  ```java
  input.skip(5); // Skips the first 5 bytes
  ```

---

### **5. `int available()`**
- **Purpose**: Returns an estimate of the number of bytes that can be read without blocking.  
- **Returns**: Number of bytes available to read.  
- **Usage**: Useful to check how much data can be read.  

---

### **6. `void close()`**
- **Purpose**: Closes the input stream and releases any system resources associated with it.  
- **Usage**: Always close streams after use to free resources.  
- **Example**:
  ```java
  input.close();
  ```

---

### **7. `void mark(int readlimit)`**
- **Purpose**: Marks the current position in the stream.  
- **Parameter**: `readlimit` is the number of bytes that can be read before the mark position becomes invalid.  

---

### **8. `void reset()`**
- **Purpose**: Resets the stream to the last marked position.  
- **Precondition**: The stream must be marked before calling `reset`.  

---

### **9. `boolean markSupported()`**
- **Purpose**: Checks if the current stream supports the `mark()` and `reset()` methods.  
- **Returns**: `true` if supported, otherwise `false`.  

---


### **Key Methods**
| Method                        | Purpose                                      |
|-------------------------------|----------------------------------------------|
| `int read()`                  | Reads one byte of data.                     |
| `int read(byte[] b)`          | Reads into a byte array.                    |
| `int read(byte[] b, int off, int len)` | Reads into a part of a byte array.        |
| `long skip(long n)`           | Skips bytes in the input stream.            |
| `int available()`             | Returns available bytes to read.            |
| `void close()`                | Closes the stream.                          |
| `void mark(int readlimit)`    | Marks the current position.                 |
| `void reset()`                | Resets to the marked position.              |
| `boolean markSupported()`     | Checks if mark/reset is supported.          |

---

