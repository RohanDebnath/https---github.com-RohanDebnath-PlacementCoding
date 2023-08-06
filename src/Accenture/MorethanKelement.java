/*
 Suppose the array contains values like {74, 85, 102, 99, 101, 56, 84} and the integer k is 2. 
 The method will return 99, the third greatest element, as there are only two 
 (according to the value of k) values greater than 99 (101 and 102).
 */

import java.util.Arrays;
import java.util.Scanner;

public class MorethanKelement {
    static int[] result(int arr[],int k)
    {
       Arrays.sort(arr);
       int newArray[]=new int[k];
       int index=0;
       for(int i=arr.length-1;i>arr.length-k-1;i--)
       {
        newArray[index++]=arr[i];
       }
       Arrays.sort(newArray);
       return newArray;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter k value");
        int k=sc.nextInt();
        int array[]=result(arr,k);
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
       
    }
    
}
