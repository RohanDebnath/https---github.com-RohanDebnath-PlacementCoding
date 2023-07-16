/*
1
2*2
3*3*3
4*4*4*4
5*5*5*5*5
4*4*4*4
3*3*3
2*2
1
*/
import java.util.Scanner;

public class fiftheen {
    void result(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);
                if (j != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {

                System.out.print(i);
                if (j != i) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n;
        System.out.println("Enther the number");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        fiftheen obj = new fiftheen();
        obj.result(n);
    }
}
