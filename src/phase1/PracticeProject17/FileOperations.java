//Writing a program in Java to create, read, update, and delete operations on the files in Java
package phase1.PracticeProject17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileOperations {
    public static void main(String[] args) {
        String fileName = "example.txt";

        // Create a file
        createFile(fileName);

        // Write data to the file
        writeToFile(fileName, "Hello, World!");

        // Read data from the file
        readFromFile(fileName);

        // Append data to the file
        appendToFile(fileName, "\nThis is a new line.");

        // Read data from the file after appending
        readFromFile(fileName);

        // Delete the file
        deleteFile(fileName);
    }

    // Method to create a file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    // Method to write data to a file
    public static void writeToFile(String fileName, String data) {
        try {
            Files.write(Paths.get(fileName), data.getBytes());
            System.out.println("Data written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }

    // Method to read data from a file
    public static void readFromFile(String fileName) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(fileName));
            System.out.println("Content of the file:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file: " + e.getMessage());
        }
    }

    // Method to append data to a file
    public static void appendToFile(String fileName, String data) {
        try {
            Files.write(Paths.get(fileName), data.getBytes(), java.nio.file.StandardOpenOption.APPEND);
            System.out.println("Data appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
    }

    // Method to delete a file
    public static void deleteFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while deleting the file: " + e.getMessage());
        }
    }
}

