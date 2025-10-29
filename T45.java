public class T45 {
    public static int[] countDigitsRepititionsInNumbersArr(int[] arr) {
        int[] repArr = new int[10];
        int n;

        for (int i = 0; i < arr.length; i++) {
            n = arr[i];
            if (n == 0) {
                repArr[0]++;
            }
            while (n > 0) {
                repArr[n % 10]++;
                n /= 10;
            }
        }

        return repArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4363, 12756, 1278, 9550 };
        int[] digitsRepArr = countDigitsRepititionsInNumbersArr(arr);

        System.out.print("number of reps: ");
        for (int i = 0; i < digitsRepArr.length; i++) {
            System.out.print(digitsRepArr[i] + " ");
        }
        System.out.println("");
    }
}
