import java.util.Scanner;

public class Activity_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===============================================");
        System.out.println("           🧍 BODY MASS INDEX (BMI) CHECKER     ");
        System.out.println("===============================================");

        // Input Section
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter your height (feet inches): ");
        int feet = input.nextInt();
        int inches = input.nextInt();

        // Conversion
        double weightInKg = weightInPounds / 2.2;
        int totalInches = (feet * 12) + inches;
        double heightInMeters = totalInches * 0.0254;

        // BMI Calculation
        double bmi = weightInKg / (heightInMeters * heightInMeters);

        // Determine Category
        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi < 25) {
            category = "Normal weight";
        } else if (bmi < 30) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        // Output Section
        System.out.println("\n-----------------------------------------------");
        System.out.println("                 📊 RESULTS                     ");
        System.out.println("-----------------------------------------------");
        System.out.printf("Weight (kg): %.2f%n", weightInKg);
        System.out.printf("Height (m): %.2f%n", heightInMeters);
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Health Category: " + category);
        System.out.println("-----------------------------------------------");

        // Final Message
        System.out.println("💡 Tip: Maintain a balanced diet and stay active!");
        System.out.println("===============================================");

        input.close();

        System.out.println("Programmer's Name: Elizander Aguila | DIT 2-3");
    }
}
