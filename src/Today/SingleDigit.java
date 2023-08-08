import java.util.Scanner;

public class SingleDigit {
    static int result(int n)
    {
        int sum=0;
        if(n>0 && n<9)
        {
            return n;
        }
        else
        {
            while(n>0)
            {
            int digit=n%10;
            sum+=Math.pow(digit, 2);
            n/=10;
        }
    }
      return result(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(result(n));
    }
}
