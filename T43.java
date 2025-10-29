import java.util.ArrayList;
import java.util.List;

public class T43 {
    public static double[] calcAvgOfItemsBetween2Arrays(int[] arr1, int[] arr2) {
        ArrayList<Double> arrList = new ArrayList<Double>();
        int[] longerArr = null;
        int startIdx = 0;

        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            arrList.add((double) ((arr1[i] + arr2[i]) / 2));
        }

        if (arr1.length < arr2.length) {
            longerArr = arr2;
            startIdx = arr1.length;
        } else if (arr1.length > arr2.length) {
            longerArr = arr1;
            startIdx = arr2.length;
        }

        if (longerArr != null) {
            for (; startIdx < longerArr.length; startIdx++) {
                arrList.add((double) longerArr[startIdx]);
            }
        }

        List<Double> list = arrList;
        return list.stream().mapToDouble(Double::doubleValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 5, 1, 1 };
        int[] arr2 = new int[] { 1, 1, 1, 1 };
        double[] arr3 = calcAvgOfItemsBetween2Arrays(arr1, arr2);

        for (int i = 0; i < arr3.length; i++) {

            System.out.println(arr3[i]);
        }
    }
}
