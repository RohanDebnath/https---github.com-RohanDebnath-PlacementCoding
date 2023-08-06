import java.util.Scanner;

public class ReverseaStringWordwise {
    static String result(String str)
    {
        String arr[]=str.split(" ");
        StringBuilder sb= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--)
        {
            sb.append(arr[i]);
            sb.append(" ");
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(result(str));
    }
}
