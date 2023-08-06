import java.util.Scanner;

public class ChangeFrequentCharacter {
    static String result(String str,char t)
    {
        char ch=' ';
        char res=' ';
        int max=0;
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                {
                    count++;
                }
            }   
            if(count>max)
            {
                max=count;
                res=ch;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==res)
            sb.append(t);
            else
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        char t=sc.nextLine().charAt(0);
        System.out.println(result(str,t));

    }
}
