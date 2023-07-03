public class ArrayRotation {

    public static void leftRotate(int[] array) {
        int n = array.length;
        int temp = array[0];
        for (int i = 0; i < n - 1; i++) {
            array[i] = array[i + 1];
        }
        array[n - 1] = temp;
    }

    public static void rightRotate(int[] array) {
        int n = array.length;
        int temp = array[n - 1];
        for (int i = n - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };

        System.out.println("Original array:");
        printArray(array);

        leftRotate(array);
        System.out.println("After left rotation:");
        printArray(array);

        rightRotate(array);
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
