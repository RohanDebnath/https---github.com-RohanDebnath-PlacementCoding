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
