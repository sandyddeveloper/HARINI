Read and Write Data in Java
```java
import java.io.*;

public class FileReadWriteExample {

    // Method to write data to a file
    public static void writeToFile(String fileName, String data) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(data);
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read data from a file
    public static void readFromFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading data from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // File name
        String fileName = "example.txt";

        // Data to write
        String data = "Hello, World!\nWelcome to Java file handling.";

        // Write data to file
        writeToFile(fileName, data);

        // Read data from file
        readFromFile(fileName);
    }
}
```

### Explanation:

1. **Write to File**:
   - `BufferedWriter` is used with `FileWriter` to write data to a file.
   - The `try-with-resources` block ensures that the writer is closed after the operation.

2. **Read from File**:
   - `BufferedReader` is used with `FileReader` to read data from a file line by line.
   - The `try-with-resources` block ensures that the reader is closed after the operation.

3. **Main Method**:
   - Defines a file name and sample data.
   - Writes the data to the file and then reads it back to verify.

### Output:
Assuming the file is named `example.txt`, the output will be:

```
Data written to file successfully.
Reading data from file:
Hello, World!
Welcome to Java file handling.
```

