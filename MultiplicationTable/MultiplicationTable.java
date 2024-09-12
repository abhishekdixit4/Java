import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to display its multiplication table: ");
        int number = scanner.nextInt();

        // Initialize a counter variable
        int i = 1;

        // Print the multiplication table using a while loop
        System.out.println("Multiplication table for " + number + ":");
        while (i <= 10) {
            System.out.println(number + " x " + i + " = " + (number * i));
            i++;
        }

        // Close the scanner
        scanner.close();
    }
}