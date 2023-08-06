import java.util.Scanner;

public class QuadraticEq {

    static void result(float input1, float input2, float input3) {
        float disc = (input2 * input2) - (4 * input1 * input3);

        if (disc >= 0) {
            float sqrtDisc = (float) Math.sqrt(disc);
            float x1 = (-input2 + sqrtDisc) / (2 * input1);
            float x2 = (-input2 - sqrtDisc) / (2 * input1);

            System.out.println("Root 1 (x1): " + x1);
            System.out.println("Root 2 (x2): " + x2);
        } else {
            // Calculate the real and imaginary parts for the complex roots
            float realPart = -input2 / (2 * input1);
            float imaginaryPart = (float) Math.sqrt(-disc) / (2 * input1);

            System.out.println("Root 1 (x1): " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 (x2): " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter coefficient a: ");
        float input1 = sc.nextFloat();

        System.out.print("Enter coefficient b: ");
        float input2 = sc.nextFloat();

        System.out.print("Enter coefficient c: ");
        float input3 = sc.nextFloat();

        result(input1, input2, input3);
    }
}
