import java.util.Scanner;

public class Activity_3 {
    public static void main(String[] args) {
        System.out.println("\nActivity 3: Computer Programming 3\n");

        Scanner scanner = new Scanner(System.in);

        // Problem 1: Convert Inches to Feet and Centimeters
        System.out.println("Problem 1: Convert Inches to Feet and Centimeters\n");
        System.out.print("Enter measurement in inches   : ");
        double inches = scanner.nextDouble();
        double feet = inches / 12;
        double centimeters = inches * 2.54;
        System.out.printf("Equivalent in feet            : %.2f ft%n", feet);
        System.out.printf("Equivalent in centimeters     : %.2f cm%n", centimeters);
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        // Problem 2: Program that Accepts Input and Displays Output
        System.out.println("\nProblem 2: Program that Accepts Input and Displays Output\n");
        System.out.print("Enter the number of eggs in each basket   : ");
        int eggsPerBasket = scanner.nextInt();
        System.out.print("Enter the number of baskets               : ");
        int numBaskets = scanner.nextInt();
        
        //Calculate the total eggs
        int totalEggs = eggsPerBasket * numBaskets;
        System.out.println("\nIf you have " + eggsPerBasket + " eggs per basket and " + numBaskets + " baskets, then the total number of eggs is " + totalEggs + ".");

        // Calculate the new total eggs after removing 2 eggs from each basket
        int newEggsPerBasket = eggsPerBasket - 2;
        int newTotalEggs = newEggsPerBasket * numBaskets;
        System.out.println("\nNow you have " + newEggsPerBasket + " eggs per basket and " + numBaskets + " baskets.");
        System.out.println("The new total number of eggs is " + newTotalEggs + ".");
        System.out.println("\nProgrammer's Name: Elizander Aguila");

        //Problem 3: Kinds of Inputs
        System.out.println("\nProblem 3: Kinds of Inputs\n");

        // 1. Whole numbers
        System.out.println("Enter the whole numbers separated by one or more spaces:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.println("You entered " + num1 + " and " + num2 + ".\n");

        // 2. Two numbers (decimal point allowed)
        System.out.println("Next enter two numbers. A decimal point is OK.");
        double dec1 = scanner.nextDouble();
        double dec2 = scanner.nextDouble();
        System.out.println("You entered " + dec1 + " and " + dec2 + ".\n");

        // 3. Two words
        System.out.println("Next enter two words:");
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println("You entered \"" + word1 + "\" and \"" + word2 + "\"\n");

        // 4. A whole line of text
        System.out.println("Next enter a line of text:");
        scanner.nextLine(); // clear leftover newline
        String line = scanner.nextLine();
        System.out.println("You entered \"" + line + "\"\n");
        System.out.println("Programmer's Name: Elizander Aguila");

        // Problem 4: Milk Cartons, Production Cost and Profit
        System.out.println("\nProblem 4: Milk Cartons, Production Cost and Profit\n");
        final double CARTON_CAPACITY = 3.78;  // liters
        final double COST_PER_LITER = 0.38;   // dollars
        final double PROFIT_PER_CARTON = 0.27; // dollars

        // a. Ask for total milk produced
        System.out.print("Enter the total amount of milk produced in liters: ");
        double totalMilk = scanner.nextDouble();

        // b. Calculate cartons needed (round up since partial cartons still require one)
        int cartonsNeeded = (int) Math.ceil(totalMilk / CARTON_CAPACITY);

        // c. Calculate cost of producing milk
        double totalCost = totalMilk * COST_PER_LITER;

        // d. Calculate profit
        double totalProfit = cartonsNeeded * PROFIT_PER_CARTON;

        // Output results
        System.out.println("\nNumber of cartons needed   : " + cartonsNeeded);
        System.out.printf("Cost of producing milk     : $%.2f%n", totalCost);
        System.out.printf("Profit from producing milk : $%.2f%n", totalProfit);
        System.out.println("\nProgrammer's Name: Elizander Aguila");
        
        //Problem 5: Money Distribution
        System.out.println("\nProblem 5: Money Distribution\n");
        // Input
        System.out.print("Enter your hourly pay rate                      : ");
        double payRate = scanner.nextDouble();

        System.out.print("Enter the number of hours you worked each week  : ");
        double hoursPerWeek = scanner.nextDouble();

        // a. Income before and after tax
        int totalWeeks = 5;
        double grossIncome = payRate * hoursPerWeek * totalWeeks;
        double afterTaxIncome = grossIncome * (1 - 0.14);

        // b. Clothes and accessories (10% of net income)
        double clothes = afterTaxIncome * 0.10;

        // c. School supplies (1% of net income)
        double supplies = afterTaxIncome * 0.01;

        // d. Savings bonds (25% of remaining money)
        double remaining = afterTaxIncome - clothes - supplies;
        double savingsBonds = remaining * 0.25;

        // e. Parents' contribution
        double parentsContribution = savingsBonds * 0.50;

        // Output
        System.out.printf("\nIncome before tax                               : $%.2f%n", grossIncome);
        System.out.printf("Income after tax                                : $%.2f%n", afterTaxIncome);
        System.out.printf("Money spent on clothes and accessories          : $%.2f%n", clothes);
        System.out.printf("Money spent on school supplies                  : $%.2f%n", supplies);
        System.out.printf("Money spent on savings bonds                    : $%.2f%n", savingsBonds);
        System.out.printf("Money parents spent on additional bonds         : $%.2f%n", parentsContribution);
        System.out.println("\nProgrammer's Name: Elizander Aguila");
        scanner.close();
    }
}
