import java.util.Arrays;
import java.util.Scanner;

public class array {
    static void rearrangeMax(int[] arr) {
       int newArr[]=new int[(arr.length*2)];
       System.out.println(newArr.length);
       int index=0;
       for(int i=0;i<arr.length;i++)
       {
        int val=arr[i];
        while(val>0)
        {
            int digit=val%10;
            newArr[index++]=digit;
            val/=10;
        }
       }
       Arrays.sort(newArr);
        System.out.println("Maximum number after rearrangement: ");
        for (int num : newArr) {
            System.out.print(num);
        } 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        rearrangeMax(arr);

       
    }
}
