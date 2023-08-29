import java.util.Scanner;

public class ChainMarketing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SchemeAmount = 5000;
        System.out.println("Enter the name of parent");
        String parent = sc.nextLine();
        System.out.println("Does he has Children?");
        String decision = sc.nextLine();
        if (decision.equals("Y")) {
            System.out.println("How many children?");
            int n = sc.nextInt();
            sc.nextLine();      //Buffer Spotted
            String arr[] = new String[n];
            System.out.println("Enter the name of Children one by one");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextLine();
            }
            System.out.println("Output");
            System.out.println("TOTAL MEMBERS= " + ((arr.length) + 1));
            System.out.println("COMMISSION DETAILS");
            System.out.println(parent + ": " + ((5000 * 0.1)+n*250) + " INR");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + ": " + (0.05 * 5000) + " INR");
            }
        }

    }

}
