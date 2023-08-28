import java.util.Scanner;

public class WallPaintingCost {
    static float result(float extArr[], float intArr[]) {
        float extSum = 0, intSum = 0;
        for (float i : extArr) {
            extSum += i;
        }
        for (float i : intArr) {
            intSum += i;
        }
        return ((intSum * 18) + (extSum * 12));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nInt = sc.nextInt();
        int nExt = sc.nextInt();
        float extArr[] = new float[nExt];
        float intArr[] = new float[nInt];
        System.out.println("Provide Input for Interior Wall");
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = sc.nextFloat();
        }
        System.out.println("Provide Input for Exterior Wall");
        for (int i = 0; i < extArr.length; i++) {
            extArr[i] = sc.nextFloat();
        }

        System.out.println(result(extArr, intArr));

    }
}
