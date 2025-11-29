import java.util.Scanner;

public class Activity_4 {
    public static void main(String[] args) {
        System.out.println("\nActivity 4: Computer Programming 3\n");

        Scanner scanner = new Scanner(System.in);

        //Problem 1: Check if positive or negative
        System.out.println("Problem 1: Check if positive or negative\n");
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is positive or negative
        if (number >= 0) {
            System.out.println("\nPOSITIVE");
        } else
            System.out.println("\nNEGATIVE");

        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 2: Check if divisible by 5
        System.out.println("\nProblem 2: Check if divisible by 5\n");
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if the number is divisible by 5
        if (num % 5 == 0) {
            System.out.println("\nDIVISIBLE");
        } else
            System.out.println("\nNOT DIVISIBLE");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 3: Input 1 to 12 equivalent month
        System.out.println("\nProblem 3: Input 1 to 12 equivalent month\n");
        System.out.print("Enter a number (1-12): ");
        int month = scanner.nextInt();

        // Check the month
        if (month == 1) {
            System.out.println("\nMonth of: JANUARY");
        } if (month == 2) {
            System.out.println("\nMonth of: FEBRUARY");
        } if (month == 3) {
            System.out.println("\nMonth of: MARCH");
        } if (month == 4) {
            System.out.println("\nMonth of: APRIL");
        } if (month == 5) {
            System.out.println("\nMonth of: MAY");
        } if (month == 6) {
            System.out.println("\nMonth of: JUNE");
        } if (month == 7) {
            System.out.println("\nMonth of: JULY");
        } if (month == 8) {
            System.out.println("\nMonth of: AUGUST");
        } if (month == 9) {
            System.out.println("\nMonth of: SEPTEMBER");
        } if (month == 10) {
            System.out.println("\nMonth of: OCTOBER");
        } if (month == 11) {
            System.out.println("\nMonth of: NOVEMBER");
        } if (month == 12) {
            System.out.println("\nMonth of: DECEMBER");
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 4: Check the temperature
        System.out.println("\nProblem 4: Check the temperature\n");
        System.out.print("Enter the temperature in Celsius: ");
        int temp = scanner.nextInt();

        // Check the temperature range
        if (temp < 0) {
            System.out.println("\nICE");
        } if (temp > 0 && temp < 100) {
            System.out.println("\nWATER");
        } if (temp >= 100) {
            System.out.println("\nSTEAM");
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 5: Input m or f and it will greet "HELLO SIR!" or "HELLO MADAM!"
        System.out.println("\nProblem 5: Input m or f and it will greet \"HELLO SIR!\" or \"HELLO MADAM!\"\n");
        System.out.print("Enter your gender (m/f): ");
        char gender = scanner.next().charAt(0);

        // Check the gender
        switch (gender) {
            case 'm':
            case 'M':
                System.out.println("\nHELLO SIR!");
                break;
            case 'f':
            case 'F':
                System.out.println("\nHELLO MADAM!");
                break;
            default:
                System.out.println("\nInvalid input!");
                break;
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 6: Input a number and it will check if it's even or odd
        System.out.println("\nProblem 6: Input a number and it will check if it's even or odd\n");
        System.out.print("Enter a number: ");
        int evenOdd = scanner.nextInt();

        // Check if the number is even or odd
        if (evenOdd % 2 == 0) {
            System.out.println("\nEVEN");
        } else {
            System.out.println("\nODD");
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 7: Check if the age is 18 and above
        System.out.println("\nProblem 7: Check if the age is 18 and above\n");
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // Check if the age is 18 and above
        if (age >= 18) {
            System.out.println("\nYou are qualified to vote.");
        } else {
            System.out.println("\nYou are not qualified to vote.");
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 8: Amount of money a company owes for a seminar.
        System.out.println("\nProblem 8: Amount of money a company owes for a seminar.\n");
        System.out.print("Enter the number of registrants attending the seminar: ");
        int registrants = scanner.nextInt();
        int feePerPerson = 0;

        // Calculate the fee per person based on the number of registrants
        if (registrants >= 1 && registrants <= 4) {
            feePerPerson = 500;
        } else if (registrants >= 5 && registrants <= 10) {
            feePerPerson = 400;
        } else if (registrants >=11) {
            feePerPerson = 300;
        }
        System.out.println("Fee per person                                       : " + feePerPerson);
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 9: Display the price based on the Product ID using Switch
        System.out.println("\nProblem 9: Display the price based on the Product ID using Switch\n");
        System.out.print("Enter the Product ID (1, 2, 5, 7, 9, 11): ");
        int productId = scanner.nextInt();
        double price = 0;

        // Calculate the price based on the Product ID
        switch (productId) {
            case 1:
                price = 50.55;
                break;
            case 2:
                price = 12.35;
                break;
            case 5:
                price = 11.46;
                break;
            case 7:
                price = 11.46;
                break;
            case 9:
                price = 12.35;
                break;
            case 11:
                price = 11.46;
                break;
            default:
                System.out.println("\nInvalid Product ID!");
                break;
        }
        System.out.println("Price of the product                    : " + price);
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 10: Display the message using the letter grade
        System.out.println("\nProblem 10: Display the message using the letter grade\n");
        System.out.print("Enter your letter grade (A, B, C, D, F): ");
        char grade = scanner.next().charAt(0);
        String message;

        // Determine the message based on the letter grade
        switch (Character.toUpperCase(grade)) {
            case 'A':
                message = "\nRemarks: Excellent";
                break;
            case 'B':
                message = "\nRemarks: Above average";
                break;
            case 'C':
                message = "\nRemarks: Average";
                break;
            case 'D':
                message = "\nRemarks: Below average";
                break;
            case 'F':
                message = "\nRemarks: Failed";
                break;
            default:
                message = "\nInvalid letter grade";
                break;
        }
        System.out.println(message);
        System.out.println("\nProgrammer's Name: Elizander Aguila");
        scanner.close();
    }
}
