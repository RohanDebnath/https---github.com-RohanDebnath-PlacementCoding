import java.util.Scanner;

class Compute {
    
        public void rotate(int arr[], int n)
        {
          int sol[]= new int[arr.length];
        sol[0]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++)
        {
            sol[i]=arr[i-1];
        }
        for(int i:sol)
        {
            System.out.print(i+" ");
        }
        }
    }
    public class Bamby {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n=sc.nextInt();
       int arr[]= new int[n];
       for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
       } 
    Compute obj = new Compute();
    obj.rotate(arr, n);
   
    }
    
}
