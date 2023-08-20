import java.util.Scanner;

public class CarWheel {
    static void result(int v, int w)
    {
        int temp_wheel=w-v*2;
        temp_wheel/=2;
        int tw=v-temp_wheel;
        System.out.println("TW= "+tw);
        System.out.println("FW= "+temp_wheel);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v=sc.nextInt();   
        int w=sc.nextInt();  
        result(v, w);
    }
    
}
