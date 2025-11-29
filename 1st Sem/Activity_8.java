import java.util.Scanner;

public class Activity_8 {
    static Scanner sc = new Scanner(System.in);

    // Arrays for cities and charges
    static String[] cities = {"MANILA", "PASAY", "QUEZON", "TAGUIG", "MAKATI"};
    static double[] charges = {175.00, 150.00, 200.00, 250.00, 275.00};

    // Daily totals
    static double totalCollection = 0.0;
    static int transactionCount = 0;

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("\t\t  HIJK POSTAL SERVICES");
        System.out.println("\t\tROXAS BOULEVARD, MANILA");
        System.out.println();

        displayCitiesAndCharges();

        String another;
        do {
            double charge = processOneTransaction();
            System.out.printf("TOTAL CHARGE            : %.2f\n\n", charge);

            totalCollection += charge;
            transactionCount++;

            // Asking with clean spacing
            do {
                System.out.print("PROCESS ANOTHER? (Y/N)  : ");
                another = sc.nextLine().trim();
            } while (!another.equalsIgnoreCase("Y") && !another.equalsIgnoreCase("N"));

            System.out.println(); // extra blank line after answer

        } while (another.equalsIgnoreCase("Y"));

        printDailySummary();
    }

    // Method 1: Show the list of cities and charges
    static void displayCitiesAndCharges() {
        System.out.println("CITIES:         CHARGES:");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%d - %-10s %.0f\n", i + 1, cities[i], charges[i]);
        }
        System.out.println();
    }

    // Method 2: Process one customer
    static double processOneTransaction() {
        System.out.print("ENTER CITY NUMBER (1-5) : ");
        int cityNum = sc.nextInt();
        sc.nextLine(); // clear newline

        if (cityNum < 1 || cityNum > 5) cityNum = 1; // safe default

        double base = charges[cityNum - 1];

        System.out.print("EXPRESS DELIVERY? (Y/N) : ");
        String express = sc.nextLine().trim();

        if (express.equalsIgnoreCase("Y")) {
            base += 150.00;
        }
        return base;
    }

    // Method 3: Show end-of-day summary
    static void printDailySummary() {
        System.out.printf("TOTAL COLLECTION FOR THE DAY : %.2f", totalCollection);
        System.out.println("\nTOTAL NO. OF TRANSACTION     : " + transactionCount);
        System.out.println("YOUR NAME                    : AGUILA, ELIZANDER S.");
    }
}