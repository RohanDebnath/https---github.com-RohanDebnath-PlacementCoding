import java.util.Scanner;

interface client {
    void input(); // public + abstract
    void output();// public + abstract
}

public class InterfaceExplanation implements client {
    String name;
    double sal;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user name");
        name = sc.nextLine();
        System.out.println("Enter user salarhy");
        sal = sc.nextDouble();
    }

    public void output() {
        System.out.println(name + " " + sal);
    }

    public static void main(String[] args) {
        client obj = new InterfaceExplanation();
        obj.input();
        obj.output();

    }
}
