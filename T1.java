import java.util.Scanner; // Import the Scanner class

public class T1 {
    public static void main(String[] args) {
        int radius;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("enter radius");

        radius = scanner.nextInt();

        System.out.println("Hekef:" + (float) (2 * Math.PI * radius));
        System.out.println("Shetah:" + (float) (Math.PI * radius * radius));

        scanner.close();
    }
}
