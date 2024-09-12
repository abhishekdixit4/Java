import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        
        System.out.print("Enter the annual interest rate (in %): ");
        double annualRate = scanner.nextDouble();

        
        double rate = annualRate / 100;

        
        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int timesCompounded = scanner.nextInt();

        
        System.out.print("Enter the number of years the money is invested for (t): ");
        int years = scanner.nextInt();

        
        double amount = principal * Math.pow((1 + rate / timesCompounded), timesCompounded * years);

        
        System.out.printf("The amount of money accumulated after %d years is: %.2f\n", years, amount);

        scanner.close();
    }
}
