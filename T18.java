import java.util.*;

public class T18 {
    public static void main(String[] args) {
        int n, c = 0, watchDog = 10;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Please enter numbers, when you will enter 5 parring numbers the prog will end");

        for (int i = 0; i < watchDog; i++) {
            n = scanner.nextInt();

            if (n % 3 == 0) {
                c++;
            }
        }

        System.out.println("the number of numbers that / 3 without a reminder is: " + c);

        scanner.close();
    }
}
