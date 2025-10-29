import java.util.HashSet;
import java.util.Set;

public class T41 {
    public static int[] margeAllItems(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            set.add(arr2[j]);
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 4, 7, 1, 0, 12, 6 };
        int[] arr2 = new int[] { 5, 71, 3, 4, 10, 1, 12 };
        int[] arr3 = margeAllItems(arr1, arr2);

        System.out.println("the same values are: ");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println("");
    }
}
