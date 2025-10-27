import java.util.Scanner; // Import the Scanner class

public class T2 {
    public static void main(String[] args) {
        int w, h;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        System.out.println("enter w");
        w = scanner.nextInt();

        System.out.println("enter h");
        h = scanner.nextInt();

        System.out.println("Hekef: " + ((w * 2) + (h * 2)));
        System.out.println("Shetah: " + (w * h));

        scanner.close();
    }
}
