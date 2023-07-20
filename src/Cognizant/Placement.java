import java.util.Scanner;

public class Placement {
    void PlacementReport(int CSE, int ECE, int MECH) {
        int MaxPlace = Math.max(ECE, MECH);
        int MaxPlacement = Math.max(MaxPlace, CSE);
        if (MaxPlacement == CSE)
            System.out.println("CSE");
        if (MaxPlacement == ECE)
            System.out.println("ECE");
        if (MaxPlacement == MECH)
            System.out.println("MECH");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CSE = sc.nextInt();
        int ECE = sc.nextInt();
        int MECH = sc.nextInt();
        Placement obj = new Placement();
        obj.PlacementReport(CSE, ECE, MECH);
    }
}
