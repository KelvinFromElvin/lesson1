
// Import the Scanner class
import java.util.*;

// floor += 1
// km += 5

public class T6 {

    public static int calcShippingCoast(int itemWheight, int clientDistance) {
        // assuming the args ok

        return itemWheight * 5 + clientDistance;
    }

    public static void main(String[] args) {
        int itemWheight, itemPrice, clientDistance;

        Scanner scanner = new Scanner(System.in); // Create a Scanner object

        // getting data from user

        System.out.println("Enter item weight");

        itemWheight = scanner.nextInt();

        System.out.println("Enter item price");

        itemPrice = scanner.nextInt();

        System.out.println("Enter distance");

        clientDistance = scanner.nextInt();

        // calc distance add
        // System.out.println("Total price:" + (1.1 * (6*itemWheight + 5*clientDistance)
        // + itemPrice));
        System.out.println("Item price: " + itemPrice);
        System.out.println("shipping coast: " + calcShippingCoast(itemWheight, clientDistance));
        System.out.println("Tip: " + (calcShippingCoast(itemWheight, clientDistance) / 10));

        scanner.close();
    }

}
