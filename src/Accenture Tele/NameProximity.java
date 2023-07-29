import java.util.Scanner;

public class NameProximity {
    int result(String name1, String name2)
    {
        int sum=0;
        for(int i=0;i<(Math.min(name1.length(), name2.length()));i++)
        {
            if(name1.charAt(i)==name2.charAt(i))
            sum+=2;
        }
        int len=0;
        if(name1.length()>name2.length())
        {
        len=name1.length();
        int arr[]= new int[len];
        for(int i=0;i<name1.length();i++)
        {
            for(int j=0;j<name2.length();j++)
            {
                if(name1.charAt(i)==name2.charAt(j)&&(i!=j)&&arr[j]!=1)
                {
                    sum+=1;
                    arr[j]=1;
                }
            }
        }
        }
        else
        {
        len=name2.length();
        int arr[]= new int[len];
        for(int i=0;i<name2.length();i++)
        {
            for(int j=0;j<name1.length();j++)
            {
                if(name2.charAt(i)==name1.charAt(j)&&(i!=j)&&arr[j]!=1)
                {
                    sum+=1;
                    arr[j]=1;
                }
            }
        }

        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name1=sc.nextLine();
        String name2=sc.nextLine();
        NameProximity obj = new NameProximity();
       System.out.println("Answer"+ obj.result(name1, name2));

    }    
}
