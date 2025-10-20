import java.util.Scanner;

public class Midterms_1stSem {
    public static void main(String[] args) {
        System.out.println("\nMidterms 1st Sem: Computer Programming 3\n");
        Scanner scanner = new Scanner(System.in);

        // Switch Case Statement that Computes employee's end-of year bonus
        System.out.print("Employee Name   : ");
        String employeeName = scanner.nextLine();
        System.out.print("Employee Salary : $");
        double salary = scanner.nextDouble();
        System.out.print("Employee Rating : ");
        int rating = scanner.nextInt();

        // Calculate bonus based on rating
        double bonus;
        switch (rating) {
            case 1:
                bonus = 0.25;
                break;
            case 2:
                bonus = 0.15;
                break;
            case 3:
                bonus = 0.10;
                break;
            default:
                bonus = 0;
        }

        System.out.println("Employee Bonus  : $" + (salary * bonus));
        System.out.println("\nProgrammer's Name: Elizander Aguila");
    }
}
