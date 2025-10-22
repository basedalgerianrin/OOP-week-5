package ie.atu;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = 0;

        while (true) {
            System.out.print("Enter age: ");
            String text = sc.nextLine().trim();

            try {
                age = Integer.parseInt(text);
                System.out.println("Thanks You entered age: " + age);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid Input" + e.getMessage());
            }
        }


    }
}