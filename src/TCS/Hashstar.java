/*
  Problem Statement – Given a string S(input consisting) of ‘*’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘*’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘*’ and ‘#’ are equal. The ‘*’ and ‘#’ can be at any position in the string.
Note : The output will be a positive or negative integer based on number of ‘*’ and ‘#’ in the input string.

(*>#): positive integer
(#>*): negative integer
(#=*): 0
Example 1:
Input 1:

###***   -> Value of S
Output :

0   → number of * and # are equal
*/
import java.util.Scanner;

public class Hashstar {
    static int result(String str)
    {
        int hash=0,star=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='*')
            star++;
            else
            hash++;
        }
        if(hash==star)
        return 0;
        else if(hash>star)
        return -1;
        return 1;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str=sc.nextLine();
    System.out.println(result(str));
}    
}
