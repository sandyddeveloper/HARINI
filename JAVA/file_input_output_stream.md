# File Input and Output Streams
```java
import java.io.*;

public class FileIOStreamExample {

    // Method to write data to a file using FileOutputStream
    public static void writeToFile(String fileName, String data) {
        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            // Convert string to bytes and write to file
            fos.write(data.getBytes());
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to read data from a file using FileInputStream
    public static void readFromFile(String fileName) {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            System.out.println("Reading data from file:");
            int content;
            while ((content = fis.read()) != -1) {
                // Convert byte to char and print
                System.out.print((char) content);
            }
            System.out.println();
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // File name
        String fileName = "fileStreamExample.txt";

        // Data to write
        String data = "This is an example of FileInputStream and FileOutputStream.";

        // Write data to file
        writeToFile(fileName, data);

        // Read data from file
        readFromFile(fileName);
    }
}
```

### Explanation:

1. **FileOutputStream**:
   - Used for writing binary data to a file.
   - The `write()` method takes a byte array and writes it to the file.

2. **FileInputStream**:
   - Used for reading binary data from a file.
   - The `read()` method reads one byte at a time and returns `-1` when the end of the file is reached.

3. **try-with-resources**:
   - Automatically closes the file streams after the operation, ensuring no resource leaks.

4. **Main Method**:
   - Writes the string `data` to the file.
   - Reads the file's contents and prints it to the console.

### Output:
Assuming the file is named `fileStreamExample.txt`, the output will be:

```
Data written to file successfully.
Reading data from file:
This is an example of FileInputStream and FileOutputStream.
```

