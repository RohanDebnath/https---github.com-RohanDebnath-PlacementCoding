import java.util.HashSet;
import java.util.Scanner;

public class StringPermutation {
     static int result(String str)
    {
        int len=str.length();
        int facto=0;
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            set.add(str.charAt(i));
        }
        for(int i=1;i<str.length();i++)
        {
            facto+=i;
        }
        if(len-set.size()!=0)
       return ((facto)/(len-set.size()));
       return facto;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(result(str));
    }
}
