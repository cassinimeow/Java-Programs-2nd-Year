import java.util.Scanner;

public class Activity_9 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    char choice;
    double grandTotal = 0; // ✅ GRAND TOTAL

    // Arrays
    String[] items = {"PORK SIOMAI", "BEEF SIOMAI", "SHRIMP SIOMAI", "COKE", "ROYAL", "SPRITE"};
    double[] prices = {20.00, 25.00, 30.00, 20.00, 20.00, 20.00};
    int[] qty = new int[items.length];
    double[] amount = new double[items.length];

    do {
        System.out.println("\n\t   Cassius Thundercock's Siomai House");
        System.out.println("\t     WHAT'S YOUR ORDER MA'AM/SIR....\n");

        inputOrders(items, prices, qty);
        double total = computeAmount(prices, qty, amount);
        displayBill(items, qty, amount, total);

        grandTotal += total; // ✅ accumulate

        System.out.print("\nDo you want to continue? (y/n): ");
        choice = sc.next().charAt(0);
        System.out.println();

    } while (choice == 'y' || choice == 'Y');

    // ✅ DISPLAY GRAND TOTAL AFTER ALL TRANSACTIONS
    System.out.println("============================================================");
    System.out.printf("GRAND TOTAL SALES: %.2f%n", grandTotal);
    System.out.println("============================================================");
    System.out.println("\nProgrammer's Name: Elizander Aguila | DIT 2-3");

    sc.close();
}

    // METHOD: Input Orders
    static void inputOrders(String[] items, double[] prices, int[] qty) {
        for (int i = 0; i < items.length; i++) {
            System.out.print("ENTER THE NUMBER OF " + items[i] + " ORDERED (" + prices[i] + "): ");
            qty[i] = sc.nextInt();
        }
    }

    // METHOD: Compute Amounts
    static double computeAmount(double[] prices, int[] qty, double[] amount) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            amount[i] = prices[i] * qty[i];
            total += amount[i];
        }
        return total;
    }

    // METHOD: Display Bill
    static void displayBill(String[] items, int[] qty, double[] amount, double total) {
        System.out.println("\n\t    Cassius Thundercock's Siomai House");
        System.out.println("\n************************************************************");
        System.out.println("PARTICULARS\t\tQUANTITY\tAMOUNT");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < items.length; i++) {
            System.out.printf("%-16s\t%-8d%.2f%n", items[i], qty[i], amount[i]);
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("TOTAL\t\t\t\t%.2f%n", total);
        System.out.println("************************************************************");
        System.out.println("\n\tTHANK YOU. COME AGAIN.");
    }
}
