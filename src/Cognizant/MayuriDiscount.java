import java.util.Scanner;

public class MayuriDiscount {
    String result(String arr[]) {
        double MaxDiscount = 0.0;
        int index = 0;
        String retu = "";
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            String SubArr[] = str.split(",");
          //  int disc = (Integer.parseInt(SubArr[2]) / 100) * Integer.parseInt(SubArr[1]);
            double disc = (Integer.parseInt(SubArr[2])  * Integer.parseInt(SubArr[1]))/100;
            if (disc > MaxDiscount) {
                MaxDiscount = disc;
                index = i;
                retu = SubArr[0];
            }

        }
        return retu;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        MayuriDiscount obj = new MayuriDiscount();
        System.out.println(obj.result(arr));
    }
}
