import java.util.Scanner;

public class CurrencyConverter 
{

    public static void main(String[] args) 
{
        // Conversion rates (for demonstration purposes)
        final double USD_TO_EUR_RATE = 0.93; // Example rate: 1 USD = 0.93 EUR
        final double EUR_TO_USD_RATE = 1 / USD_TO_EUR_RATE; // Inverse rate: 1 EUR = 1.075 USD
        
        Scanner scanner = new Scanner(System.in);
        
        // Display conversion options
        System.out.println("Currency Converter");
        System.out.println("1. USD to EUR");
        System.out.println("2. EUR to USD");
        System.out.print("Choose an option (1 or 2): ");
        int option = scanner.nextInt();
        
        // Process the user's choice
        double amount;
        double convertedAmount;
        switch (option) {
            case 1:
                // USD to EUR
                System.out.print("Enter the amount in USD: ");
                amount = scanner.nextDouble();
                convertedAmount = amount * USD_TO_EUR_RATE;
                System.out.printf("Converted amount: %.2f EUR\n", convertedAmount);
                break;
            case 2:
                // EUR to USD
                System.out.print("Enter the amount in EUR: ");
                amount = scanner.nextDouble();
                convertedAmount = amount * EUR_TO_USD_RATE;
                System.out.printf("Converted amount: %.2f USD\n", convertedAmount);
                break;
            default:
                System.out.println("Invalid option. Please choose 1 or 2.");
                break;
        }
        
        scanner.close();
    }
}
