/*
1
121
12321
1234321
123454321
12345654321
1234567654321
 */
public class eight {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = i - 1; k > 0; k--) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}
