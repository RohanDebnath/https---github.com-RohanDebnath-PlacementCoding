import java.util.Scanner;

public class ShiftZerostoFront {
    int[] result(int arr[]) {
        
        int k=arr.length-1;
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]!=0)
            {
                arr[k]=arr[i];
                k--;
            }
        }
        while(k>=0)
        {
            arr[k]=0;
            k--;
        }
        return arr;

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements now");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ShiftZerostoFront obj = new ShiftZerostoFront();
        arr = obj.result(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
