import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           int choice;
        while (true) {
            System.out.println(" Choose the conversion method: ");
            System.out.println(" Enter 1 if C to F ");
            System.out.println(" Enter 2 if F to C ");
            if (!sc.hasNextInt())
            {
                System.out.println(" invalid input. Enter the valid input 1 or 2 ");
                sc.next();
                continue;
            }
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.println("Enter the temperature in C: ");
                double C = sc.nextDouble();
                double F = (C * 9 / 5) + 32;
                System.out.println(" Temperature in F " + F);
            } else if (choice == 2) {
                System.out.println("Enter temperature in F: ");
                double F = sc.nextDouble();
                double C = (F - 32) * 5 / 9;
                System.out.println(" Temperature in C " + C);
            } else {
                System.out.println(" Invalid input. Enter a valid input 1 or 2 ");
                continue;
            }
            break;
        }

            sc.close();

    }
}
