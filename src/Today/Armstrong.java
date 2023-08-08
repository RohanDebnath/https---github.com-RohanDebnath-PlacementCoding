import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        int le=0;
        while(num>0)
        {
            int d=num%10;
            le++;
            num/=10;
        }
        num=n;
         while(num>0)
        {
            int d=num%10;
            sum+=Math.pow(d, le);
            num/=10;
        }
        System.out.println(n==sum);
    }    
}
