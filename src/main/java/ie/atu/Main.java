package ie.atu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = 0;

        System.out.print("Enter a file name (E.g student.txt): ");
        String fileName = sc.nextLine().trim();

            System.out.print("Enter a name to save: ");
            String name = sc.nextLine().trim();

            try (PrintWriter out = new PrintWriter(new FileWriter(fileName, true))) {
                out.print(name);
                System.out.println("Saved to: " + fileName);

            } catch (IOException ex) {

                System.out.println("Couldn't write to file" + ex.getMessage());
            }
        }


    }
}