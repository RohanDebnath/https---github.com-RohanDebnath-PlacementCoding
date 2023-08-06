//contains 1 4 and 9
import java.util.Scanner;
public class ExculdeNumbers {
    static void result(int m, int n) {
        for (m++; m <= n; m++) {
            int digit = m;
            int count = 0;
            int digitcount = 0;
            while (digit > 0) {
                int z = digit % 10;
                digitcount++;
                if (z == 1 || z == 4 || z == 9)
                    count++;
                digit /= 10;
            }
            if (count == digitcount) {
                System.out.println(m);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        result(m, n);
    }
}
