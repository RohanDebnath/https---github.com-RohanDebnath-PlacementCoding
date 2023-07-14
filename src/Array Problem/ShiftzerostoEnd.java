import java.util.Scanner;

public class ShiftzerostoEnd {

    int[] result(int arr[])
    {
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[k]=arr[i];
                k++;
            }
        }
        int z=arr.length-k;
        while(z>0)
        {
            arr[k]=0;
            k++;
            z--;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements now");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        ShiftzerostoEnd obj=new ShiftzerostoEnd();
        arr=obj.result(arr);
         for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
