import java.util.Scanner;

public class Activity_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lifestyles = {
            "SEDENTARY (SOMEWHAT INACTIVE)",
            "SOMEWHAT ACTIVE (EXERCISE OCCASIONALLY)",
            "ACTIVE (EXERCISE 3-4 DAYS A WEEK)",
            "HIGHLY ACTIVE (EXERCISE EVERYDAY)"
        };
        double[] multipliers = {1.20, 1.30, 1.40, 1.50};

        System.out.print("ENTER YOUR NAME          : ");
        String name = scanner.nextLine();

        System.out.print("ENTER YOUR AGE           : ");
        int age = scanner.nextInt();

        System.out.print("ENTER YOUR WEIGHT (lbs)  : ");
        double weight = scanner.nextDouble();

        System.out.print("ENTER YOUR HEIGHT (in)   : ");
        double height = scanner.nextDouble();

        System.out.print("ENTER YOUR GENDER        : ");
        String gender = scanner.next().trim().toLowerCase();

        double bmr;
        if (gender.equals("male") || gender.equals("m")) {
            bmr = 660 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        } else {
            bmr = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        }

        System.out.printf("YOUR BMR IS              : %.2f%n", bmr);

        System.out.println("\n--------------------------------------------");
        System.out.println("ENTER YOUR LIFESTYLE :");
        for (int i = 0; i < lifestyles.length; i++) {
            System.out.printf("%d. %s%n", i + 1, lifestyles[i]);
        }
        System.out.println("--------------------------------------------");

        System.out.print("\nENTER YOUR LIFESTYLE     : ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 4) {
            double newBmr = bmr * multipliers[choice - 1];
            System.out.printf("YOUR NEW BMR IS          : %.2f%n", newBmr);
        } else {
            System.out.println("Invalid choice. Please enter 1-4.");
        }

        scanner.close();

        System.out.println("\nProgrammer's Name: Elizander Aguila");
    }
}