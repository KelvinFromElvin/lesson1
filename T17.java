import java.util.*;

public class T17 {
    public static void main(String[] args) {
        int n, c = 0, watchDog = 1000;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Please enter numbers, when you will enter 5 parring numbers the prog will end");

        for (int i = 0; i < watchDog; i++) {
            n = scanner.nextInt();

            if (n % 2 == 0) {
                c++;
            }

            if (c == 5) {
                break;
            }
        }

        scanner.close();
    }
}
