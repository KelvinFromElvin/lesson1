public class T44 {
    public static int[] shiftToRight(int[] arrToShift) {
        // 1,2,3 - arrToShift
        // 3,1,2 - arr
        int[] arr = new int[arrToShift.length];
        for (int i = 1; i < arrToShift.length; i++) {
            arr[i] = arrToShift[i - 1];
        }
        arr[0] = arrToShift[arrToShift.length - 1];

        return arr;
    }

    public static int[] shiftToLeft(int[] arrToShift) {
        // 1,2,3 - arrToShift
        // 2,3,1 - arr
        int[] arr = new int[arrToShift.length];
        for (int i = 0; i < arrToShift.length - 1; i++) {
            arr[i] = arrToShift[i + 1];
        }
        arr[arr.length - 1] = arrToShift[0];

        return arr;
    }

    public static int[] shiftArray(int[] arr, boolean shiftToLeft, int numberOfShifts) {
        int[] shiftedArr = arr;

        for (int i = 0; i < numberOfShifts; i++) {
            if (shiftToLeft) {
                shiftedArr = shiftToLeft(shiftedArr);
            } else {
                shiftedArr = shiftToRight(shiftedArr);
            }
        }

        return shiftedArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3 };
        int[] shiftedArr = shiftArray(arr, true, 3);

        System.out.print("shifted arr: ");
        for (int i = 0; i < shiftedArr.length; i++) {
            System.out.print(shiftedArr[i] + " ");
        }
        System.out.println("");
    }
}
