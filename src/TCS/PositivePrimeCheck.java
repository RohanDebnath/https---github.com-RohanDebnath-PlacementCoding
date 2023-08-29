/*
 Ques. Write a code to check whether no is prime or not. Condition use function check() to find whether entered no is positive or negative ,if negative then enter the no, And if yes pas no as a parameter to prime() and check whether no is prime or not?

Whether the number is positive or not, if it is negative then print the message “please enter the positive number”
It is positive then call the function prime and check whether the take positive number is prime or not. 
*/
import java.util.Scanner;

public class PositivePrimeCheck {
    static boolean prime(int n)
    {
        int count=0;
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            count++;
        }
        if(count==0)
        return true;
        return false;
    }
    static boolean check(int n)
    {
        return n<0;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(check(n))
        System.out.println("Please Enter positive number");
        else
        System.out.println(prime(n));
    }
}
