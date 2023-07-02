import java.util.Scanner;

public class Perfect {

    void checkPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n)
            System.out.println(n);
        // return n;
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Perfect obj = new Perfect();
        obj.checkPerfect(n);

    }
}
