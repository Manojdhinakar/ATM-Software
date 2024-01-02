package AtmSoftware;

public class ATM {
    private double balance;

    // Constructor to initialize the balance
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to display the balance
    public void displayBalance() {
        System.out.println("Current Balance: INR" + balance);
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("INR" + amount + " deposited successfully.");
    }

    // Method to withdraw money
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("INR" + amount + " withdrawn successfully.");
        }
    }
}

