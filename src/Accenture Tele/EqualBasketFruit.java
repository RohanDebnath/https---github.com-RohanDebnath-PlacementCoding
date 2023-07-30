import java.util.Scanner;

public class EqualBasketFruit {
    static int result(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        sum/=arr.length;
        int tot=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>sum)
            {
                int t=arr[i]-sum;
                tot+=t;
            }
        }
        return tot;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    System.out.println(result(arr));
}    
}
