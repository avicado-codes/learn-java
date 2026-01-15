package variables_datatypes_inputs;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        // Best Practice: Use ONE Scanner object for all inputs
        Scanner input = new Scanner(System.in);

        // 1. nextLine() - Strings
        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        // 2. nextInt() - Integers
        System.out.print("Enter your age: ");
        int userAge = input.nextInt();

        // 3. nextDouble() - Large Decimal Numbers
        System.out.print("Enter your income: ");
        double userIncome = input.nextDouble();

        // 4. nextFloat() - Small Decimal Numbers
        System.out.print("Enter a Floating Point Number: ");
        float userGivenFloat = input.nextFloat();

        // 5. nextLong() - Very Large Integers
        System.out.print("Enter a large number (Long): ");
        long userLong = input.nextLong();

        // 6. nextShort() - Small Integers
        System.out.print("Enter a small number (Short): ");
        short userShort = input.nextShort();

        // Close scanner to prevent memory leaks
        input.close();

        // --- OUTPUT ---
        System.out.println("\n--- User Details ---");
        System.out.println("Welcome " + userName);
        System.out.printf("Your age is: %d%n", userAge);
        System.out.printf("Your income is: %.2f%n", userIncome);
        System.out.println("Float value: " + userGivenFloat);
        System.out.println("Long value: " + userLong);
        System.out.println("Short value: " + userShort);
    }
}