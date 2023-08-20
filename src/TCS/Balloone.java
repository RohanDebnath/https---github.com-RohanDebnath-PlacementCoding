import java.util.Scanner;

public class Balloone {
    static char result(char arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            int count=0;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j]==ch)
                count++;
            }
            if(count%2!=0)
            return ch;
        }
        return ' ';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        char[] ch = new char[n];
        for(int i=0;i<ch.length;i++)
        {
            ch[i]=sc.next().charAt(0);
        }
        System.out.println(result(ch));

    }
    
}
