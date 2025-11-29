import java.util.Scanner;

public class Activity_5 {
    public static void main(String[] args) {
        System.out.println("\nActivity 5: Computer Programming 3\n");

        Scanner scanner = new Scanner(System.in);

        // Problem 1: Print number from 1 to 10
        System.out.println("Problem 1: Print number from 1 to 10\n");

        // Print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 2: Calculat the sum of first 10 natural numbers
        System.out.println("\nProblem 2: Calculate the sum of first 10 natural numbers\n");
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 3: Reversing integer
        System.out.println("\nProblem 3: Reversing integer\n");
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        System.out.println("Reversed integer: " + reversed);
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 4: Reads a set of integers, and then prints the sum of the even and odd integers
        System.out.println("\nProblem 4: Reads a set of integers, and then prints the sum of the even and odd integers\n");
        int evenSum = 0;
        int oddSum = 0;
        System.out.println("Enter integers (type -1 to end):");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                evenSum += input;
            } else {
                oddSum += input;
            }
        }
        System.out.println("\nSum of even integers : " + evenSum);
        System.out.println("Sum of odd integers  : " + oddSum);
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 5: Input positive integer and check if it's prime
        System.out.println("\nProblem 5: Input positive integer and check if it's prime\n");
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 6: Do-While Loop asks to input 2 numbers and get their sum and ask them if they want to repeat
        System.out.println("\nProblem 6: Do-While Loop asks to input 2 numbers and get their sum and ask them if they want to repeat\n");
        String choice;
        do {
        // Get user input
            System.out.print("Enter the first number    : ");
            int firstNum = scanner.nextInt();
            System.out.print("Enter the second number   : ");
            int secondNum = scanner.nextInt();

        // Calculate sum
            int total = firstNum + secondNum;
            System.out.println("The sum of the numbers is : " + total);

        // Ask user if they want to repeat
            System.out.print("\nDo you want to repeat? (yes/no): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("yes"));
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 7: Print the following pattern
        System.out.println("\nProblem 7: Print the following pattern\n");

        // Print the pattern with 8 asterisks in each line
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n");

        // Print the pattern with 1, 2, 3, 4, and 5 asterisks in each line
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\nProgrammer's Name: Elizander Aguila");
        scanner.close();
    }
}
