package ie.atu;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user (keyboard)
        Scanner sc = new Scanner(System.in);
        int age = 0; // Declared but unused, might be leftover or for future use

        // Prompt the user to enter the filename where data will be saved
        System.out.print("Enter a file name (E.g student.txt): ");
        // Read the filename input from the user and remove any leading/trailing whitespace
        String fileName = sc.nextLine().trim();

        // Prompt the user to enter a name to save in the file
        System.out.print("Enter a name to save: ");
        // Read the name input and trim whitespace
        String name = sc.nextLine().trim();

        // Use try-with-resources to automatically close the PrintWriter after writing
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
            // Write the entered name to the file (appending to existing content)
            out.print(name);
            // Notify the user that the data was saved successfully
            System.out.println("Saved to: " + fileName);

        } catch (IOException ex) {
            // Handle any IO exceptions that might occur during file writing
            System.out.println("Couldn't write to file: " + ex.getMessage());
        }

        // Note: Scanner is not closed here, but ideally it should be closed to avoid resource leaks
    }
}
