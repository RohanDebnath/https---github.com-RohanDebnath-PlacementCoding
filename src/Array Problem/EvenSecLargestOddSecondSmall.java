import java.util.Arrays;
import java.util.Scanner;

public class EvenSecLargestOddSecondSmall {
    static int result(int arr[]) {
        Arrays.sort(arr);
        int Odd_2nd_small = 0;
        int Even_2nd_largest = 0;

        int countOdd = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                countOdd++;
                if (countOdd == 2) {
                    Odd_2nd_small = num;
                    break;
                }
            }
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                Even_2nd_largest = arr[i];
                    break;
                }
            }
        

        return Odd_2nd_small + Even_2nd_largest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(result(arr));
    }
}
