import java.util.Scanner;

public class maxTwoOccurance {

    int[] maxOccuranceNumber(int arr[]) {
        int num1 = 0, num2 = 0;
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }

            if (c > cnt1) {
                cnt2 = cnt1;
                num2 = num1;
                cnt1 = c;
                num1 = arr[i];
            } else if (c > cnt2 && c < cnt1) {
                cnt2 = c;
                num2 = arr[i];
            }
        }

        int[] result = { num1, num2 };
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Your elements are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        maxTwoOccurance m = new maxTwoOccurance();
        int[] maxOccurrenceNumbers = m.maxOccuranceNumber(arr);
        System.out.println(
                "Numbers with maximum occurrence: " + maxOccurrenceNumbers[0] + ", " + maxOccurrenceNumbers[1]);
    }
}
