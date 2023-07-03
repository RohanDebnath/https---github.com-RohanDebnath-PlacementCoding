public class MatrixRotation2D {

    public static void leftRotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][0];
            for (int j = 0; j < n - 1; j++) {
                matrix[i][j] = matrix[i][j + 1];
            }
            matrix[i][n - 1] = temp;
        }
    }

    public static void rightRotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            int temp = matrix[i][n - 1];
            for (int j = n - 1; j > 0; j--) {
                matrix[i][j] = matrix[i][j - 1];
            }
            matrix[i][0] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        System.out.println("Original matrix:");
        printMatrix(matrix);

        leftRotate(matrix);
        System.out.println("After left rotation:");
        printMatrix(matrix);

        rightRotate(matrix);
        System.out.println("After right rotation:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
