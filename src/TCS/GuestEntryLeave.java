//doubt
import java.util.Scanner;

public class GuestEntryLeave {
    static int result(int E[],int L[] )
    {
        int max=0;
        for(int i=0;i<E.length;i++)
        {
            max=Math.abs(max+E[i]-L[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int E[]=new int[n];
        int L[]=new int[n];
        for(int i=0;i<n;i++)
        {
            E[i]=sc.nextInt();
            L[i]=sc.nextInt();
        }
        System.out.println(result(E, L));
    }    
}
