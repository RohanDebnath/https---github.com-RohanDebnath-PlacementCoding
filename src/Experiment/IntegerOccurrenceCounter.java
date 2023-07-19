import java.util.*;

public class IntegerOccurrenceCounter {
    public static void countIntegerOccurrences(int[] arr) {
        Map<Integer, Integer> occurrenceMap = new HashMap<>();

        for (int num : arr) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            System.out.println(number + " occurs " + count + " time" + (count > 1 ? "s" : ""));
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 1, 4, 5, 1, 2 };
        countIntegerOccurrences(arr);
    }
}
