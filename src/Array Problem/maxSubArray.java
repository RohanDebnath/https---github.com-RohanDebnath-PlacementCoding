import java.util.Scanner;

public class maxSubArray {

    int maxsubarraySolution(int arr[]) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);

        }
        return maxSum;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        maxSubArray obj = new maxSubArray();
        System.out.println(obj.maxsubarraySolution(arr));

    }

}
