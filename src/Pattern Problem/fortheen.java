/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
*/
public class fortheen {

    public static void main(String[] args) {
        int n = 7;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(j);
                } else
                    System.out.print(0);
            }
            System.out.println();
        }
    }
}
