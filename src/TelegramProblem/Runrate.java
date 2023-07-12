import java.util.Scanner;

public class Runrate {
    public static void main(String[] args) {
        float teamOneRun, teamTwoRun, teamTwoOver, maxOver;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Maximum number of overs");
        maxOver = sc.nextInt();
        System.out.println("Enter the run scored by Team 1 as Target");
        teamOneRun = sc.nextInt();
        System.out.println("Enter The over playes by team 2");
        teamTwoOver = sc.nextInt();
        System.out.println("Enter the run scored by team two");
        teamTwoRun = sc.nextInt();
        float overLeft = maxOver - teamTwoOver;
        float runleft = teamOneRun - teamTwoRun;
        System.out.println("Run rate needed :" + (runleft / overLeft));
    }
}
