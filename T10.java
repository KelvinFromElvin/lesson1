import java.util.*;

public class T10 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.print("Please enter a number > 1k: ");

        n = scanner.nextInt();

        System.out.println(n > 1000 ? "success" : "failure");

        scanner.close();
    }
}
