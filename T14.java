import java.util.*;

public class T14 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Please enter 2 digit number: ");

        n = scanner.nextInt();

        if (n > 9 && n < 100) {

            n = (n % 10) + ((n / 10) % 10);

            System.out.println("the sum of a digits is: " + n);

        }

        scanner.close();
    }
}
