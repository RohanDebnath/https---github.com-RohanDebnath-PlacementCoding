import java.util.Scanner;

public class StringIncrement {
    String result(String str)
    {
        String strs[]=str.split(" ");
        //int increment=strs.length+1;
        StringBuilder sb = new StringBuilder();
        int k=0;
        for(int i=0;i<str.length();i++)
        {
            char ch= str.charAt(i);
            if(ch==' ')
            {
              sb.append(ch);
              ++k;
            }else{
                int increment=strs[k].length();
            char incCh= (char) ( ch+increment);
            if(incCh>'z')
            {
                int count =incCh-'z';
                sb.append((char) ('a'+count-1));
            }else
            {
                sb.append(incCh);
            }

        }}
        return sb.toString();

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        StringIncrement obj = new StringIncrement();
        System.out.println(obj.result(str));
    }
}
