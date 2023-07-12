import java.util.Scanner;

public class SecondMax {

    int result(int []arr)
    {
        int max=Integer.MAX_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                secondMax=max;
                max=arr[i];
            }else if(arr[i]>secondMax&& arr[i]!=max)
            {
                secondMax=arr[i];
            }
        }

        return secondMax;   
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements one by one");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        SecondMax obj=new SecondMax();
        System.out.println("Ans :"+obj.result(arr));
        
    }
}
