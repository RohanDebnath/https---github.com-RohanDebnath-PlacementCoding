import java.util.Scanner;

public class ArrayUserRotation1D {

    public static void leftRotate(int[] array, int rotations) {
        int n = array.length;
        rotations %= n; // Adjust rotations if it's greater than array length
        for (int i = 0; i < rotations; i++) {
            int temp = array[0];
            for (int j = 0; j < n - 1; j++) {
                array[j] = array[j + 1];
            }
            array[n - 1] = temp;
        }
    }

    public static void rightRotate(int[] array, int rotations) {
        int n = array.length;
        rotations %= n; // Adjust rotations if it's greater than array length
        for (int i = 0; i < rotations; i++) {
            int temp = array[n - 1];
            for (int j = n - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }
            array[0] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotations: ");
        int rotations = sc.nextInt();

        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println("Original array:");
        printArray(array);

        leftRotate(array, rotations);
        System.out.println("After left rotation:");
        printArray(array);

        rightRotate(array, rotations);
        System.out.println("After right rotation:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}