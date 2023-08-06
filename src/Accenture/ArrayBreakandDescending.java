/*
4
34 79 58 64
98765443
 */
import java.util.Arrays;
import java.util.Scanner;

public class ArrayBreakandDescending {
    static String result(int arr[])
    {
        int newArr[]=new int[arr.length*2];
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
        StringBuilder sb= new StringBuilder();
        for(int i=newArr.length-1;i>=0;i--)
        {
            sb.append(newArr[i]);
        }
        return sb.toString();
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println(result(arr));
}    
}
