import java.util.Scanner;

public class Quiz_1 {
    public static void main(String[] args) {
        System.out.println("\nQuiz 1: Computer Programming 3\n");

        Scanner scanner = new Scanner(System.in);

        // Problem 1: Calculate total price of dog food including tax
        System.out.println("Problem 1: Calculate total price of dog food including tax\n");

        // Declare variables
        int numberOfBags;
        double unitWeight;
        double totalPrice;
        double totalPriceWithTax;

        // Initialize variables
        double salesTax = 0.0725;
        double costPerPound = 5.99;

        // Get user input
        System.out.println("=========Sales Calculator=======");
        System.out.print("No. bags sold            : ");
        numberOfBags = scanner.nextInt();
        System.out.print("Weight per bag in pounds : ");
        unitWeight = scanner.nextDouble();

        // Calculate total price
        totalPrice = numberOfBags * unitWeight * costPerPound;

        // Calculate total price with tax
        totalPriceWithTax = totalPrice + (totalPrice * salesTax);

        // Display results
        System.out.printf("\n=========Sales Summary==========");
        System.out.printf("\nPrice per pound          : %.2f", costPerPound);
        System.out.printf("\nSales tax                : %.2f%%", salesTax * 100);
        System.out.printf("\nTotal price with tax     : %.2f", totalPriceWithTax);
        System.out.println("\n\nProgrammer's Name: Elizander Aguila");
        scanner.close();
    }
}
