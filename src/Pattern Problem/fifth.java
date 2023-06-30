public class fifth {
    /*
     * 7654321
     * 765432
     * 76543
     * 7654
     * 765
     * 76
     * 7
     */

    public static void main(String[] args) {
        int n = 7;

        for (int i = 1; i <= n; i++) {
            for (int j = 7; j >= i; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }

    }

}
