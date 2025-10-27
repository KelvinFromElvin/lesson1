import java.util.*;

public class Targil1 {
    public static void main(String[] args) {
        int n1;
        double n2;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("enter number:");

        n1 = scanner.nextInt();

        System.out.println("enter double number:");

        n2 = scanner.nextDouble();

        if (n1 > 15) {
            n1 += 5;
        } else {
            n1 -= 4;
        }

        if (n2 < 10.8) {
            n2 -= 8;
        } else if (n2 > 17) {
            n2 += 1.8;
        }

        System.out.println("New n1: " + n1);
        System.out.println("New n2: " + n2);

        scanner.close();
    }
}
