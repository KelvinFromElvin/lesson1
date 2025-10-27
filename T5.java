
// Import the Scanner class
import java.util.*;

public class T5 {
    public static void main(String[] args) {
        int sum = 0;
        int lengthOfInputs = 4;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        for (int i = 0; i < lengthOfInputs; i++) {
            System.out.println("enter a number:");
            sum += scanner.nextInt();
        }

        System.out.println("the avg is: " + (sum / lengthOfInputs));

        scanner.close();
    }

}
