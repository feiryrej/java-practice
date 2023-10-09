package basicExercises;

import java.util.Scanner;

public class NumSix {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Declare variables to store the input numbers
        int num1, num2;

        // Prompt the user to input the first number
        System.out.println("Input first number here:");
        num1 = scan.nextInt(); // Read the first number from the user

        // Prompt the user to input the second number
        System.out.println("Input second number here:");
        num2 = scan.nextInt(); // Read the second number from the user

        // Display a newline for better formatting
        System.out.println();

        // Display the results of various arithmetic operations
        System.out.println("Results:");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2)); // Addition
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2)); // Subtraction
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2)); // Multiplication
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2)); // Division
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2)); // Modulus (remainder)

        // Close the Scanner to release resources
        scan.close();
    }
}
