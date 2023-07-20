import java.util.Scanner;

public class LuckyNumber {
    String result(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 10) {
            int d = temp % 10;
            sum += d;
            temp /= 10;
        }
        if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0)
            return "Lucky Number";
        return "Not a Lucky Number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        LuckyNumber obj = new LuckyNumber();
        System.out.println(obj.result(num));
    }
}
