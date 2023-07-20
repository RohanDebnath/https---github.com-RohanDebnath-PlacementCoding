import java.util.Scanner;

public class HallTicket {

    String result(int NoofTicket, char Refreshment, char CouponCode, char Circle) {
        StringBuilder sb = new StringBuilder();
        float Sum = 0;
        if (NoofTicket > 4 && NoofTicket < 41) {
            if (Circle == 'k') {
                Sum = NoofTicket * 75;
                if (NoofTicket > 20)
                    Sum -= ((float) (10 / 100) * Sum);

                if (Refreshment == 'y')
                    Sum += (50 * NoofTicket);

                if (CouponCode == 'y')
                    Sum -= ((float) (2 / 100) * Sum);

            } else if (Circle == 'q') {
                Sum = NoofTicket * 150;
                if (NoofTicket > 20)
                    Sum -= ((float) (10 / 100) * Sum);

                if (Refreshment == 'y')
                    Sum += (50 * NoofTicket);

                if (CouponCode == 'y')
                    Sum -= ((float) (2 / 100) * Sum);
            } else {
                return ("Invalid Input");
            }

        } else {
            return ("Minimun of 5 Maximun of 40 Ticket");
        }
        sb.append(Sum);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NoofTicket = sc.nextInt();
        char Refreshment = sc.next().charAt(0);
        char CouponCode = sc.next().charAt(0);
        char Circle = sc.next().charAt(0);
        HallTicket obj = new HallTicket();
        System.out.println(obj.result(NoofTicket, Refreshment, CouponCode, Circle));
    }
}
