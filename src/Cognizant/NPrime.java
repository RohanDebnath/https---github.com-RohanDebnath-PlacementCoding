import java.util.Scanner;

public class NPrime {
    void result(int a, int b)
    {
        int comma=0;
        for(int i=a;i<=b;i++)
        {
            int count=0;
            for(int j=2;j<=(i/2);j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==0){
            if(comma!=0)
            System.out.print(",");
            System.out.print(i +"");
            comma++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        NPrime obj = new NPrime();
        obj.result(a, b);
    }    
}
