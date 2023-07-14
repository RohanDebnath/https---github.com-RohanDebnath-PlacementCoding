import java.util.Scanner;

public class MissingNum {

    int result(int arr[])
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        for(int num:arr)
        {
            sum-=num;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of elements in the array");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter your elements now");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        MissingNum obj= new MissingNum();
        System.out.println( obj.result(arr));
    }
}
