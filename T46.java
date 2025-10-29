import java.util.*;

public class T46 {
    public static int removeDigitFromNumber(int number, int numberToRemove) {
        int newNumber = 0, revertBack = 0;

        int digit;

        while (number > 0) {
            digit = number % 10;

            if (digit == numberToRemove) {
                number /= 10;
                continue;
            }

            newNumber *= 10;
            newNumber += digit;

            number /= 10;
        }

        while (newNumber > 0) {
            revertBack *= 10;

            revertBack += newNumber % 10;

            newNumber /= 10;
        }

        return revertBack;
    }

    public static void main(String[] args) {
        int n, numberToRemove;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Please enter a number: ");

        n = scanner.nextInt();

        System.out.print("Please enter a digit to remove: ");

        numberToRemove = scanner.nextInt() % 10;

        System.out.println("The new number is: " + removeDigitFromNumber(n, numberToRemove));

        scanner.close();
    }
}
