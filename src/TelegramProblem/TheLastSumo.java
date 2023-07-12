import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TheLastSumo {

    void result(int arr[]) {

        for(int i=0;i<arr.length;i++)
        {
            
        }
        
        
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        TheLastSumo obj = new TheLastSumo();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        obj.result(arr);
    }
}
