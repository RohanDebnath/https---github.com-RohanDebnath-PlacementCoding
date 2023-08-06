import java.util.Scanner;

public class Lineequaion {
    static String result(float arr[])
    {
        float m1=(arr[2]-arr[0])/(arr[3]-arr[1]);
        float m2=(arr[5]-arr[3])/(arr[4]-arr[2]);
        if(m1==m2)
        {
            return "1x - 1y =0";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size by 2");
        int n=sc.nextInt();
        float arr[]=new float[n*2];
        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextFloat();
        }
        System.out.println(result(arr));
    }
    
}
