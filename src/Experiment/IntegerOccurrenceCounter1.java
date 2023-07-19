public class IntegerOccurrenceCounter1 {
    public static void countIntegerOccurrences(int[] arr) {
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxNumber = Math.max(maxNumber, arr[i]);
        }

        int[] occurrenceArray = new int[maxNumber + 1];

        for (int i = 0; i < arr.length; i++) {
            occurrenceArray[arr[i]]++;
        }

        for (int i = 0; i <= maxNumber; i++) {
            if (occurrenceArray[i] > 0) {
                System.out.println(i + " occurs " + occurrenceArray[i] + " time" + (occurrenceArray[i] > 1 ? "s" : ""));
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 4, 1, 4, 5, 1, 2 ,2, 2};
        countIntegerOccurrences(arr);
    }
}
