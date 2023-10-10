package basicExercises;

import java.util.Scanner;

public class Equalator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a, b, c, d;

        System.out.print("Input first number:");
        a = scan.nextInt();
        System.out.print("Input second number:");
        b = scan.nextInt();
        System.out.print("Input third number:");
        c = scan.nextInt();
        System.out.print("Input fourth number:");
        d = scan.nextInt();

        System.out.println();

        if ((a == b && b == c) || (b == c && c == d) || (c == d && d == a) || (d == a && a == b)) {
            System.out.println("Three of your numbers are equal");
        } else if (a == b && b == c && c == d) {
            System.out.println("All of your numbers are equal");
        } else if (a == b || a == c || a == d || b == c || b == d || c == d) {
            System.out.println("Two of your numbers are equal");
        } else {
            System.out.println("No two or more numbers are equal");
        }
    }
}
