package basicExercises;

import java.util.Scanner;

public class greatestNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, num3;

        System.out.print("Input the first number:");
        num1 = scan.nextInt();
        System.out.print("Input the second number:");
        num2 = scan.nextInt();
        System.out.print("Input the third number:");
        num3 = scan.nextInt();

        // Check which number is the greatest
        if (num1 > num2 && num1 > num3) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("The greatest number is: " + num3);
        }
    }
}
