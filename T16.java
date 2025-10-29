import java.util.*;

public class T16 {
    public static void main(String[] args) {
        int salary = 12000, sellingPoint = 7000, n;
        double bonus = 0;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Please enter total selling amount: ");

        n = scanner.nextInt();

        if (n >= sellingPoint) {
            bonus = salary * 0.75;
        } else if (n >= sellingPoint / 2) {
            bonus = 2000.0;
        }

        System.out.println("your bonus is: " + bonus);

        scanner.close();
    }
}
