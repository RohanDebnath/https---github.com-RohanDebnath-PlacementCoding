import java.util.Scanner;

public class NivenNumber {
    int result(int n)
    {
        int sum=0;
        int k=n;
        while(k>0)
        {
            int d=k%10;
            sum+=d;
            k/=10;
        }
        if(n%sum==0)
        return (n/sum);

        return 0;
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    NivenNumber obj = new NivenNumber();
    System.out.println("Answer:"+obj.result(n));
}    
}
