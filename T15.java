import java.util.*;

public class T15 {
    public static void main(String[] args) {
        int n, prevN = -1;
        boolean isItValid = true;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Please enter 3 digit number: ");

        n = scanner.nextInt();

        if (n > 99 && n < 1000) {
            while (n > 0) {
                if (prevN == -1) {

                    prevN = n % 10;

                    n /= 10;

                    continue;
                }

                if (Math.abs(prevN - (n % 10)) != 1) {
                    isItValid = false;

                    break;
                }

                prevN = n % 10;

                n /= 10;
            }
        }

        System.out.println(isItValid);

        scanner.close();
    }
}
