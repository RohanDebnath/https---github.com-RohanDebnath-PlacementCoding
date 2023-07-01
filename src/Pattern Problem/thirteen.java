/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
*/

public class thirteen {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            int k = i % 2;
            for (int j = 1; j <= n; j++) {
                switch (k) {
                    case 0:
                        if (j % 2 == 1)
                            System.out.print(0);
                        else
                            System.out.print(1);
                        break;
                    case 1:
                        if (j % 2 == 0)
                            System.out.print(0);
                        else
                            System.out.print(1);
                        break;

                }

            }
            System.out.println();
        }
    }

}
