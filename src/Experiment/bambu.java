import java.util.Scanner;

public class bambu {

    static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static int result(String n) {
        int arr[] = new int[n.length()];
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            int digit = Character.getNumericValue(n.charAt(i)); // 1 -> 2 -> 1 -> 0
            if (digit >= 0 && digit <= n.length()) {
                arr[digit]++;                                   // index no 1 , 2 , 1
                print(arr);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                count++;        // 3
            }
        }
        for (int i = 0; i < arr.length; i++) {
            int digit = Character.getNumericValue(n.charAt(i));
            if (digit != arr[i])
                return 0;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(result(str));
    }
}
