import java.util.Scanner;

public class UncommoncharASCII {

    int checkSum(char array1[], char array2[]) {
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            int c = 0;
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                sum += (int) array1[i];
            }
        }
        for (int i = 0; i < array2.length; i++) {
            int c = 0;
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    c++;
                    break;
                }
            }
            if (c == 0) {
                sum += (int) array2[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of 1st array");
        n = sc.nextInt();
        System.out.println("Size of 2nd Array");
        m = sc.nextInt();
        char[] array1 = new char[n];
        char[] array2 = new char[m];

        System.out.println("Enter the elements of array 1");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = sc.next().charAt(0);
        }
        System.out.println("Enter the elements of array 2");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = sc.next().charAt(0);
        }

        UncommoncharASCII obj = new UncommoncharASCII();
        System.out.println(obj.checkSum(array1, array2));
    }
}