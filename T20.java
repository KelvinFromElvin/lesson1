import java.util.*;

public class T20 {
    public static int gcd(int number1, int number2) {
        int n1, n2;

        if (number1 <= number2) {
            n1 = number1;
            n2 = number2;
        } else {
            n1 = number2;
            n2 = number1;
        }

        if (n2 == 0 || n2 == 1) {
            return 1;
        }

        for (int i = n2; i > 1; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Please enter a number: ");

        System.out.println(gcd(scanner.nextInt(), scanner.nextInt()));

        scanner.close();
    }
}
