import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        System.out.println("Enter num of Sem");
        Scanner sc = new Scanner(System.in);
        int sem = sc.nextInt();
        int semarray[] = new int[sem];
        for (int i = 0; i < semarray.length; i++) {
            System.out.println("Enter the number of subject in " + (i+1) + " sem");
            semarray[i] = sc.nextInt();
        }
        for (int i = 0; i < semarray.length; i++) {
            int marks[] = new int[semarray[i]];
            System.out.println("Enter the marks for sem " + (i + 1));
            for (int j = 0; j < semarray[i]; j++) {
                marks[j] = sc.nextInt();
            }
            int max = 0;
            for (int j = 0; j < semarray[i]; j++) {
                if (max < marks[j])
                    max = marks[j];
            }
            System.out.println(max);
        }
    }
}
