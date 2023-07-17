import java.util.Scanner;

public class DistenceFormula {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat();
        float b= sc.nextFloat();
        float c= sc.nextFloat();
        float d= sc.nextFloat();
        System.out.println(Math.sqrt(Math.pow((c-a), 2)+Math.pow(d-b, 2)));
    }
}
