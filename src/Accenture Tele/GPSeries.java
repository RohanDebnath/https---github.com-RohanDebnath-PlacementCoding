import java.util.Scanner;

public class GPSeries {
    static double result(int st, int tr, int n) {
        int r =  tr / st;
        int a = st;
        return a * Math.pow(r, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int st = sc.nextInt();
        int tt = sc.nextInt();
        System.out.println(result(st, tt, n));
    }
}
