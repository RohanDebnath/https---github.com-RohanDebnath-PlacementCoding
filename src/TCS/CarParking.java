import java.util.Scanner;

public class CarParking {
    static int result(int arr[][],int r, int c)
    {
        int max=0,val=0;
        for(int i=0;i<r;i++)
        {
            int count=0;
            for(int j=0;j<c;j++)
            {
                if(arr[i][j]==1)
                count++;
            }
            if(count>max)
            {
            max=count;
                val=i;
            }
        }
      return val+1;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
        for(int j=0;j<c;j++)
        {
        arr[i][j]=sc.nextInt();
        }
    }
    System.out.println(result(arr,r,c));
}    
}
