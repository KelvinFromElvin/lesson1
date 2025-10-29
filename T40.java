import java.util.HashSet;
import java.util.Set;

public class T40 {
    public static int[] findSame(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    set.add(arr1[i]);
                }
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 4, 7, 1, 0, 12, 6 };
        int[] arr2 = new int[] { 5, 71, 3, 4, 10, 1, 12 };
        int[] arr3 = findSame(arr1, arr2);

        System.out.println("the same values are: ");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println("");
    }
}
