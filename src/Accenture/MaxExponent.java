import java.util.Scanner;

public class MaxExponent {
    int result(int a, int b) {
        int countval = 0, num = Integer.MIN_VALUE;
        for (int i = a; i <= b; i++) {
            int count = 0;
            if (i % 2 == 0) {
                int temp = i;
                while (temp > 0) {
                    count++;
                    temp /= 2;
                }
                if (count > countval) {
                    countval = count;
                    num = i;
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        MaxExponent obj = new MaxExponent();
        System.out.println(obj.result(a, b));

    }
}
