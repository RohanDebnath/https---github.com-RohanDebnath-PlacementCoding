import java.util.Scanner;

public class LengthWordCount {
    static String resut(String str,int k)
    {
        String charArray[]=str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<k;i++)
        {
            sb.append(charArray[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int k=sc.nextInt();
        System.out.println(resut(str,k));
    }
}
