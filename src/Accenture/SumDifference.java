import java.util.Scanner;

public class SumDifference {
    int result(int n, int m)
    {
        int sum1=0,sum2=0;
        for(int i=1;i<=m;i++)
        {
            if(i%n==0)
            sum1+=i;
            else
            sum2+=i;
        }
        return sum2-sum1;

    }
    public static void main(String[] args) {
        int m,n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        SumDifference obj= new SumDifference();
        System.out.println(obj.result(n, m));
    }
}
