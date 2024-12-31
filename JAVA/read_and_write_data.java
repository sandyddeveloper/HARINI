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
