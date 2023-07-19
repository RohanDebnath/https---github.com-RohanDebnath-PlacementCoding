import java.util.Scanner;

public class CarWheel {
    int result(int Fwheel, int Twheel)
    {
        return ((Fwheel*4)+(Twheel*2));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Fwheel=sc.nextInt();
        int Twheel=sc.nextInt();
        CarWheel obj = new CarWheel();
        System.out.println(obj.result(Fwheel, Twheel));

    }    
}
