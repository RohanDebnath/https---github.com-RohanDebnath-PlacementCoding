import java.util.Scanner;

class Ayantika
{
   static int result(int[] element, int num)
    {
        int count=0;
        for(int i=0;i<element.length;i++)
        {
            if(num>element[i])
            {
                count++;
            }
        }
        return count;
    }   
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++)
    {
        arr[i]=sc.nextInt();
    }
    int num=sc.nextInt();
    System.out.println(result(arr, num));

}
}