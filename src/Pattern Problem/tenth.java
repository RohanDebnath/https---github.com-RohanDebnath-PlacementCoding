/*
  1 2 3 4 5 6 7 
  2 3 4 5 6 7
   3 4 5 6 7
    4 5 6 7
     5 6 7
      6 7
       7
      6 7
     5 6 7
    4 5 6 7
   3 4 5 6 7
  2 3 4 5 6 7
 1 2 3 4 5 6 7
*/
public class tenth {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k);
                System.out.print(" ");

            }
            System.out.println("");
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print(k);
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}
