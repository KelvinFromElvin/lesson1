import java.util.*;

public class T11 {
    public static void main(String[] args) {
        int n = 0;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        for (int i = 0; i < 3; i++) {

            System.out.print("Please a " + (i + 1) + " price: ");

            n += scanner.nextInt();
        }

        if (n > 500) {
            n -= (n * 0.1);
        }

        System.out.println("Total to pay is: " + n);

        scanner.close();
    }
}
