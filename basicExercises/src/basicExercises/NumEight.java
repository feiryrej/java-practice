package basicExercises;

import java.util.Scanner;

public class NumEight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the perimeter (circumference)
        double perimeter = 2 * Math.PI * radius;

        // Calculate the area
        double area = Math.PI * radius * radius;

        // Display the results
        System.out.println("Perimeter of the circle: " + perimeter);
        System.out.println("Area of the circle: " + area);

        scanner.close();
		
	}

}
