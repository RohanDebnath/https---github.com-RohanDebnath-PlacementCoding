import java.util.Scanner;

public class MaxIndexProduct {
    int result(int arr[])
    {int val=0;
        for(int i=1;i<arr.length-1;i++)
        {
            if(arr[i-1]>arr[i] && arr[i+1]>arr[i] )
            {
                 val=(i-1)*(i+1);
            }
        }
        return val;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        MaxIndexProduct obj = new MaxIndexProduct();
       System.out.println("Answer" +obj.result(arr));
    }
}
