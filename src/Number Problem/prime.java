import java.util.Scanner;

public class prime {

    void checkPrime(int n) {
        int c = 0;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c == 0)
            System.out.println("Prime");
        else
            System.out.println("No");

    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        prime obj = new prime();
        obj.checkPrime(n);

    }

}
