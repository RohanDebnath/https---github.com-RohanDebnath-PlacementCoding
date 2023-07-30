import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {
    static String result(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        return "NO";
        char ch1[]=s1.toCharArray();
        char ch2[]=s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
         return "Yes";   
        }
        return "No";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(result(s1, s2));
    }    
}
