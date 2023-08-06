import java.util.Scanner;

public class oneZerolen {
    static String result(String input)
    {
        StringBuilder sb = new StringBuilder();
        String arr[]=input.split("0");
        for(int i=0;i<arr.length;i++)
        {
            String seg=arr[i];
            sb.append((char)(64+seg.length()));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String str=sc.nextLine();
     System.out.println(result(str));   
    }
    
}
