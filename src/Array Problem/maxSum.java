//Maximum sum so that No two element can be adjacent

import java.util.Scanner;

public class maxSum {

    int result(int[] nums) {
        int sum = 0;
        int sumCount = 0;

        for (int i = 0; i < nums.length; i++) {
            int tempSum = sumCount + nums[i];
            sumCount = sum;
            sum = Math.max(tempSum, sum);
        }

        return sum;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Array Element");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter your elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxSum obj = new maxSum();
        System.out.println(obj.result(arr));
        obj.result(arr);
    }

}
