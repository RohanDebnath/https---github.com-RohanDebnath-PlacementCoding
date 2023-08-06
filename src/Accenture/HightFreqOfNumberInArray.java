/*
 If there are one or more such numbers, give the smaller one as output.
Input:
2 4 5 2 3 2 4
1 1 1 1 1 1 1 1 1 1
Output:
2
1
 */

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class HightFreqOfNumberInArray {
    static int result(int arr[])
    {
        Arrays.sort(arr);
        int MaxElement=arr[arr.length-1];
        int newArray[]=new int[MaxElement+1];
        for(int i=0;i<arr.length;i++)
        {
            newArray[arr[i]]++;
        }
        int MaxValue=0;
        for(int i=0;i<newArray.length;i++)
        {
            if(newArray[i]>MaxValue)
            {
                MaxValue=i;
            }
            else if(newArray[i]==MaxValue)
            {
                MaxValue=Math.min(MaxValue, i);
            }
        }
        return MaxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(result(arr));
    }
    
}
