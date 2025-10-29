public class T42 {
    public static boolean isArr1InArr2(int[] arr1, int[] arr2) {
        boolean fndSameItem = false;

        for (int i = 0; i < arr1.length; i++) {
            fndSameItem = false;
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    fndSameItem = true;
                    break;
                }
            }

            if (!fndSameItem) {
                break;
            }
        }

        return fndSameItem;
    }

    public static boolean are2ArraysTheSame(int[] arr1, int[] arr2) {
        return isArr1InArr2(arr1, arr2) && isArr1InArr2(arr2, arr1);
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 1, 1, 2 };// { 4, 7, 1, 0, 12, 6 };
        int[] arr2 = new int[] { 1, 1, 1, 1 };// { 5, 71, 3, 4, 10, 1, 12 };

        System.out.println("are 2 arrays the same? " + are2ArraysTheSame(arr1, arr2));
    }
}
