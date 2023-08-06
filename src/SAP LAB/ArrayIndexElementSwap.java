import java.util.Scanner;

public class ArrayIndexElementSwap {
    static int[] result(int arr[]) {
        int n = arr.length;
        int[] swappedArray = new int[n];

        for (int i = 0; i < n; i++) {
            int element = arr[i];
            if (element >= 0 && element < n) {
                swappedArray[element] = i;
            }
        }
        return swappedArray;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] resultArray = result(arr);
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(" " + resultArray[i]);
        }
    }
}
