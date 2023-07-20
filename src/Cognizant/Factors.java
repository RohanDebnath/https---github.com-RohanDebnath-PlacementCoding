import java.util.Scanner;

public class Factors {
    void result(int num) {
        int comma = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (comma != 0) {
                    System.out.print(",");
                }
                System.out.print(i);
                comma++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factors obj = new Factors();
        obj.result(num);
    }
}
