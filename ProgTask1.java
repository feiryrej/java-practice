package handsOn;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgTask1 {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean tryAgain = true; 
        while (tryAgain) {
            System.out.println("------------------------------------------------------");
            System.out.println("\tWelcome to Our Property Investment Tool!");
            System.out.println("    by Bonifacio, De Villa, Morcillos, and Picones");
            System.out.println("------------------------------------------------------");
            /*
             * First section of the input series of the program.
             * This block of code will ask the user to input the area...
             * and will display information related to the area.
             */
            System.out.println("+----------------------------------------------------+");

            double area = 0;
                try {
                    System.out.println("  Enter area (in sqm): ");
                    System.out.print("  -> ");
                    double temp = scanner.nextDouble();
                    area = temp;
                    temp = 0;
                }catch(InputMismatchException e){
                    System.out.println("\nInvalid input! Please try again!\n");
                    scanner.next();
                    continue;
                }
            System.out.println("+----------------------------------------------------+");

            String unitType = "";
            double pricePerSquareMeter = 0;
            

            if (area < 28.5 || area > 300){
                System.out.println("\nPlease enter a minimum of 28.5 and a maximum of 300\nfor the area per sqm.\n");
                continue;
            } else if (area >= 28.5 && area < 52) {
                unitType = "Studio Type";
                pricePerSquareMeter = 65892.00;
            } else if (area >= 52.0 && area < 86.5) {
                unitType = "2 Bedroom";
                pricePerSquareMeter = 58807.00;
            } else if (area >= 86.5) {
                unitType = "3 Bedroom";
                pricePerSquareMeter = 53380.00;
            }
            
            double totalUnitPrice = area * pricePerSquareMeter;

            // Displays the information associated with the area in a table format.
            System.out.println("+-------------------------------+--------------------+");
            System.out.printf("| AREA (in square meters)\t| %-18.2f |", area);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Unit Type:\t\t\t| %-18s |", unitType);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Price per Square Meter\t| %-18.2f |", pricePerSquareMeter);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Total Unit Price:\t\t| %-18.2f |", totalUnitPrice);
            System.out.println("\n+-------------------------------+--------------------+");

            /*
             * Second section of the input series of the program.
             * This block of code will ask the user to input the down payment...
             * and will display information related to the down payment.
             */
            System.out.println("+----------------------------------------------------+");
            double downPayment = 0;
            try {
                System.out.println("  Enter down payment (at least 3% of total unit price): ");
                System.out.print("  -> ");
                double temp = scanner.nextDouble();
                downPayment = temp;
                temp = 0;
            }catch(InputMismatchException e){
                System.out.println("\nInvalid input! Please try again!\n");
                scanner.next();
                continue;
            }
            System.out.println("+----------------------------------------------------+");

            double discountPercentage = 0;
            double downPaymentPercentage = (downPayment / totalUnitPrice) * 100;

            if (downPaymentPercentage >= 3 && downPaymentPercentage < 20) {
                discountPercentage = 0;
            } else if (downPaymentPercentage >= 20 && downPaymentPercentage < 30) {
                discountPercentage = 0.03;
            } else if (downPaymentPercentage >= 30 && downPaymentPercentage < 40) {
                discountPercentage = 0.04;
            } else if (downPaymentPercentage >= 40 && downPaymentPercentage == 100) {
                discountPercentage = 0.05;
            } else {
                System.out.println("\nPlease make a down payment of at least 3% of the total\nunit price!\n");

                double minimumDownPayment = 0.03 * totalUnitPrice;
                System.out.printf("Minimum down payment: %.2f\n\n", minimumDownPayment);
                continue;
            }
            
            double amountBalance = totalUnitPrice - downPayment;
            double lessDiscountAmount = amountBalance * discountPercentage;
            
            // Display the information associated with the down payment in a table format.
            System.out.println("+-------------------------------+--------------------+");
            System.out.printf("| Down payment Amount\t\t| %-18.2f |", downPayment);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Down payment in Percentage\t| %-18.2f |", downPaymentPercentage);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Balance\t\t\t| %-18.2f |", amountBalance);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Discount\t\t\t| %-18.2f |", discountPercentage);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Less Discount Amount\t\t| %-18.2f |", lessDiscountAmount);
            System.out.println("\n+-------------------------------+--------------------+");

            /*
             * Third section of the input series of the program.
             * This block of code will ask the user to input the number of years to pay...
             * and will display information related to the number of years to pay.
             */
            System.out.println("+----------------------------------------------------+");
            int yearsToPay = 0;
            try {
                System.out.println("  Enter number of years to pay (5, 10, 15, 20): ");
                System.out.print("  -> ");
                int temp = scanner.nextInt();
                yearsToPay = temp;
                temp = 0;
            }catch(InputMismatchException e){
                System.out.println("\nInvalid input! Please try again!\n");
                scanner.next();
                continue;
            }
            System.out.println("+----------------------------------------------------+");
            
            double interestPercentage = 0;

            if (yearsToPay == 5) {
                interestPercentage = 0.04;
            } else if (yearsToPay == 10) {
                interestPercentage = 0.06;
            } else if (yearsToPay == 15) {
                interestPercentage = 0.08;
            } else if (yearsToPay == 20) {
                interestPercentage = 0.1;
            }else {
                System.out.println("\nPlease enter between 5, 10, 15, or 20 number of years\nonly.\n");
                continue;
            }

            double interestAmount = (amountBalance - lessDiscountAmount) * interestPercentage;
            double contractPrice = amountBalance - lessDiscountAmount + interestAmount;
            double monthlyAmortization = contractPrice / (yearsToPay * 12);

            // Display the information associated with the number of years to pay in a table format.
            System.out.println("+-------------------------------+--------------------+");
            System.out.printf("| Years to Pay\t\t\t| %-18d |", yearsToPay);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Interest (applied to\t\t| %-18.2f |", interestPercentage);
            System.out.println("\n| Balance Less Discount)\t|\t\t     |");
            System.out.println("+-------------------------------+--------------------+");
            System.out.printf("| Interest Amount\t\t| %-18.2f |", interestAmount);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Contract Price\t\t| %-18.2f |", contractPrice);
            System.out.println("\n+-------------------------------+--------------------+");
            System.out.printf("| Monthly Amortization\t\t| %-18.2f |", monthlyAmortization);
            System.out.println("\n+-------------------------------+--------------------+");
        
            // This block of code is responsible for retrying the program.
            System.out.print("\nDo you want to try again? [Yes] or [No]\nAnswer: ");
            String tryAgainInput = scanner.next().toLowerCase();
            
            if (!tryAgainInput.equals("yes")) {
                tryAgain = false;
                System.out.println("\nThank you for using the program!");
            }
            }
                scanner.close();
        }
    }
    

