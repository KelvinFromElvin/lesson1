import java.util.*;

public class T19 {
    public static void main(String[] args) {
        int n, watchDog = 10;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Please enter 2 digit number that all his digis are the same");

        for (int i = 0; i < watchDog; i++) {
            n = scanner.nextInt();

            if (n < 10 || n > 99) {
                continue;
            }

            if (n % 10 == ((n / 10) % 10)) {
                break;
            }
        }

        scanner.close();
    }
}
