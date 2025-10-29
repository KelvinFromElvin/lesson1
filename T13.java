import java.util.*;

public class T13 {
    public static void main(String[] args) {
        int sum = 0, c = 0, n, avg;

        String s = "";

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("Pleas enter your grades:");

        System.out.println("to stop please type exit");

        for (int watchDog = 0; watchDog < 1000; watchDog++) {
            try {

                s = scanner.next();

                if (s.equals("exit")) {
                    break;
                }

                n = Integer.parseInt(s);

                c++;

                sum += n;
            } catch (Exception e) {
                System.out.println("Please enter a valid number");
            }
        }

        avg = sum / c;

        if (avg >= 90) {
            s = "amazing";
        } else if (avg >= 70 && avg < 90) {
            s = "nice";
        } else {
            s = "you can do better";
        }

        System.out.println(s);

        scanner.close();
    }
}
