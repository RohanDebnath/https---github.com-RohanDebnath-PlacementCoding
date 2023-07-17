import java.util.Scanner;

public class Pallendrome {
    int result(int num) {
        int temp = num, z = 0;
        while (temp > 0) {
            int d = temp % 10;
            z = z * 10 + d;
            temp /= 10;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Pallendrome obj = new Pallendrome();
        for (int i = n; i <= m; i++) {
            if (i == obj.result(i))
                System.out.println(obj.result(i));
        }

    }
}
