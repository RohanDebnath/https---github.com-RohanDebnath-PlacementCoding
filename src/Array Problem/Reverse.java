import java.util.Scanner;

public class Reverse {

    int[] reversedarray(int arr[], int n)
    {
        for(int i=0;i<n/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;

        }
        return arr;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Array Elements");
        n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnts now");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Reverse obj= new Reverse();

       arr=( obj.reversedarray(arr,n));
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
