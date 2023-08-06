import java.util.Scanner;

public class SelectionSortt {
    static int result(int arr[]) {
        int c = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            if (smallest != i) {
                arr[i] = arr[i] ^ arr[smallest];
                arr[smallest] = arr[i] ^ arr[smallest];
                arr[i] = arr[i] ^ arr[smallest];
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(result(arr));
    }
}
