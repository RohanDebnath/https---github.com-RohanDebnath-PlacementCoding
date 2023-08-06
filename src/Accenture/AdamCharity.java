/*
 each day he will give i^2 rs to charity
 */

import java.util.Scanner;

public class AdamCharity {
    static int result(int num)
    {
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum+=Math.pow(i,2);
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(result(n));
    }
}
