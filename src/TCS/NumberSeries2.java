/*
Consider the following series: 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 …

This series is a mixture of 2 series – all the odd terms in this series form a geometric series and all the even terms form yet another geometric series. Write a program to find the Nth term in the series.

The value N in a positive integer that should be read from STDIN. The Nth term that is calculated by the program should be written to STDOUT. Other than value of n th term,no other character / string or message should be written to STDOUT. For example , if N=16, the 16th term in the series is 2187, so only value 2187 should be printed to STDOUT.

You can assume that N will not exceed 30. */

import java.util.Scanner;

public class NumberSeries2 {
    static int result(int n)
    {
        int ser1=1,ser2=1;
        for (int i = 3; i <=n; i++) {
            if(i%2==0)
            {
                ser1*=3;
                if(i==n)
                return ser1;
            }
            else
            {
                ser2*=2;
                if(i==n)
                return ser2;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(result(n));
    }
    
}
