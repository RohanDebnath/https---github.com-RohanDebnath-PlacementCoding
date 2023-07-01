/*
1234567
 234567
  34567
   4567
    567
     67
      7
     67
    567
   4567
  34567
 234567
1234567
*/

public class nine {

    public static void main(String[] args) {
        int n = 7;
        int x = n - 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= 7; k++) {
                System.out.print(k);
            }
            System.out.println("");
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = x; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println("");
            x--;
        }
    }
}
