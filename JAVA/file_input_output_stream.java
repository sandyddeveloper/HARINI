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


