public class eight {
    public static void main(String[] args) {
        int rows = 7; // Specify the number of rows for the pattern

        // Loop for each row
        for (int i = 1; i <= rows; i++) {

            // Loop to print the pattern
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // Print numbers in ascending order
            }

            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k); // Print numbers in descending order
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
