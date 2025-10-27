import java.util.*;

public class T9 {
    public static void main(String[] args) {
        int n;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        n = scanner.nextInt();

        System.out.println(n % 10);

        scanner.close();
    }
}
