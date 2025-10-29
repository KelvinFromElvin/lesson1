import java.util.*;

public class T12 {
    public static void main(String[] args) {
        int[] narr = new int[3];

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        for (int i = 0; i < narr.length; i++) {

            System.out.print("Please a " + (i + 1) + " number: ");

            narr[i] = scanner.nextInt();
        }

        if (narr[0] - narr[1] == narr[1] - narr[2]) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        scanner.close();
    }
}
