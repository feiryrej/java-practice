package basicExercises;

import java.util.Scanner;

public class NumSeven {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Declare a variable to store the user's input number
        int input;

        // Prompt the user to input a number to multiply
        System.out.println("Input a number to multiply:");
        input = scan.nextInt(); // Read the input number from the user

        // Display a newline for better formatting
        System.out.println();

        // Display the multiplication results for the input number from 1 to 10
        System.out.println("Results:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(input + " x " + i + " = " + (input * i)); // Calculate and print the result
        }

        // Close the Scanner to release resources
        scan.close();
    }
}
