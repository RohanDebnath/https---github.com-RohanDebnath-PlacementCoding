
import java.util.Scanner;

public class BubbleSortt {
    static int result(int arr[])
    {
        int c=0;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    arr[j]=arr[j]^arr[j+1];
                    arr[j+1]=arr[j]^arr[j+1];
                    arr[j]=arr[j]^arr[j+1];
                    c++;
                }
            }
        }
     return c;   
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(result(arr));
    }
}
