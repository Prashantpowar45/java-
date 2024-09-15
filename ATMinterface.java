import java.util.Scanner;

public class ATM {
    private double balance;
    private boolean isLoggedIn;
    
    public ATM() {
        this.balance = 1000.00; // Initial balance
        this.isLoggedIn = false;
    }
    
    public void login() 
{
        // For simplicity, we assume the login is always successful
        this.isLoggedIn = true;
        System.out.println("Login successful.");
    }
    
    public void logout() {
        this.isLoggedIn = false;
        System.out.println("Logged out successfully.");
    }
    
    public void checkBalance() {
        if (isLoggedIn) {
            System.out.printf("Your current balance is: $%.2f%n", balance);
        } else {
            System.out.println("Please log in first.");
        }
    }
    
    public void withdraw(double amount) {
        if (isLoggedIn) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("You have withdrawn: $%.2f%n", amount);
                System.out.printf("Your new balance is: $%.2f%n", balance);
            } else if (amount <= 0) {
                System.out.println("Invalid amount. Please enter a positive value.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Please log in first.");
        }
    }
    
    public void deposit(double amount) {
        if (isLoggedIn) {
            if (amount > 0) {
                balance += amount;
                System.out.printf("You have deposited: $%.2f%n", amount);
                System.out.printf("Your new balance is: $%.2f%n", balance);
            } else {
                System.out.println("Invalid amount. Please enter a positive value.");
            }
        } else {
            System.out.println("Please log in first.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Login");
            System.out.println("2. Check Balance");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Logout");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    atm.login();
                    break;
                case 2:
                    atm.checkBalance();
                    break;
                case 3:
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 4:
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 5:
                    atm.logout();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
        
        scanner.close();
    }
}
