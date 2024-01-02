package AtmSoftware;

import java.util.Scanner;

// Main class to run the ATM application
public class Accountdisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creating an instance of the ATM with an initial balance of $1000
        ATM atm = new ATM(1000);

        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter your choice , Only Numbers Please: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    atm.displayBalance();
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: INR");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: INR");
                    double withdrawalAmount = scanner.nextDouble();
                    atm.withdraw(withdrawalAmount);
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Thank you!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}