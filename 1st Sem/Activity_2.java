import java.text.DecimalFormat;
import java.util.Scanner;

public class Activity_2 {
    public static void main(String[] args) {
        System.out.println("\nActivity 2: Computer Programming 3\n");

        Scanner scanner = new Scanner(System.in);

        // Problem 1: Conversion of Dollar to Pesos
        System.out.println("Problem 1: Conversion of Dollar to Pesos\n");
        System.out.print("Enter the amount in dollars: ");
        double dollars = scanner.nextDouble();
        double conversionRate = 50.75;
        // Calculate pesos
        double pesos = dollars * conversionRate;
        System.out.println(dollars + " dollars is equivalent to " + pesos + " pesos.");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 2: Compute Volume of a Sphere
        System.out.println("\nProblem 2: Compute Volume of a Sphere\n");
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);

        // Round to 2 decimal places for display
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The volume of the sphere is: " + df.format(volume) + " m^3");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 3: Compute the Gross Pay of an Employee
        System.out.println("\nProblem 3: Compute the Gross Pay of an Employee\n");
        System.out.print("Enter the number of hours worked: ");
        double hoursWorked = scanner.nextDouble();
        System.out.print("Enter the hourly rate: ");
        double hourlyRate = scanner.nextDouble();

        // Calculate gross pay
        double grossPay = hoursWorked * hourlyRate;
        System.out.println("\nThe gross pay is: " + df.format(grossPay) + " pesos.");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 4: Sum and Product of Two Numbers
        System.out.println("\nProblem 4: Sum and Product of Two Numbers\n");
        System.out.print("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double secondNumber = scanner.nextDouble();

        // Calculate sum and product
        double sum = firstNumber + secondNumber;
        double product = firstNumber * secondNumber;
        System.out.println("\nThe sum of " + firstNumber + " and " + secondNumber + " is: " + df.format(sum));
        System.out.println("The product of " + firstNumber + " and " + secondNumber + " is: " + df.format(product));
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        //Problem 5: Compute the Average Grade of a Student
        System.out.println("\nProblem 5: Compute the Average Grade of a Student\n");
        System.out.print("Enter the Prelim Grade: ");
        double prelimGrade = scanner.nextDouble();
        System.out.print("Enter the Second Grade: ");
        double midtermGrade = scanner.nextDouble();
        System.out.print("Enter the Final Grade: ");
        double finalGrade = scanner.nextDouble();

        // Calculate average grade
        double averageGrade = (prelimGrade + midtermGrade + finalGrade) / 3;
        System.out.println("\nThe average grade is: " + df.format(averageGrade));
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 6: Swap the Two Numbers
        System.out.println("\nProblem 6: Swap the Two Numbers\n");
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        
        // Swap the numbers
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + df.format(num1));
        System.out.println("Second number: " + df.format(num2));
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 7: Compute the Time Required to Travel a Given Distance
        System.out.println("\nProblem 7: Compute the Time Required to Travel a Given Distance\n");
        System.out.print("Enter the distance (in miles): ");
        double distance = scanner.nextDouble();
        System.out.print("Enter the speed (in mph): ");
        double speed = scanner.nextDouble();

        // Calculate time
        double time = distance / speed;
        System.out.println("\nThe time required to travel " + distance + " miles at " + speed + " mph is: " + df.format(time) + " hours.");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 8: Compute the Area and Perimeter of a Rectangle
        System.out.println("\nProblem 8: Compute the Area and Perimeter of a Rectangle\n");
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate area and perimeter
        double area = length * width;
        double perimeter = 2 * (length + width);
        System.out.println("\nThe area of the rectangle is: " + df.format(area) + " square units.");
        System.out.println("The perimeter of the rectangle is: " + df.format(perimeter) + " units.");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 9: Convert feet to inches
        System.out.println("\nProblem 9: Convert feet to inches\n");
        System.out.print("Enter the length in feet: ");
        double feet = scanner.nextDouble();

        // Convert feet to inches
        double inches = feet * 12;
        System.out.println(feet + " feet is equivalent to " + df.format(inches) + " inches.");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 10: Calculate Interest, Witholding Tax, and Net Interest
        System.out.println("\nProblem 10: Calculate Interest, Witholding Tax, and Net Interest\n");
        // Given values
        System.out.print("Enter the principal amount: ");
        double prtPrincipal = scanner.nextDouble();    // P
        System.out.print("Enter the rate of interest: ");
        double prtRate = scanner.nextDouble();         // R
        System.out.print("Enter the time in years: ");
        double prtTime = scanner.nextDouble();         // T in years
        System.out.print("Enter the withholding tax rate: ");
        double withholdingRate = scanner.nextDouble(); // 10%

        // Calculate interest
        double interest = prtPrincipal * prtRate * prtTime/365;

        // Calculate withholding tax
        double tax = interest * withholdingRate;

        // Calculate net interest
        double netInterest = interest - tax;

        // Display results
        System.out.println("\nInterest: " + df.format(interest) + " PHP");
        System.out.println("Withholding Tax: " + df.format(tax) + " PHP");
        System.out.println("Net Interest: " + df.format(netInterest) + " PHP");
        System.out.println("\nProgrammer's Name: Elizander Aguila");
        scanner.close(); // Close the scanner
    }
}
