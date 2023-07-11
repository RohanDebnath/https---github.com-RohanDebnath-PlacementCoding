import java.util.Scanner;

public class Nprime {
    void result(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0)
                    count++;
            }
            if (count == 0) {
                // System.out.print(i + " ");
                // System.out.print(",");
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(i);
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number up to which you want to find prime numbers:");
        n = sc.nextInt();
        Nprime obj = new Nprime();
        obj.result(n);
    }
}
