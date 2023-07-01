import java.util.Scanner;

public class maxOccurance {
    int maxOccuranceNumber(int arr[]) {
        int z = 0, count = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                }
            }
            if (c > z) {
                z = c;
                count = arr[i];
            }
        }

        return count;

    }

    public static void main(String[] args) {
        System.out.println("Enter the size of Array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("You elemets are");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        maxOccurance m = new maxOccurance();
        System.out.println("Max Occuring Number is 10" + m.maxOccuranceNumber(arr));

    }

}
