import java.util.Scanner; // Import the Scanner class

public class T3 {
    public static void main(String[] args) {
        int n1, n2;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("enter n1");
        n1 = scanner.nextInt();

        System.out.println("enter n2");
        n2 = scanner.nextInt();

        System.out.println("Hekef: " + (Math.sqrt((n1 * n1) + (n2 * n2))));

        scanner.close();
    }
}
