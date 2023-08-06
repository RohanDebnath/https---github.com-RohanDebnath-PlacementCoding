import java.util.*;

public class Furtherestsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = sc.nextInt();
        }
        int output = farthestSum(len, k, x, arr);
        System.out.println(output);
    }

    public static int farthestSum(int len, int k, int x, int[] arr) {
        // Create a HashMap to store the absolute differences and corresponding elements
        HashMap<Integer, Integer> diffElementMap = new HashMap<>();

        // Calculate the absolute differences and store them in the HashMap
        for (int i = 0; i < len; i++) {
            int absDiff = Math.abs(arr[i] - x);
            diffElementMap.put(absDiff, arr[i]);
        }

        // Create a list to store the sorted absolute differences
        List<Integer> sortedDiffList = new ArrayList<>(diffElementMap.keySet());
        Collections.sort(sortedDiffList, Collections.reverseOrder());

        // Take the sum of the first k elements 
        int farthestSum = 0;
        for (int i = 0; i < k; i++) {
            int absDiff = sortedDiffList.get(i);
            farthestSum += diffElementMap.get(absDiff);
        }

        return farthestSum;
    }
}
