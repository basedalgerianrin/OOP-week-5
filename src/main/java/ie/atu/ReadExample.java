package ie.atu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadExample {
    // Main method - entry point of the program
    public static void main(String[] args) {
        // Call the method to read and show the contents of the file
        showFile();
    }

    // Method to read from a file and display its contents
    static void showFile() {
        BufferedReader br = null; // Declare BufferedReader to read the file, initialized to null

        try {
            // Create a FileReader object to read from "student.txt"
            FileReader neverUsed = new FileReader("student.txt");
            // Wrap FileReader in BufferedReader for efficient reading of lines
            br = new BufferedReader(neverUsed);

            // Print a message indicating the start of file content output
            System.out.println("Contents of student.txt: ");

            String line; // Variable to hold each line read from the file

            // Loop to read each line until end of file (readLine() returns null)
            while ((line = br.readLine()) != null) {
                // Print each line with a prefix for formatting
                System.out.println(" - " + line);
            }

        } catch (IOException ex) {
            // Catch block to handle exceptions during file reading (e.g., file not found)
            System.out.println("Could not read file: " + ex.getMessage());
        } finally {
            // The finally block ensures resources are closed, even if an exception occurred
            if (br != null) {
                try {
                    // Attempt to close the BufferedReader to free resources
                    br.close();
                } catch (IOException closeEx) {
                    // Handle exceptions that might occur while closing the file
                    System.out.println("Could not close file: " + closeEx.getMessage());
                }
            }
        }
    }
}
