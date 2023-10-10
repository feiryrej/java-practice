package basicExercises;

import java.util.Scanner;

public class zeroAndOne {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.print("Input first number: ");
        num1 = scan.nextInt();
        System.out.print("Input second number: ");
        num2 = scan.nextInt();

        if ((num1 == 0 && num2 == 1) || (num1 == 1 && num2 == 0)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
