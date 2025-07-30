import java.util.Scanner;
public class Banking {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double balance = 0;
        int choice;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("*********************");
            System.out.println("WELCOME");
            System.out.println(".....................");
            System.out.println("1 Show balance");
            System.out.println("2 Withdraw Cash");
            System.out.println("3 Deposit Cash");
            System.out.println("4 EXIT");
            System.out.println(".....................");

            System.out.print("Enter your choice 1-4: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance= balance-=withdraw(balance);
                case 3 -> balance+=deposit();
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID CHOICE");
            }
        }
        System.out.println("***************************");
        System.out.println("Thank you have a nice day!");
        System.out.println("***************************");
        sc.close();
    }
    static void showBalance(double balance) {
        System.out.println("*********************");
        System.out.printf("$%2f\n", balance);
    }
    static  double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount= sc.nextDouble();
        if(amount < 0) {
            System.out.println("Amount can't be negative ");
            return 0;
        }
        else{
            return amount;
            }
    }
    static double withdraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn:");
        amount=sc.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT BALANCE");
            return 0;
        }
        else if(amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }
    }
}
