import java.util.Scanner;

public class ArrayFrequency {
    void result(int arr[]) {
        int MaxValue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            MaxValue = Math.max(MaxValue, arr[i]);
        }
        int occureanceArray[] = new int[MaxValue + 1];
        for (int i = 0; i < arr.length; i++) {
            occureanceArray[arr[i]]++;
        }
        for (int i = 0; i < occureanceArray.length; i++) {
            if(occureanceArray[i]>0)
            System.out.println(i + " occurs " + occureanceArray[i] + " time" + (occureanceArray[i] > 1 ? "s" : ""));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter you elements one by one");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayFrequency obj = new ArrayFrequency();
        obj.result(arr);
    }
}
