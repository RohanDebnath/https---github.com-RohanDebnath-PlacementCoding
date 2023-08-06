/*
 Input:
4 // Size of 1st array
1 2 3 6 // Elements of 1st array
3 // Size of 2nd array
4 5 7 // Elements of 2nd array

Output:
1
2
3
4
5
6
7
 */

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    static int[] result(int arr1[], int arr2[])
    {
        int len=arr1.length+arr2.length;
        int newArray[]=new int[len];
        int index=0;
        for(int i=0;i<arr1.length;i++)
        {
            newArray[index++]=arr1[i];
        }
        int z=0;
        for(int i=arr1.length;i<len;i++)
        {
            newArray[index++]=arr2[z++];
        }
        Arrays.sort(newArray);

        return newArray;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[]=new int[n];
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter details of Array 2 now");
        int n2=sc.nextInt();
        int arr2[]=new int[n2];
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=sc.nextInt();
        }
        int array[]=result(arr1, arr2);
        // for(int i=0;i<array.length;i++)
        // {
        //     System.out.print(array[i]+" ");
        // }
        for(int var:array)
        {
            System.out.print(var+" ");
        }
    }
}
