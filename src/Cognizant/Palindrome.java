import java.util.Scanner;

public class Palindrome {
    String result(int num)
    {
        int temp=num,z=0;
        while(temp>0)
        {
            int d=temp%10;
            z=z*10+d;
            temp/=10;
        }
        if(z==num)
        return "Palindrome";

        return "Not a Palindrome";
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        Palindrome obj = new Palindrome();
     System.out.println(obj.result(num));

    }  
}
