import java.util.Scanner;

public class BitBinary {
    int result(int n, int set) {
        int sum = 0;
        // System.out.println("Inside method");
        int len = (int) (Math.pow(2, n) - 1);
        for (int i = 1; i <= len; i++) {
            // System.out.println("Inside for loop");
            int k = i;
            int count = 0;
            while (k != 0) {
                if ((k % 2) == 1) {
                    count++;
                }
                k /= 2;
            }
            if (count == set)
                sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int set = sc.nextInt();
        BitBinary obj = new BitBinary();
        // System.out.println("Before object call");
        System.out.println("Answer is: "+obj.result(n, set));
    }
}
