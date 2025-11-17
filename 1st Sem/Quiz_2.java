import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==================== PROGRAM 1: MyJava Coffee Outlet ====================
        System.out.println("=== MYJAVA COFFEE OUTLET ===");
        char coffeeChoice;

        do {
            System.out.print("NUMBER OF BAGS ORDERED : ");
            int bags = sc.nextInt();

            double pricePerBag = 5.50;
            double totalCost = bags * pricePerBag;

            double discountPercent;
            if (bags <= 25)          discountPercent = 0.05;
            else if (bags <= 50)     discountPercent = 0.06;
            else if (bags <= 100)    discountPercent = 0.07;
            else if (bags <= 150)    discountPercent = 0.08;
            else if (bags <= 200)    discountPercent = 0.09;
            else                     discountPercent = 0.10;

            double discountAmount = totalCost * discountPercent;
            double finalCharge = totalCost - discountAmount;

            System.out.printf("TOTAL COST             : $ %.2f%n", totalCost);
            System.out.printf("DISCOUNT               : $ %.3f%n", discountAmount);
            System.out.printf("YOUR TOTAL CHARGE IS   : $ %.3f%n", finalCharge);

            System.out.print("\nPROCESS ANOTHER? (Y/N): ");
            coffeeChoice = sc.next().toUpperCase().charAt(0);
            System.out.println();
        } while (coffeeChoice == 'Y');

        System.out.println("Programmer's Name: Elizander Aguila | DIT 2-3");
        System.out.println();

        // ==================== PROGRAM 2: Employee Bonus Program ====================
        System.out.println("=== EMPLOYEE BONUS PROGRAM ===");
        System.out.println();

        int[] serviceYears = {20, 25, 30, 35};
        double[] bonusAmount = {20000.00, 25000.00, 30000.00, 35000.00};

        char bonusChoice;

        do {
            System.out.print("EMPLOYEE NUMBER     : ");
            int empNumber = sc.nextInt();

            System.out.print("EMPLOYEE NAME       : ");
            sc.nextLine(); // consume newline
            String empName = sc.nextLine().trim(); // allows full name with spaces

            System.out.print("YEARS IN SERVICE    : ");
            int years = sc.nextInt();

            String bonusDisplay = " INVALID INPUT";
            for (int i = 0; i < serviceYears.length; i++) {
                if (years == serviceYears[i]) {
                    bonusDisplay = String.format("%,10.2f", bonusAmount[i]); // right-aligned with comma
                    break;
                }
            }

            System.out.println("BONUS               :" + bonusDisplay);

            System.out.print("\nPROCESS ANOTHER (Y or N)? : ");
            bonusChoice = Character.toUpperCase(sc.next().charAt(0));

            System.out.println();
        } while (bonusChoice == 'Y');

        System.out.println("Programmer's Name: Elizander Aguila | DIT 2-3");
        System.out.println();

        sc.close();
    }
}