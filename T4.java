
// Import the Scanner class
import java.util.*;

public class T4 {
    public static void main(String[] args) {
        int age, yearDelta;

        Calendar currentDate = Calendar.getInstance();

        yearDelta = 2040 - currentDate.getWeekYear();

        if (yearDelta <= 0) {
            System.out.println("the year you currently on is passed the year defined in the exersice");
        } else {

            Scanner scanner = new Scanner(System.in); // Create a Scanner object

            System.out.println("enter your age:");
            age = scanner.nextInt();

            if (age <= 0) {
                System.out.println("dude since when age <= 0?");
            } else {
                System.out.println("your age in 2040 will be: " + (age + yearDelta));
            }

            scanner.close();
        }
    }
}
