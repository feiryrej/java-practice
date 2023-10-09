package basicExercises;

import java.util.Scanner;

public class NumNine {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Declare variables to store the input numbers
        int num1, num2, num3;

        // Prompt the user to input the first number
        System.out.println("Input number 1:");
        num1 = scan.nextInt(); // Read the first number from the user

        // Prompt the user to input the second number
        System.out.println("Input number 2:");
        num2 = scan.nextInt(); // Read the second number from the user

        // Prompt the user to input the third number
        System.out.println("Input number 3:");
        num3 = scan.nextInt(); // Read the third number from the user

        // Calculate the average of the three input numbers
        double average = (num1 + num2 + num3) / 3.0;

        // Display a newline for better formatting
        System.out.println();

        // Display the calculated average
        System.out.println("Average: " + average);

        // Close the Scanner to release resources
        scan.close();
    }
}
