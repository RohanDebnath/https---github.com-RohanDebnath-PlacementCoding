/*
1234567
123456
12345
1234
123
12
1
12
123
1234
12345
123456
1234567 */
public class fourth {
    public static void main(String[] args) {
        int n = 7;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}